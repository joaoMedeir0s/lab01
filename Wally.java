/**
* Laboratório de Programação 2 - Lab 1
* 
* @João Pedro Araújo de Medeiros - 124110741
* */

import java.util.Scanner;

public class Wally {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aux = 0;
		String achado = "wally";
		do {
			String nomes = input.nextLine();
			String[] nomesArray = nomes.split(" ");
			int tamanho = nomesArray.length;
			String achei = "";
			for (int i = 0; i != tamanho; i += 1) {
				if (nomesArray[i].equals(achado)) {
					aux += 1;
					break;}
				if (nomesArray[i].length() == 5) {
					achei = nomesArray[i];}			
			}
			if (aux == 1){
				break;}
			if (achei != "") {
				System.out.println(achei);
			}else {
				System.out.println("?");	
				}
		} while (aux == 0);
	}
}
