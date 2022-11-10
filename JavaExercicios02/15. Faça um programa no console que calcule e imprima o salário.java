// 15. Fa�a um programa que calcule e imprima o sal�rio a ser transferido para um funcion�rio no console.
// Para realizar o calculo receba o valor bruto do sal�rio e o adicional dos benef�cios.
// O sal�rio a ser transferido � calculado da seguinte maneira: 

// (valor bruto do sal�rio - percentual de imposto mediante ao sal�rio) + adicional dos benef�cios

// Para calcular o percentual de imposto segue as aliquotas:

// De R$ 0.00 a R$ 1100.00 = 5.00%
// De R$ 1100.01 a R$ 2500.00 = 10.00%
// Maior que R$ 2500.00 = 15.00%

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args) {

		// L� os valores de Entrada:
		Scanner leitorDeEntradas = new Scanner(System.in);

		float valorSalario;
		float valorBeneficios;
		
		//Impressão da leitura da variável
		System.out.print("Digite o salario do funcionario: ");
		valorSalario = leitorDeEntradas.nextFloat();
		
		float valorImposto = 0;
		if (valorSalario >= 0 && valorSalario <= 1100) {
			// Atribiu a aliquota de 5% mediante o sal�rio:
			valorImposto = 0.05F * valorSalario;
			System.out.printf("C�lculo do Imposto de Renda= ");
			System.out.printf("valorSalario *0.05%% = R$ %.2f\n ", (valorImposto));
	     }
		// TODO Criar as demais condi��es para as aliquotas de 10.00% e 15.00%.

		if (valorSalario > 1100 && valorSalario <= 2500) {
			// Atribiu a aliquota de 10% mediante o sal�rio:
			valorImposto = 0.10F * valorSalario;
			System.out.printf("C�lculo do Imposto de Renda= ");
			System.out.printf("valorSalario *0.10%% = R$ %.2f\n ", (valorImposto));
			
		}
		if (valorSalario > 2500) {
			// Atribiu a aliquota de 15% mediante o sal�rio:
			valorImposto = 0.15F * valorSalario;	
			System.out.printf("C�lculo do Imposto de Renda= ");
			System.out.printf("valorSalario *0.15%% = R$ %.2f\n ", (valorImposto));
		}
		
		System.out.printf("Digite o Beneficio do funcionario: ");
		valorBeneficios = leitorDeEntradas.nextFloat();
		
		// Calcula e imprime a Sa�da do Salario Transferido (com 2 casas decimais):
		float saida = valorSalario  - valorImposto + valorBeneficios;
		System.out.printf("C�lculo do Sal�rio Transferido ao Funcion�rio= ");
		System.out.printf(String.format("%.2f", saida));
	}
} 