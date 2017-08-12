package Matriz;


public class TuringMachine {
	public String[][] matriz;
	public final int ESTADO = 0, LER = 1, GRAVAR = 2, MOVER = 3, PROXIMOESTADO = 4;
	public int posicaoAtual=0;
	public String[] fita;
	public String estadoAtual;
	
	public void reconheceCaracter(){
		//O menorou igual é para fins de causar exceção, pois nao encontrou a letra do respectivo estado
		for(int i =0; i <= matriz.length; i++){
			if (matriz[i][ESTADO].equals(estadoAtual)){
				if (matriz[i][LER].equals(fita[posicaoAtual])){
					fita[posicaoAtual] = matriz[i][GRAVAR];
					estadoAtual = matriz[i][PROXIMOESTADO];
					defineProximaPosicao(matriz[i][MOVER]);
					break;
				}
			}
		}
	}
	
	public void defineProximaPosicao(String movimento){
		if (movimento.equals("r")) 
			posicaoAtual++;
		else if (movimento.equals("e"))
			posicaoAtual--;
	}
}
