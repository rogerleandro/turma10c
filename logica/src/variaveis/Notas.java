package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome");
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota2"));
		float media = (nota1+nota2)/2;
		System.out.printf("%s sua média na disciplina %s foi de %.2f", nome, disciplina, media);
		JOptionPane.showMessageDialog(null, nome + "\n" + disciplina + "\n" + media);
		/*
		 * Regras para os identificadores 
		 * 1º Nunca começarás com número. 1berto (inválido) // h1berto (válido)
		 * 2º Não utilizarás palavras reservadas da linguagem. void (inválido)
		 * 3º Não farás uso de caracteres especiais. d@t@ (inválido) - data de nascimento (inválido)
		 * 
		 * Padrões para variaveis
		 * - comecar com letra minuscula
		 * - utilizar o padrão CamelCase. dataNascimento // numeroDeMatricula // 
		 * - nomes significativos
		 * 
		 * Toda classe começa com letra maiuscula
		 * Todo método vem seguido de parenteses
		 * xpto Xpto xpto()
		 */
		
		
		
	}

}
