// Acrescentar Metodo para c�lculo de pre�o de c�pias para alunos e demais pessoas.

import java.util.Date;

// Classe Pessoa ao qual vai ser a classe pai para extender as outras classes.
public class Pessoa {
	public String nome;
	public String cpf;
	public Date data_atual;

	public Pessoa(String _nome, String _cpf, Date _data) {
		
		//Variavel construtor
		this.nome = _nome;
		this.cpf = _cpf;
		this.data_atual = _data;
	}
	  public double tirarCopias(int qtd) { 
		  //Retorna o pre�o normal para tirar copias para alunos 
		return 0.10 * (double) qtd;
   }
}	  
	