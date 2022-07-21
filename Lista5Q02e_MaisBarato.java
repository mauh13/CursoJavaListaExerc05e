package lista05_EstruturasDeSelecao_Extra;

import java.util.Scanner;

public class Lista5Q02e_MaisBarato {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o valor do produto 1:");
		float prod1 = leia.nextFloat();
		System.out.println("Informe o valor do produto 2:");
		float prod2 = leia.nextFloat();
		System.out.println("Informe o valor do produto 3:");
		float prod3 = leia.nextFloat();
		
		if (prod1 < prod2 && prod1 < prod3) {
			System.out.println("Compre o produto 1");
		}
		if (prod2 < prod1 && prod2 < prod3) {
			System.out.println("Compre o produto 2");
		}
		if (prod3 < prod1 && prod3 < prod2) {
			System.out.println("Compre o produto 3");
		}
		if (prod1 == prod2 && prod1 < prod3) {
			System.out.println("Compre o produto 1 ou o 2");
		}
		if (prod1 == prod3 && prod1 < prod2) {
			System.out.println("Compre o produto 1 ou o 3");
		}
		if (prod2 == prod3 && prod2 < prod1) {
			System.out.println("Compre o produto 2 ou o 3");
		}
		if (prod1 == prod2 && prod1 == prod3)
			System.out.println("Todos estão com o mesmo valor, compre o mais bonito.");
			
			
		leia.close();
	}

}
