package Faccat;

import java.util.Scanner;

public class Codigo08 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			float eleitores=0;
			float eleitores1=0;
			float eleitores2=0;
			float eleitores3=0;
			float brancos=0, nulos=0 , validos=0;
			
			System.out.printf("Digite o valor total de eleitores: ","Valor inicial",+eleitores);
			eleitores=sc.nextFloat();
			System.out.printf("Digite o número de votos brancos: ",""+brancos);
			brancos=sc.nextFloat();
			System.out.printf("Digite o números de votos nulos: ",""+nulos);
			nulos=sc.nextFloat();
			System.out.printf("Agora digite o valor de votos válidos: ",""+validos);
			validos=sc.nextFloat();
		    eleitores=eleitores-brancos;
		    eleitores1=brancos*100/eleitores;
		    eleitores=eleitores-nulos;
		    eleitores2=nulos*100/eleitores;
		    eleitores=eleitores-validos;
		    eleitores3=validos*100/eleitores;
		    sc.close();
		    System.out.printf("\n\nO percentual de votos brancos é: "+eleitores1+" %%");
		    System.out.println("\nO percentual de votos nulos é: "+eleitores2+" %");
		    System.out.printf("O Percentual de votos validos é: "+eleitores3+" %%");
		    
		}
		
	}

}
