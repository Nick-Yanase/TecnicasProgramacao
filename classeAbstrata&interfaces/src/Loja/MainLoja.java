package Loja;

public class MainLoja {

	public static void main(String[] args) {
		LojaShopping ls = new LojaShopping("91919191", "sempre ir pr tras", true, "rua raul", "raul" );
		System.out.println(ls);
		
		System.out.println(ls.registra_abertura_dia());
		
	}

}
