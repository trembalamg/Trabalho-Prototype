package Prototype;

public class Main {

	public static void main(String[] args) {

		S22 S22 = new S22();
		SamsungPrototype S22novo = S22.clonar();
		S22novo.setValorVenda(3799);
		S22novo.infoCel();

		K10 K10 = new K10();
		LGPrototype K10novo = K10.clonar();
		K10novo.setValorVenda(799);
		K10novo.infoCel();

		iPhone iPhone = new iPhone();
		ApplePrototype iPhonenovo = iPhone.clonar();
		iPhonenovo.setValorVenda(5419);
		iPhonenovo.infoCel();

	}
}
