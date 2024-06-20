package ecommerce.model;

public abstract class Produto {
	private int id;
	private String nome;
	private String categoria;
	private double preco;
	private int quantidade;
	
	public Produto(int id, String nome, String categoria, double preco, int quantidade) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void visualizarProduto() {
		System.out.println("Informações do produto:");
        System.out.println("ID: " + id);
        System.out.println("Categoria: " + categoria);
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Preço: R$ %.2f\n", preco);
	}
	
	
}