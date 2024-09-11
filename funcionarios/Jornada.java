package funcionarios;

public class Jornada implements Funcionario1{

	double salarioHora = 45.00;
	double horasTrabalhadas = 100.00;
	double salario = (salarioHora * horasTrabalhadas); 

	@Override
	public long id() {
		System.out.println(01);
		return 0;
	}
	@Override
	public void nome() {
		System.out.println("André");
	}
	@Override
	public int telefone() {
		System.out.println(155048765);
		return 0;
	}
	@Override
	public int matricula() {
		System.out.println(01);
		return 0;
	}
	@Override
	public void endereco() {
		System.out.println("logo ali");
	}
	@Override
	public void calculaSalario() {
		System.out.println(salario);
	}
}