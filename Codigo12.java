package Faccat;

import java.util.Scanner;

public class Codigo12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int f = 0;
		int c = 0;
	    byte temp = 0;
		
		System.out.println("O sistema irá ler e transformar a temperatura Fahrenheit em Graus Celsius\n");
		System.out.printf("Digite a temperatura ambiente em Fahrenheit: ",+f);
		f=sc.nextInt();
		temp=(byte) ((f-32)/1.8);
		sc.close();
		System.out.println("\nA temperatura em Celsius é: "+temp+" C°");
		
		
		
	    

	}

}
