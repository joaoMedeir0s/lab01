/**
* Laboratório de Programação 2 - Lab 1
* 
* @João Pedro Araújo de Medeiros - 124110741
* */

import java.util.Scanner;

public class AcimaDaMedia{
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String palavra = input.nextLine();
	String[] numsArray = palavra.split(" ");
	int tamanho = (numsArray.length);
	float media = 0;
	int[] numsInteiros = new int[tamanho];
	for (int i = 0; i != tamanho; i += 1) {
		int aux = Integer.parseInt(numsArray[i]);
		numsInteiros[i] = aux;
		}
	for (int i = 0; i != tamanho; i+= 1) {
		media += numsInteiros[i];
	}
	float mediaFinal = (media / tamanho);
	String palavraFinal = "";
	for (int i = 0; i != tamanho; i += 1) {
		if (numsInteiros[i] > mediaFinal) {
			palavraFinal += numsArray[i];
			palavraFinal += " ";
		}
	}
	int a = palavraFinal.length() - 1;
	System.out.println(palavraFinal.substring(0,a));
}
}
