import java.util.Scanner;
import java.util.ArrayList;

public class AlunoseNotas {
	public static void main(String[] args) {
		//[ CRIANDO A LISTA PARA RECEBER OS VALORES ]
		ArrayList<Integer> notas = new ArrayList<Integer>();
		
		//[ CRIANDO A ENTRADA ]
		Scanner input = new Scanner(System.in);
		while (true) {
			String entrada = input.nextLine();
			 //[ PONTO DE SAIDA ]
			if (entrada.equals("-")) { 
				break; }
			//[ SALVANDO OS VALORES ]
			String[] valor = entrada.split(" ");
			notas.add(Integer.parseInt(valor[1]));
		}
		// [ TAMANHO DA COLEÇAO ]
		int tamanho = notas.size();
		
		// [ CALCULANDO A MEDIA ]
		int soma = 0;
		for (int i = 0; i != tamanho; i++) {
			soma += notas.get(i);
		}
		int mediaFinal = (soma / tamanho);
		
		// [ QUAL O MAIOR ]
		int maior = notas.get(0);
		for (int i = 0; i != tamanho; i ++) {
			if(notas.get(i) >= maior) {
				maior = notas.get(i);
			}
		}
		//[ QUAL O MENOR ]
		int menor = notas.get(0);
		for (int i = 0; i != tamanho; i++) {
			if(notas.get(i) <= menor) {
				menor = notas.get(i);
			}
		}
		// [ACIMA E ABAIXO]
		int acima = 0;
		int abaixo = 0;
		for(int i = 0; i != tamanho; i++) {
			if (notas.get(i) >= 700) {
				acima ++;
			} else {
				abaixo++;
			}
				
		}
		
		//[ SAIDA ]
		System.out.println("maior: " + maior);
		System.out.println("menor: " + menor);
		System.out.println("media: " + mediaFinal);
		System.out.println("acima: " + acima);
		System.out.println("abaixo: " + abaixo);
	} 
}
