package funcionarios;

public class PessoaJuridica implements Funcionario1 {
	double valorBruto = 15000.00;
	double imposto = 5000.00;
	double salario = valorBruto - imposto;

	@Override
	public long id() {
		System.out.println(03);
		return 0;
	}
	@Override
	public void nome() {
		System.out.println("Kaique");
	}
	@Override
	public int telefone() {
		System.out.println(156507858);
		return 0;
	}
	@Override
	public int matricula() {
		System.out.println(03);
		return 0;
	}
	@Override
	public void endereco() {
		System.out.println("lá do lado");
	}
	@Override
	public void calculaSalario() {
		System.out.println(salario);
	}
}