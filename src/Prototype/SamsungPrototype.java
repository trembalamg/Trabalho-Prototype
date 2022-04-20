package Prototype;

public abstract class SamsungPrototype {

	protected double valorVenda;
	protected String tela;

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getTela() {
		return tela;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}

	public abstract String infoCel();

	public abstract SamsungPrototype clonar();

}
