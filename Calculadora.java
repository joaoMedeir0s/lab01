/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @João Pedro Araújo de Medeiros - 124110741
 */

import java.util.Scanner;
import java.util.Locale;

public class Calculadora{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		String mais = "+";
		String menos = "-";
		String mult = "*";
		String div = "/";
		String sinal = input.nextLine();
		if (sinal.equals(mais)) {
			float num1 = input.nextFloat();
			float num2 = input.nextFloat();
			float num3 = num1 + num2;
			System.out.println("RESULTADO: " + num3);
		}
		else if (sinal.equals(menos)) {
			float num1 = input.nextFloat();
			float num2 = input.nextFloat();
			float num3 = num1 - num2;
			System.out.println("RESULTADO: " + num3);
		}
		else if (sinal.equals(mult)) {
			float num1 = input.nextFloat();
			float num2 = input.nextFloat();
			float num3 = num1 * num2;
			System.out.println("RESULTADO: " + num3);
		}
		else if (sinal.equals(div)) {
			float num1 = input.nextFloat();
			float num2 = input.nextFloat();
			if (num2 == 0){
				System.out.println("ERRO");
			} else {
				float num3 = num1 / num2;
				System.out.println("RESULTADO: " + num3);
			}
		} else {
			System.out.println("ENTRADA INVALIDA");
		}
	}
}
