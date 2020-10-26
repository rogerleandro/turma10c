package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		/*
		 * Peçam o total de faltas 
		 * Se o total de faltas for maior que 20, o aluno está reprovado.
		 */
		
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1+nota2)/2;
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));
		if (media>=6 && faltas<=20) {
			System.out.println("Aprovado com media: " + media);
		}else if (media<4 || faltas>20) {
			System.out.println("Infelizmente você foi reprovado com a media: " + media);
		}else {
			System.out.println("Você ainda tem uma chance no exame");
		}
		System.out.println("Ate logo");
	} // metodo main
} // da classe
