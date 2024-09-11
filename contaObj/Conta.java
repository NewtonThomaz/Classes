package contaObj;

public class Conta {
	String tipoConta,sacar, depositar;
	int id;
	double saldo;
	
	public String getTpoConta() {
		return tipoConta;
	}public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}public int getId () {
		return id;
	}public void setId(int id) {
		this.id = id;
	}public double getSaldo() {
		return saldo;
	}public void setSaldo(double saldo) {
		this.saldo = saldo;
	}public String getSacar() {
		return sacar;
	}public void setSacar(String sacar) {
		this.sacar = sacar;
	}public String getDepositar() {
		return depositar;
	}public void setDepositar(String depositar) {
		this.depositar = depositar;
	}
}