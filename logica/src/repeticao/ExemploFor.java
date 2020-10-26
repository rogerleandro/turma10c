package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		/*
		 * For: utilizamos, normalmente, quando n�o h� intera��o do usu�rio com a repeti��o.
		 * Sintaxe:
		 * 1� Parametro: inicio da repeticao com a defini��o do contador
		 * 2� Parametro: condi��o, ou seja, at� quando o la�o vai ser executado
		 * 3� Parametro: qual a forma de contagem
		 */
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		// 8 x 1 = 8
		// 8 x 2 = 16
		for (int contador=1;contador<11;contador++) {
			System.out.println(tabuada + " x " + contador + " = " + (tabuada * contador));
		}
	}

}
