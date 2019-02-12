package br.com.fiap.revisao.dao;

import br.com.fiap.revisao.bean.Funcionario;

//Interface pode herdar de uma ou mais interfaces
public interface FuncionarioDAO {

	void cadastrar(Funcionario f);
	void atualizar(Funcionario f);
	void remover(int id);
	
}