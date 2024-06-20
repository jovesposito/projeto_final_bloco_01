package ecommerce.repository;

import ecommerce.model.Produto;

public interface ecommerceRepository {

	public void cadastrarProduto(Produto produto);
	public void listarProdutos();
	public void buscarPorId(int id);
	public void atualizarProduto(Produto produto);
	public void deletarProduto(int id);

}