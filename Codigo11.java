package Faccat;

import java.util.Scanner;

public class Codigo11 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			double carros=0;
			double vendas=0;
			double salario=0;
			double comissao=0;
			double total;
			double recebe;

			System.out.printf("Digite o total de carros vendidos no mês: ",+carros);
			carros=sc.nextInt();
			System.out.printf("Em seguida digite o valor total de suas vendas: ",+vendas);
			vendas=sc.nextDouble();
			System.out.printf("Digite seu salário fixo mensal: ",+salario);
			salario=sc.nextDouble();
			System.out.printf("Agora digite o valor que você recebe por carro vendido: ",+comissao);
			comissao=sc.nextDouble();
			recebe=vendas*5/100;
			comissao=carros*comissao;
			total=salario+comissao+recebe;
			sc.close();
			System.out.println("O salário final do vendedor é: "+total+" ");


		}	

	}

}




