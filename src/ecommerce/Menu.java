package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.ecommerceController;
import ecommerce.model.Jogos;
import ecommerce.model.Perfumaria;

public class Menu {

	public static void main(String[] args) {

		ecommerceController produtos = new ecommerceController();
		
		Scanner sc = new Scanner(System.in);

		String nome, marca, plataforma, genero;
		int categoria;
		double preco;
		int opc, quantidade, volume, id;

		while (true) {

			System.out.println("\n*** Menu do E-commerce ***\n");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Listar todos os produtos");
			System.out.println("3 - Buscar produto por ID");
			System.out.println("4 - Atualizar dados do produto");
			System.out.println("5 - Deletar produto");
			System.out.println("0 - Encerrar");
			System.out.println("\n*** Fim do Menu do E-commerce ***\n");
			System.out.print("Escolha uma opção: ");

			try {
				opc = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				sc.nextLine();
				opc = 0;
			}

			if (opc == 0) {
				System.out.println(
						"\nAgradecemos por utilizar o nosso e-commerce. Esperamos que sua experiência tenha sido excelente!");
				sobre();
				sc.close();
				System.exit(0);
			}

			switch (opc) {
			case 1:
				System.out.println("Cadastrar produto\n\n");
				keyPress();
				
				do {
					System.out.println("Digite a categoria do produto (1 - Jogos ou 2 - Perfumaria): ");
					categoria = sc.nextInt();
				} while (categoria < 1 || categoria > 2);
				
				switch(categoria) {
					case 1 -> {
						System.out.println("Nome do jogo: ");
						sc.nextLine();
						nome = sc.nextLine();
						System.out.println("Digite o preço: ");
						preco = sc.nextDouble();
						System.out.println("Digite a quantidade: ");
						quantidade = sc.nextInt();
						System.out.println("Digite a plataforma: ");
						plataforma = sc.nextLine();
						System.out.println("Digite o gênero: ");
						genero = sc.nextLine();
						produtos.cadastrarProduto(new Jogos(produtos.gerarId(), nome, categoria, preco, quantidade, plataforma, genero));
					}
					case 2 -> {
						System.out.println("Nome do perfume: ");
						sc.nextLine();
						nome = sc.nextLine();
						System.out.println("Digite o preço: ");
						preco = sc.nextDouble();
						System.out.println("Digite a quantidade: ");
						quantidade = sc.nextInt();
						System.out.println("Digite a marca: ");
						marca = sc.nextLine();
						System.out.println("Digite o volume: ");
						volume = sc.nextInt();
						produtos.cadastrarProduto(new Perfumaria(produtos.gerarId(), nome, categoria, preco, quantidade, marca, volume));
					}
				}
				
				break;
			case 2:
				System.out.println("Listar todos os produtos\n\n");
				produtos.listarProdutos();
				keyPress();
				break;
			case 3:
				System.out.println("Buscar produto por ID\n\n");
				
				System.out.println("Digite o ID do produto: ");
				id = sc.nextInt();
				
				produtos.buscarPorId(id);
				
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar dados do produto\n\n");
				
				System.out.println("Digite o id do Produto: ");
				id = sc.nextInt();
				
				var buscaProduto = produtos.buscarNaCollection(id);
				
				if(buscaProduto != null) {
					
					categoria = buscaProduto.getCategoria();
					
					switch(categoria) {
						case 1 -> {
							System.out.println("Nome do jogo: ");
							sc.nextLine();
							nome = sc.nextLine();
							System.out.println("Digite o preço: ");
							preco = sc.nextDouble();
							System.out.println("Digite a quantidade: ");
							quantidade = sc.nextInt();
							System.out.println("Digite a plataforma: ");
							plataforma = sc.nextLine();
							System.out.println("Digite o gênero: ");
							genero = sc.nextLine();
							produtos.atualizarProduto(new Jogos(id, nome, categoria, preco, quantidade, plataforma, genero));
						}
						case 2 -> {
							System.out.println("Nome do perfume: ");
							sc.nextLine();
							nome = sc.nextLine();
							System.out.println("Digite o preço: ");
							preco = sc.nextDouble();
							System.out.println("Digite a quantidade: ");
							quantidade = sc.nextInt();
							System.out.println("Digite a marca: ");
							marca = sc.nextLine();
							System.out.println("Digite o volume: ");
							volume = sc.nextInt();
							produtos.atualizarProduto(new Perfumaria(id, nome, categoria, preco, quantidade, marca, volume));
						} 
						default -> {
							System.out.println("Tipo de conta inválido!");
						}
					}
					
				} else {
					System.out.println("A Conta não foi encontrada!");
				}
				
				keyPress();
				break;
			case 5:
				System.out.println("Deleter produto\n\n");
				
				System.out.println("Digite o ID do produto: ");
				id = sc.nextInt();
				
				produtos.deletarProduto(id);
				
				keyPress();
				break;
			default:
				System.out.println("\nOpção inválida!\n");
				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n=======================================================");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("João Espósito");
		System.out.println("github.com/jovesposito");
		System.out.println("=======================================================");
	}

	public static void keyPress() {
		try {
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}