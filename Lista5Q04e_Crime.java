package lista05_EstruturasDeSelecao_Extra;

import java.util.Scanner;

public class Lista5Q04e_Crime {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int i = 0;
		
		System.out.println("Voc� telefonou para a v�tima? s/n");
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

		System.out.println("Mora perto da v�tima? s/n");
		res = leia.next().charAt(0);
		res = Character.toLowerCase(res);
		if (res == 's') {
			i++;
		}

		System.out.println("Devia para a v�tima? s/n");
		res = leia.next().charAt(0);
		res = Character.toLowerCase(res);
		if (res == 's') {
			i++;
		}

		System.out.println("J� trabalhou com a v�tima? s/n");
		res = leia.next().charAt(0);
		res = Character.toLowerCase(res);
		if (res == 's') {
			i++;
		}

		if (i == 2) {
			System.out.println("Voc� foi classificado como SUSPEITO");
		} else if (i >= 3 && i <= 4) {
			System.out.println("Voc� foi classificado como C�MPLICE");
		} else if (i == 5) {
			System.out.println("Voc� foi classificado como ASSASSINO");
		} else {
			System.out.println("Voc� foi classificado como INOCENTE");
		}
			
						
		leia.close();

	}

}
