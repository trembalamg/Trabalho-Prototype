package Prototype;
public class K10 extends LGPrototype {

	
	protected K10 (K10 cel) {
	this.tela = "LCD 5,3pol";
	this.valorVenda = cel.getValorVenda();
}


public K10() {
	
	}


public String infoCel() {
	
	System.out.println("O aparelho LG K10 tem tela " + this.tela + " e custa " + getValorVenda());
	return null;
}


public LGPrototype clonar() {
	
	return new K10 (this);
}



}
