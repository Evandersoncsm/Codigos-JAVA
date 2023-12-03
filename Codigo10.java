package Faccat;

import java.util.Scanner;

public class Codigo10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double custo=0;
		double distribuidor=0;
		double impostos=0;
		double soma=0;
		
		System.out.printf("Digite o valor do custo de fábrica do carro: ",""+custo);
		custo=sc.nextDouble();
		System.out.printf("Digite o custo percentual do distribuidor: ",""+distribuidor);
		distribuidor=sc.nextInt();
		System.out.printf("Digite o custo percentual de impostos: ",""+impostos);
		impostos=sc.nextInt();
		distribuidor=distribuidor*custo/100;
		impostos=impostos*custo/100;
		soma=(custo+distribuidor+impostos);
		sc.close();
		System.out.println("O custo final do veiculo é: "+soma+ " Reais ");
	
		

	}

}
