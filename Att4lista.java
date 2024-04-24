package ListaAtividades;

import java.util.Scanner;

public class Att4lista {

	public static void main(String[] args) {
		int fatorial=1,num;
		Scanner ler= new Scanner(System.in);
		System.out.println ("Informe um valor para realizar o calculo do fatorial: ");
		num = ler.nextInt();
		
		for (int i=1; i <=num; i++) {
			fatorial*=num;
			System.out.println ("O resultado do fatorial é: " + fatorial);
		 
		}
	}
}

