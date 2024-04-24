package ListaAtividades;

import java.util.Scanner;

public class Att3Lista {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int impar=0, par=0,num;
		
		for (int i=1; i<=10; i++) {
			System.out.print("Informe o: "+ i + "numéro: ");
			num=ler.nextInt();
		if (num % 2 ==0)
		par = par + 1 ; 
		else
		impar = impar +1;	
		}
		System.out.println("Quantidade de números pares: "+ par);
        System.out.println ("Quantidade de números impares: "+impar);
        ler.close();
	}

}
