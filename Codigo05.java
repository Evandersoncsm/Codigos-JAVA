package Faccat;

import java.util.Scanner;

public class Codigo05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite um número: ");
		y=sc.nextInt();
		x=y-1;
		sc.close();
		System.out.println("O antecessor de "+y+" é: "+x);
		

	}

}
