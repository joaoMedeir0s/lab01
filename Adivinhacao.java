import java.util.Scanner;

public class Adivinhacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		while (true) {
			int entrada = input.nextInt();
			int aux = (num - entrada);
			if (entrada == num) {
				System.out.println("ACERTOU");
				break;
			} else if(aux < 0) {
				System.out.println("MAIOR");
			} else if (aux > 0) {
				System.out.println("MENOR");
			}
		}
	}

}
