package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opc;
		
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
		
            opc = sc.nextInt();
            
            if (opc == 0) {
            	System.out.println("\nAgradecemos por utilizar o nosso e-commerce. Esperamos que sua experiência tenha sido excelente!");
            	sobre();
            	sc.close();
            	System.exit(0);
            }
            
            switch (opc) {
            	case 1:
            		System.out.println("Cadastrar produto\n\n");
            		break;
            	case 2:
            		System.out.println("Listar todos os produtos\n\n");
            		break;
            	case 3:
            		System.out.println("Buscar produto por ID\n\n");
            		break;
            	case 4:
            		System.out.println("Atualizar dados do produto\n\n");
            		break;
            	case 5:
            		System.out.println("Deleter produto\n\n");
            		break;
            	default:
            		System.out.println("\nOpção inválida!\n");
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
}