import java.util.Scanner;

/*
import java.text.DecimalFormat;
import java.util.Scanner;

/*
  Uma empresa decidiu dar uma gratifica��o de Natal a seus funcion�rios, baseada no 
  n�mero de horas extras e no n�mero de horas que o funcion�rio faltou ao trabalho. 
  O valor do pr�mio � obtido pela consulta na tabela a seguir, em que:
H = n�mero de horas extras � (2/3 * ( n�mero de horas falta ))

Fa�a um programa que receba o n�mero de horas extras e o n�mero de horas-falta de um funcion�rio 
e imprima o valor de sua gratifica��o.


 */

//       Entrada                           Sa�da
//Hrs Extras =  4000                   Horas Totais =       3998,67
//Hrs Faltas     10

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

//       Vari�veis
		double HExtras;
		double HFaltas;
		
		double a,b,div;
		a = 2;
		b = 3;		
	    div = a/b;
		
		// Fazer leitura e imprimir HExtras e Faltas
		System.out.printf("Entre com as Horas Extras:");
		HExtras = leitor.nextDouble();

		System.out.printf("Entre com as Horas Faltas:");
		HFaltas = leitor.nextDouble();

		// Vari�vel, Fazer leitura e imprimir a Hora total para comparar com os valores
		// da gratifica��o

		double HTotais = HExtras - (div * (HFaltas));
		System.out.println("Horas Totais =  " +new DecimalFormat(".##").format(HTotais));
		System.out.println("\n");

		// Calculando e conferindo valores da gratifica��o.
		if (HTotais > 2400) {
			System.out.println("Gratifica��o de R$ 500,00");
		}

		if (HTotais <= 2400 && HTotais > 1800) {
			System.out.println("Gratifica��o de R$ 400,00");
		}

		if (HTotais <= 1800 && HTotais> 1200) {
			System.out.println("Gratifica��o de R$ 300,00");
		}

		if (HTotais <= 1200 && HTotais > 600) {
			System.out.println("Gratifica��o de R$ 200,00");
		}

		if (HTotais <= 600) {
			System.out.println("Gratifica��o de R$ 100,00");

		}

	}
}
