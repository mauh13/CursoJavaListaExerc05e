package lista05_EstruturasDeSelecao_Extra;

import java.util.Scanner;

public class Lista5Q05e_FolhaPgto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
			
		System.out.println("Informe o valor da hora do trabalhador:");
		int valorhora = leia.nextInt();
		
		System.out.println("Informe a quantidade de horas trabalhadas no mês:");
		int horasmes = leia.nextInt();
		
		float bruto = (valorhora * horasmes);
				
		float desc = 0f;
		int perc = 0; 
		
		if (bruto <= 900) {
			desc = 0;
			perc = 0;
		} else if (bruto > 900 && bruto <= 1500) {
			desc = bruto * 0.05f;
			perc = 5;
		} else if (bruto > 1500 && bruto <= 2500) {
			desc = bruto * 0.1f;
			perc = 10;
		} else if (bruto > 2500) {
			desc = bruto * 0.2f;
			perc = 20;
		}

		System.out.println("Salário bruto: (" + valorhora + " x " + horasmes + ") = " + bruto);
		System.out.println("(-) IR (" + perc + "%) = " + desc);
		System.out.println("(-) INSS (10%) = " + (bruto * 0.1f));
		System.out.println("FGTS (11%) = " + (bruto * 0.11f));
		System.out.println("Total Desconto = " + (desc + (bruto * 0.1f)));
		System.out.println("Salário Líquido = " + (bruto - (desc + (bruto * 0.1f))));
		
		leia.close();

	}

}
