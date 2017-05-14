package Matriz;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		TuringMachine turingMachine = new TuringMachine();
		
		String e = "";
		
		//Poderia ter feito no construtor, mas nah
		//Parte reprogramável!!!
		turingMachine.matriz = new String[][]{
				{"start", "*", "*", "r", "r0"},
				{"r0", "0", "x", "r", "r1"},
				{"r0", "x", "x", "r", "r0"},
				{"r0", "*", "*", "", "halt"},
				{"r1", "1", "x", "e", "volta"},
				{"r1", "0", "0", "r", "r1"},
				{"r1", "x", "x", "r", "r1"},
				{"volta", "1", "1", "e", "volta"},
				{"volta", "0", "0", "e", "volta"},
				{"volta", "x", "x", "e", "volta"},
				{"volta", "*", "*", "r", "r0"}
			};

		
		turingMachine.estadoAtual = turingMachine.matriz[0][0];
		
		
		Scanner read = new Scanner(System.in);
		String entrada = "";
		System.out.println("Digite os caracteres da fita no estilo *(0^n)(1^n)*: ");
		entrada = read.next();
		
		read.close();
		
		turingMachine.fita = new String[entrada.length()];

		for (int i=0; i<entrada.length();i++){
			turingMachine.fita[i] = String.valueOf(entrada.charAt(i));
		}
		
		try{
			while(!turingMachine.estadoAtual.equals("halt")){
				turingMachine.reconheceCaracter();
			}
		} catch (Exception ex) {
			e = ex.getMessage();
		}
		
		if (turingMachine.estadoAtual.equals("halt")){
			System.out.println("Sucesso!");
		} else {
			System.out.println("Erro!");
		}
	}

}
