package usuarioObj;

public class Usuario {
	String 	nome, permissao,usuario, cadastro, compra, login;
	int id, password;
	
	public String getNome() {
		return nome;
	}public void setNome(String nome) {
		this.nome = nome;
	}public String getPermissao() {
		return permissao;
	}public void setPermissao(String permissao) {
		this.permissao = permissao;
	}public String getUsuario() {
		return usuario;
	}public void setUsuario(String usuario) {
		this.usuario = usuario;
	}public int getID() {
		return id;
	}public void setID(int id) {
		this.id = id;
	}public int getPassword() {
		return password;
	}public void setPassword(int password) {
		this.password = password;
	}public String getCadastro() {
		return cadastro;
	}public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}public String getCompra() {
		return compra;
	}public void setCompra(String compra) {
		this.compra = compra;
	}public String getLogin() {
		return login;
	}public void setLogin(String login) {
		this.login = login;
	}
}