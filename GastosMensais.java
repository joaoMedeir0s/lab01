import java.util.Scanner;

public class GastosMensais {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// [ ENTRADAS E ESTRATIFICAÇÃO DOS VALORES ]
			String m = input.nextLine();
			String[] meses = m.split(" ");
			String g = input.nextLine();
			String[] gastos = g.split(" ");
		// [ ELEMENTO A SER CONSULTADO ]
			String consulta = input.nextLine();
			for (int i = 0; i != 12; i++) {
				if (consulta.equals(meses[i])) {
					System.out.println(gastos[i]);
			}
		}
	}	
}



