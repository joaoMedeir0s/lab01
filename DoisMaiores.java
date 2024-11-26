import java.util.Scanner;
public class DoisMaiores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// [ INPUT DOS GASTOS COMO STRINGS ]
		String g = input.nextLine();
		String[] gastosString = g.split(" ");
		// [ CONVERTENDO AS STRINGS EM INTEIROS ]
		int[] gastos = new int[gastosString.length];
		for (int i = 0; i != gastosString.length; i++) {
			gastos[i] = Integer.parseInt(gastosString[i]);
		}
		// [ VENDO QUAIS OS MAIORES ]
		int maior1 = 0;
		int maior2 = 0;
		for (int i = 0; i != gastos.length; i++) {
			if (gastos[i] >= maior1) {
				maior1 = gastos[i];
			}
		}
		for (int i = 0; i != gastos.length; i++) {
			if (maior1 == gastos[i]) {
				gastos[i] = 0;
				break;
			}
		}
		for (int i = 0; i != gastos.length; i++) {
			if (gastos[i] >= maior2) {
				maior2 = gastos[i];
			}
		}
		System.out.println(maior1 + maior2);
	}
}
// perdao pelo codigo feio :(
