package Matriz;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		TuringMachine turingMachine = new TuringMachine();
		
		String e = "";
		
		//Poderia ter feito no construtor, mas nah
		//Parte reprogramável!!!
		turingMachine.matriz = new String[][]{
				{"start", "*", "*", "r", "r0"},
				{"r0", "a", "a", "r", "r1"},
				{"r1", "b", "b", "r", "r2"},
				{"r2", "a", "a", "r", "r2"},
				{"r2", "c", "c", "r", "r2"},
				{"r2", "*", "*", "", "halt"}
			};
				
		
		turingMachine.estadoAtual = turingMachine.matriz[0][0];
		
		
		Scanner read = new Scanner(System.in);
		String entrada = "";
		System.out.println("Digite os caracteres da fita no estilo *ab(a|c)^n*: ");
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
