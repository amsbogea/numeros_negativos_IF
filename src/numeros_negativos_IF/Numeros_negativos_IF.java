package numeros_negativos_IF;

import java.util.Scanner;

public class Numeros_negativos_IF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1, num2, num3, quant = 0;

		System.out.println("Digite o primero número");
		num1 = input.nextInt();

		if (num1 < 0) {
			quant = quant + 1;
		}

		System.out.println("Digite o segundo número");
		num2 = input.nextInt();
		
		if (num2 < 0) {
			quant = quant + 1;
		}

		System.out.println("Digite o terceiro número");
		num3 = input.nextInt();
		
		if (num3 < 0) {
			quant = quant + 1;
		}
		
		System.out.println("A quantidade de número(s) negativo(s) informaos foi " + quant);

	}

}
