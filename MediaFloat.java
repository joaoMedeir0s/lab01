/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @João Pedro Araújo de Medeiros - 124110741
 */

import java.util.Scanner;

public class MediaFloat{
	
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	float num1 = input.nextFloat();
	float num2 = input.nextFloat();
	float media = (num1 + num2) / 2;
	if (media >= 7){
		System.out.println("pass: True!");
	} else {
		System.out.println("pass: False!");
	}
}
}
	
