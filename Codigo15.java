package Faccat;

import java.util.Scanner;

public class Codigo15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor=0;

		System.out.println("O sistema irá ler e mostrar se o valor é positivo ou negativo");
		System.out.printf("Digite um valor númerico: ",+valor);
		valor=sc.nextInt();
		if(valor<0) {
			System.out.println("O número é negativo");
		}
		else if(valor>=0) {
			System.out.println("O número é positivo");
		}
		sc.close();
	}
	
}

