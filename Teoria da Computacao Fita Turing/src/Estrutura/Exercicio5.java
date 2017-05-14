package Estrutura;

import java.util.Scanner;

public class Exercicio5 {

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
		
		try{
			if(fita[0] != 'a'){
				System.out.println("Erro");
			} else {
				count++;
				while(fita[count] == 'b'){
					count++;
				}
				if(fita[count] == 'a'){
					if(fita[++count] == 'b'){
						if(fita[++count] != 'c'){
							System.out.println("Erro");
						}
					} else {
						System.out.println("Erro");
					}
				} else {
					System.out.println("Erro");
				}
			}
		} catch(Exception e){
			System.out.println("Erro");
		}
		if (count==fita.length-1){
			System.out.println("Fim!!!");
		}
	}
}