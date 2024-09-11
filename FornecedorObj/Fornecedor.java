package FornecedorObj;

public class Fornecedor {
	String razaoSocial,nomeFantasia,cnpj,endereco,mail,inscricaoEstadual, vender;
	int id, telefone;
	//sem metodos

	public String getRazaoSocial() {
		return razaoSocial;
	}public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}public String getNomeFantasia() {
		return nomeFantasia;
	}public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}public String getCNPJ() {
		return cnpj;
	}public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}public String getEndereco() {
		return endereco;
	}public void setEndereco(String endereco) {
		this.endereco = endereco;
	}public String getMail() {
		return mail;
	}public void setMail(String mail) {
		this.mail = mail;
	}public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}public int getID() {
		return id;
	}public void setID(int id) {
		this.id = id;
	}public int setTelefone() {
		return telefone;
	}public void getTelefone(int telefone) {
		this.telefone = telefone;
	}public String getVender() {
		return 	vender;
	}public void setVender(String vender) {
		this.vender = vender;
	}
}