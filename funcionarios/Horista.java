package funcionarios;

public class Horista implements Funcionario1{
	double valorHora = 55.00;
	double quantidadeHoras = 56.00;
	double salario = valorHora*quantidadeHoras;
	@Override
	public long id() {
		System.out.println(02);
		return 0;
	}
	@Override
	public void nome() {
		System.out.println("Daniel");	}
	@Override
	public int telefone() {
		System.out.println(154829632);		
		return 0;
	}
	@Override
	public int matricula() {
		System.out.println(02);
		return 0;
	}
	@Override
	public void endereco() {
		System.out.println("logo lá");
	}
	@Override
	public void calculaSalario() {
		System.out.println(salario);

	}
}