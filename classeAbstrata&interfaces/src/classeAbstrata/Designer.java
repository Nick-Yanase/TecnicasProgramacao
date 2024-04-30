package classeAbstrata;

public class Designer extends Funcionario{

	public Designer(double salario) {
		this.salario=salario;
	}
	@Override 
	public void reajustar() {
		 this.salario = this.salario+(this.salario *(0.10));
		 System.out.println(this.salario);
	}
}
