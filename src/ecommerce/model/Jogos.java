package ecommerce.model;

public class Jogos extends Produto {

	private String plataforma;
	private String genero;

	public Jogos(int id, String nome, int categoria, double preco, int quantidade, String plataforma,
			String genero) {
		super(id, nome, categoria, preco, quantidade);
		this.plataforma = plataforma;
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public void visualizarProduto() {
		super.visualizarProduto();
		System.out.println("Plataforma: " + this.plataforma);
		System.out.println("Gênero: " + this.genero);
		System.out.println();
	}

}
