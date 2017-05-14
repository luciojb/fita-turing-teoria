package Estrutura;
import java.util.Scanner;

public class Exercicio2 {

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
		
			if(fita[count] == 'a'){
				while(++count<fita.length){
					if(fita[count] == 'b'){
						break;
					}
				}
			}
			if(count<fita.length){
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
