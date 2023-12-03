package Faccat;

import java.util.Scanner;

public class Codigo07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ano=360, mes=30;
		int x = 0 , y;
		
		System.out.printf("Digite sua idade: ","O valor inicial é: "+x);
		x=sc.nextInt();
		y=(x*ano+x*mes);
		sc.close();
		System.out.println("Você possui "+y+" dias de vida");
	}

}
