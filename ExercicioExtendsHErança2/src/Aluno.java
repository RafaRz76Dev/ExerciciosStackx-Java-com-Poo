//// Acrescentar Metodo para c�lculo de pre�o de c�pias para alunos

import java.util.Date;

  // Classe heran�a como se extendesse de pai pra filho,
  // --> aqui vai ser de aluno para pessoa
   public class Aluno extends Pessoa {
	
	public Aluno(String _nome, String _cpf, Date _data) {
	
		super(_nome, _cpf, _data);
	}
	 public String matricula;
	 public double tirarCopias(int qtd) { 
		 //Pre�o para tirar copias para alunos a partir de 10 c�pias
		return 0.07 * (double) qtd;
	 }
   }   
   	
       