package JavaExercicios2;
import java.util.Scanner;

//Criar um programa que leia pelo teclado três notas n1 e n2 e n3 de um aluno,
//calcule a m�dia e exiba na tela se o aluno foi APROVADO ou REPROVADO. 
//OBS.: A m�dia base para aprovada é de 6.0

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Criar leitura das variaveis
		double n1, n2, n3, media, base = 6.0;
		
		//Impressão da leitura das variaveis
		System.out.printf("Digite a 1� nota: ");
		n1 = leitor.nextDouble();
		
		System.out.printf("Digite a 2� nota: ");
		n2 = leitor.nextDouble();
		
		System.out.printf("Digite a 3� nota: ");
		n3 = leitor.nextDouble();
		
		//Calculo da media	
		media = (n1 + n2 + n3) / 2;
		
		//Mostrar ou exibir o calculo para ver se foi aprovado ou reprovado
		if (media >= base) {
			System.out.printf("M�dia: %s\nAluno Aprovado", media);
		} else {
			System.out.printf("M�dia: %s\nAluno Reprovado", media);
		}

	}

}