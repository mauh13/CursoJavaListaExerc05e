package lista05_EstruturasDeSelecao_Extra;

import java.util.Scanner;

public class Lista5Q01e_MeioAmbiente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o �ndice de polui��o (0 at� 1):");
		float ind = leia.nextFloat();
		
		if (ind < 0.3) {
			System.out.println("Nenhum grupo precisa suspender as atividades");
		} else if (ind >= 0.3) {
			System.out.println("As seguintes ind�strias precisam suprender suas atividades:");
			System.out.println("Ind�strias do Grupo 1");
		}

		if (ind >= 0.4) {
			System.out.println("Ind�strias do Grupo 2");
		}
		
		if (ind >= 0.5) {
			System.out.println("Ind�strias do Grupo 3");
		}
		leia.close();

	}

}
