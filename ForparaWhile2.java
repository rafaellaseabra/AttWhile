package ListaAtividades;

import java.util.Scanner;

public class ForparaWhile2 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double numero=0,soma=0, media;
		int i=0;

		while (i <= 4) {
			System.out.println("Informe um valor: ");
			numero=ler.nextDouble();	
			soma = soma+numero;
			
			i++;
         }
		
		media = (soma)/5;
		System.out.println("O resultado dessa soma é: " + soma);
		System.out.println ("O resultado da média é igual a: " + media);

		ler.close();

	}

}
