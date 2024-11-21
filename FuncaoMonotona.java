/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @João Pedro Araújo de Medeiros - 124110741
 */
 
import java.util.Scanner;

public class FuncaoMonotona{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float num1 = input.nextFloat();
		float num2 = input.nextFloat();
		float num3 = input.nextFloat();
		float num4 = input.nextFloat();
		if (num1 < num2 && num2 < num3 && num3<num4){
			System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
		} else if (num1 > num2 && num2 > num3 && num3 > num4){
			System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
		} else {
			System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
		}
	}
}
		
