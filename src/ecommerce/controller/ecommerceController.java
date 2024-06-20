package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;
import ecommerce.repository.ecommerceRepository;

public class ecommerceController implements ecommerceRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;

	@Override
	public void cadastrarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto " + produto.getId() + " foi cadastrado na categoria " + produto.getCategoria()
				+ " com sucesso!");

	}

	@Override
	public void listarProdutos() {
		for (var produto : listaProdutos) {
			produto.visualizarProduto();
		}

	}

	@Override
	public void buscarPorCategoria(int categoria) {
		for (var produto : listaProdutos) {
            if (produto.getCategoria() == categoria) {
                produto.visualizarProduto();
            }
        }
	}
	
	@Override
	public void buscarPorId(int id) {
		var produto = buscarNaCollection(id);

		if (produto != null) {
			produto.visualizarProduto();
		} else {
			System.out.println("\nO produto id: " + id + " não foi encontrado!");
		}
	}

	@Override
	public void atualizarProduto(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getId());

		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto id: " + produto.getId() + " foi atualizado com sucesso!");
		} else {
			System.out.println("\nO produto id: " + produto.getId() + " não foi encontrado!");
		}

	}

	@Override
	public void deletarProduto(int id) {
		var produto = buscarNaCollection(id);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true) {
				System.out.println("\nO produto id: " + id + " foi deletado com sucesso!");
			}
		} else {
			System.out.println("\nO produto id: " + id + " não foi encontrado!");
		}
	}

	public int gerarId() {
		return ++id;
	}

	public Produto buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
}