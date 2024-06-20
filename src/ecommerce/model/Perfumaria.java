package ecommerce.model;

public class Perfumaria extends Produto {

	private String marca;
	private int volume;

	public Perfumaria(int id, String nome, int categoria, double preco, int quantidade, String marca, int volume) {
		super(id, nome, categoria, preco, quantidade);
		this.marca = marca;
		this.volume = volume;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void visualizarProduto() {
		super.visualizarProduto();
		System.out.println("Marca: " + this.marca);
		System.out.println("Volume: " + this.volume + " ml");
	}

}