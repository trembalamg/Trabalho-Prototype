package Prototype;
public class S22 extends SamsungPrototype {

	
		protected S22 (S22 cel) {
		this.tela = "Oled 6,1pol";
		this.valorVenda = cel.getValorVenda();
	}
	
	
	public S22() {
		
		}


	public String infoCel() {
		
		System.out.println("O aparelho Samsung S22 tem tela " + this.tela + " e custa " + getValorVenda());
		return null;
	}

	
	public SamsungPrototype clonar() {
		
		return new S22 (this);
	}
	
	

}
