package Faccat;

import java.util.Scanner;

public class Codigo16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maca=0;
		float precoMenor= (float) 1.00;
		float precoMaior= (float) 1.30;

		System.out.println("Para iniciar a operaão matamática digite abaixo o total de maças compradas\n");
		System.out.printf("Número de maças compradas: ",+maca);
		maca=sc.nextInt();
		if(maca<12) {
			System.out.println("O valor unitário é: 1.30 R$");
			System.out.println("O valor total é: "+precoMaior*maca);
		}else if(maca>=12) {
			System.out.println("O valor unitário é: 1.00 R$");
			System.out.println("O valor total é: "+precoMenor*maca);

		}	
		sc.close();

	}

}


