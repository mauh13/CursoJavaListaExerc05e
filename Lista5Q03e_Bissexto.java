package lista05_EstruturasDeSelecao_Extra;

import java.util.Scanner;

public class Lista5Q03e_Bissexto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe um ano qualquer:");
		int ano = leia.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println(ano + " é um ano bissexto.");
		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}
		

		leia.close();

	}

}
