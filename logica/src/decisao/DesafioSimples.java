package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade"));
		if (idade<16) {
			System.out.println(nome + " � proibido votar.");
		}
		if (idade>17 && idade<70) {
			System.out.println(nome + " � obrigado a votar.");
		}
		
		if (idade==16 || idade==17 || idade>=70) {
			System.out.println(nome + " o voto pra voc� � facultativo.");
		}
		// Pe�a para o usu�rio: nome e idade
		// Voc� deve exibir:
		// "Obrigado a votar" se a idade for maior que 17 e menor que 70
		// "Voto Facultativo" se a idade for igual a 16 ou 17 ou idade for maior que 70
		// "Proibido votar" se a idade for menor que 16
	}

}
