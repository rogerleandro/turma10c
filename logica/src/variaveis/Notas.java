package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome");
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota2"));
		float media = (nota1+nota2)/2;
		System.out.printf("%s sua m�dia na disciplina %s foi de %.2f", nome, disciplina, media);
		JOptionPane.showMessageDialog(null, nome + "\n" + disciplina + "\n" + media);
		/*
		 * Regras para os identificadores 
		 * 1� Nunca come�ar�s com n�mero. 1berto (inv�lido) // h1berto (v�lido)
		 * 2� N�o utilizar�s palavras reservadas da linguagem. void (inv�lido)
		 * 3� N�o far�s uso de caracteres especiais. d@t@ (inv�lido) - data de nascimento (inv�lido)
		 * 
		 * Padr�es para variaveis
		 * - comecar com letra minuscula
		 * - utilizar o padr�o CamelCase. dataNascimento // numeroDeMatricula // 
		 * - nomes significativos
		 * 
		 * Toda classe come�a com letra maiuscula
		 * Todo m�todo vem seguido de parenteses
		 * xpto Xpto xpto()
		 */
		
		
		
	}

}
