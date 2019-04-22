package br.com.fiap.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.fiap.bo.JogoBO;
import br.com.fiap.to.Jogo;

@ManagedBean
public class JogoBean {

	private Jogo jogo;
	private JogoBO bo;
	
	@PostConstruct //método chamado automáticamente 
	public void iniciar() {
		bo = new JogoBO();
		jogo = new Jogo();
	}
	
	public List<Jogo> listar(){
		return bo.listar();
	}
	
	public void cadastrar() {
		bo.cadastrar(getJogo());
		FacesMessage msg = new FacesMessage("Cadastrado!");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		
		System.out.println("Cadastrou! " + getJogo().getNome());
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	
}