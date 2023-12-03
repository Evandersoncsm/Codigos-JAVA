package Faccat;

import java.util.Scanner;

public class Codigo17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float av1 = 0;
		float av2 = 0;
		float nf; 
		System.out.println("O sistema irá calcular a média do aluno\n");
		System.out.println("Digite abaixo as notas das avaliações do aluno:");
		System.out.printf("\nAvaliação 01: ",+av1);
		av1=sc.nextFloat();
		System.out.printf("Avaliação 02: ",+av2);
		av2=sc.nextFloat();
		nf=(av1+av2)/2;
		if(nf>=6) {
			System.out.println("Aluno aprovado! Parabéns!!!");
			System.out.println("A média final é: "+nf+"");
		}else {
			System.out.println("Aluno reprovado!!!");
			System.out.println("A média final é: "+nf+"");
		}
		sc.close();
	}
	
}	
		
		
		

	


