package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {

	private String usuario;
	private String senha;
	private String mensagem;
	
	public void logar() {
		if (usuario.equals("FIAP") && senha.equals("FIAP2019")) {
			System.out.println("Logado!");
			mensagem = "Logado com sucesso!";
		}else {
			System.out.println("Usuário e/ou senha inválidos");
			mensagem = "Usuário e/ou senha inválidos";
		}
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
