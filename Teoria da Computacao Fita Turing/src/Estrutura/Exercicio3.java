package Estrutura;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String entrada = "";
		System.out.println("Digite os caracteres da fita: ");
		entrada = read.next();
		
		read.close();
		
		char[] fita = new char[entrada.length()];
		
		for (int i=0; i<entrada.length();i++){
			fita[i] = entrada.charAt(i);
		}
		
		int count=0; 
		
		if(fita[0] != 'a' || fita[1] != 'a'){
			System.out.println("Erro");
		} else {
			count = 2;
			while(count<fita.length){
				if(fita[count] != 'b'){
					System.out.println("Erro");
					break;
				}
				count++;
			}
		}
		
		if (count==fita.length){
			System.out.println("Fim!!!");
		}
	}

}
