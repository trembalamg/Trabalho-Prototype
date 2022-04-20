package Prototype;
public class iPhone extends ApplePrototype{

	protected iPhone (iPhone cel) {
	this.tela = "Oled 5,4pol";
	this.valorVenda = cel.getValorVenda();
}


public iPhone() {
	
	}


public String infoCel() {
	
	System.out.println("O aparelho iPhone 12 tem tela " + this.tela + " e custa " + getValorVenda());
	return null;
}


public ApplePrototype clonar() {
	
	return new iPhone (this);
}



}