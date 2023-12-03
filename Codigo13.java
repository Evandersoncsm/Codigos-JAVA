package Faccat;

import java.util.Scanner;

public class Codigo13 {

	public static void main(String[] args) {
		
		float n1=0;
		float n2=0;
		float n3=0;
		float notas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui as notas do aluno\n");
		System.out.printf("Nota 01: ",+n1);
		n1=sc.nextFloat();
		System.out.printf("Nota 02: ",+n2);
		n2=sc.nextFloat();
		System.out.printf("Nota 03: ",+n3);
		n3=sc.nextFloat();
		notas=(n1*2)+(n2*3)+(n3*5)/10;
		sc.close();
		System.out.println("A média final é: "+notas+" PONTOS");
		
	}

}
