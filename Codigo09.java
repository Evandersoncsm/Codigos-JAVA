package Faccat;

import java.util.Scanner;

public class Codigo09 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			float salario=0;
			float reajuste=0;
			
			
			System.out.printf("Digite o valor do seu salário mensal: ",""+salario);
			salario=sc.nextFloat();
			System.out.printf("Digite o percentual de reajuste: ",""+reajuste);
			reajuste=sc.nextFloat();
			reajuste=reajuste*salario;
			reajuste=reajuste/100+salario;
			sc.close();
			System.out.println("O novo valor salárial corresponde á: "+reajuste+ " Reais ");
		}
		

	}

}
