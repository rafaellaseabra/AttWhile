package ListaAtividades;

import java.util.Scanner;

public class ForparaWhile3 {

	public static void main(String[] args) {

		Scanner ler= new Scanner(System.in);
		int impar=0, par=0,num, i=0;

		while (i <= 10) {
			System.out.print("Informe o: "+ i + "numéro: ");
			num=ler.nextInt();
			if (num % 2 ==0)
				par = par + 1 ; 
			else
				impar = impar +1;	
			i++;
		}
		
		System.out.println("Quantidade de números pares: "+ par);
		System.out.println ("Quantidade de números impares: "+impar);
		ler.close();

	}

}
