package classeAbstrata;

public class Main {

	public static void main(String[] args) {
		Programador p = new Programador(1000);
		Designer d = new Designer(2000);
		p.reajustar();
		d.reajustar();

	}

}
