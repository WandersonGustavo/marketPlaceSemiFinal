package marketPlace.Poo.Dois;

public class Books {
	
	//atributos do produto alvo
	private String titulo;
	private double preco;
	private double valorFrete;
	private int codigo;
	
	//construtor com campos 
	public Books(String titulo, double preco, double valorFrete, int codigo) {
		super();
		this.titulo = titulo;
		this.preco = preco;
		this.valorFrete = valorFrete;
		this.codigo = codigo;
	}
	
	//metodos get e set's
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	

}
