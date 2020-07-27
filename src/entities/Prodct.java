package entities;

public class Prodct {

	private int code;
	private String name;
	private double valor;
	
	public Prodct() {
	}
	
	public Prodct(int code, String name, double valor) {
		this.code = code;
		this.name = name;
		this.valor = valor;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Código: " 
				+ code 
				+ "\nProduto: " 
				+ name 
				+ "\nValor: " 
				+ String.format("%.2f", valor);
	}
	
	
	
}
