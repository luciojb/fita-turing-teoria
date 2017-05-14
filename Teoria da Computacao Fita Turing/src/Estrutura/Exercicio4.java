package Estrutura;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String entrada = "", padrao = "abab";;
		System.out.println("Digite os caracteres da fita: ");
		entrada = read.next();
		
		read.close();
		
		char[] fita = new char[entrada.length()];
		char[] modelo = new char[padrao.length()];
		
		for (int i=0; i<entrada.length();i++){
			fita[i] = entrada.charAt(i);
		}
		
		for (int i=0; i<padrao.length();i++){
			modelo[i] = padrao.charAt(i);
		}
		int count=0; 
		try{
			while(count<fita.length){
				if(modelo[count] != fita[count]){
					System.out.println("Erro");
					break;
				}
				count++;
			}
		} catch (Exception e){
			System.out.println("Erro");
		}
		if (count==fita.length){
			System.out.println("Fim!!!");
		}
	}

}
