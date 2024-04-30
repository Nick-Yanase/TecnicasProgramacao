package classeAbstrata;

public class Programador extends Funcionario{
	
	public Programador(double salario) {
		this.salario=salario;
	}
	@Override 
	public void reajustar() {
		 this.salario = this.salario+(this.salario *(0.20));
		 System.out.println(this.salario);
	}
}
