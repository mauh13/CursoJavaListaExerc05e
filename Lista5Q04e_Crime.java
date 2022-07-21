package lista05_EstruturasDeSelecao_Extra;

import java.util.Scanner;

public class Lista5Q04e_Crime {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int i = 0;
		
		System.out.println("Você telefonou para a vítima? s/n");
		char res = leia.next().charAt(0);
		res = Character.toLowerCase(res);
		if (res == 's') {
			i++;
		}
		
		System.out.println("Esteve no local do crime? s/n");
		res = leia.next().charAt(0);
		res = Character.toLowerCase(res);
		if (res == 's') {
			i++;
		}

		System.out.println("Mora perto da vítima? s/n");
		res = leia.next().charAt(0);
		res = Character.toLowerCase(res);
		if (res == 's') {
			i++;
		}

		System.out.println("Devia para a vítima? s/n");
		res = leia.next().charAt(0);
		res = Character.toLowerCase(res);
		if (res == 's') {
			i++;
		}

		System.out.println("Já trabalhou com a vítima? s/n");
		res = leia.next().charAt(0);
		res = Character.toLowerCase(res);
		if (res == 's') {
			i++;
		}

		if (i == 2) {
			System.out.println("Você foi classificado como SUSPEITO");
		} else if (i >= 3 && i <= 4) {
			System.out.println("Você foi classificado como CÚMPLICE");
		} else if (i == 5) {
			System.out.println("Você foi classificado como ASSASSINO");
		} else {
			System.out.println("Você foi classificado como INOCENTE");
		}
			
						
		leia.close();

	}

}
