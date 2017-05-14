package Matriz;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		TuringMachine turingMachine = new TuringMachine();
		
		String e = "";
		
		//Poderia ter feito no construtor, mas nah
		//Parte reprogramável!!!
		turingMachine.matriz = new String[][]{
				{"start", "*", "*", "r", "r0"},
				{"r0", "x", "x", "r", "r1"},
				{"r1", "y", "y", "r", "r1"},
				{"r1", "z", "z", "r", "r1"},
				{"r1", "x", "x", "r", "fim"},
				{"fim", "*", "*", "", "halt"}
			};
				
		
		turingMachine.estadoAtual = turingMachine.matriz[0][0];
		
		
		Scanner read = new Scanner(System.in);
		String entrada = "";
		System.out.println("Digite os caracteres da fita no estilo *x((y|z)^n)x*: ");
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
