// 14. Fa�a um programa que calcule e imprima o sal�rio a ser transferido para um funcion�rio.
// Para realizar o calculo receba o valor bruto do sal�rio e o adicional dos benef�cios.
// O sal�rio a ser transferido � calculado da seguinte maneira: 

// (valor bruto do sal�rio - percentual de imposto mediante ao sal�rio) + adicional dos benef�cios

// Para calcular o percentual de imposto segue as aliquotas:

// De R$ 0.00 a R$ 1100.00 = 5.00%
// De R$ 1100.01 a R$ 2500.00 = 10.00%
// Maior que R$ 2500.00 = 15.00%

import java.util.Scanner;

public class Exerc14 {
	
	public static void main(String[] args) {

		// L� os valores de Entrada:
		Scanner leitorDeEntradas = new Scanner(System.in);

		float valorSalario = 2000;
		float valorBeneficios = 250;
		float valorImposto = 200;

		if (valorSalario >= 0 && valorSalario <= 1100) {
			// Atribiu a aliquota de 5% mediante o sal�rio:
			valorImposto = 0.05F * valorSalario;
		}
		// TODO Criar as demais condi��es para as aliquotas de 10.00% e 15.00%.

		if (valorSalario > 1100 && valorSalario <= 2500) {
			// Atribiu a aliquota de 10% mediante o sal�rio:
			valorImposto = 0.10F * valorSalario;
		}
		if (valorSalario > 2500) {
			// Atribiu a aliquota de 15% mediante o sal�rio:
			valorImposto = 0.15F * valorSalario;
		}

		// Calcula e imprime a Sa�da (com 2 casas decimais):
		float saida = valorSalario - valorImposto + valorBeneficios;
		System.out.println(String.format("%.2f", saida));
	}
}
