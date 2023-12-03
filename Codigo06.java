package Faccat;

import java.util.Scanner;

public class Codigo06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int base=0, altura=0;
		int area;
		System.out.printf("Digite o valor da base do retângulo: ","\n\nO valor inicial é: "+base);
		base=sc.nextInt();
		System.out.printf("Agora digite o valor da altura para obter a área do retângulo: ","\n\nO valor final é: "+base);
		altura=sc.nextInt();
		area=base*altura;
		sc.close();
		System.out.println("A área do retângulo é: "+area);


	}

}
