package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os.
		A taxa de servi�os � de:
		R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15;
		R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15;
		R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
		Monte uma aplica��o que apresente a conta do cliente.
		 */
		
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Qtde Diarias"));
		float valorDiaria= (float) 80.0;
		if (diarias>15) {
			valorDiaria = (float) 85.5;
		}else if (diarias==15) {
			valorDiaria = (float) 86.0;
		}else {
			valorDiaria = (float) 88.0;
		}
		System.out.println("Total: " + (valorDiaria*diarias));

	}

}
