package variaveis;

import javax.swing.JOptionPane;

public class VendaProduto {

	public static void main(String[] args) {
		// Crie as variaves para armazenar: 
		// nome do produto, c�digo, valor e qtde.
		// Exiba no final o nome do produto, o total e o total com 10% de desconto.
		/*
		 * Parse => convers�o entre tipos incompat�veis (String => primitivo)
		 * Primitivo => s�o os tipos que fazem parte da linguagem (come�am com letras minusculas)
		 * 
		 * boolean => armazena True ou False
		 * char => armazena um caracter
		 * byte => numeros inteiros (-127 // +128)
		 * short => numeros inteiros (-32k // + 32k)
		 * int => numeros inteiros (-2bilhoes // +2bilhoes)
		 * long => numeros inteiros 
		 * float => numeros reais
		 * double => numeros reais (possui o dobro de precis�o nas casas decimais)
		 * 
		 * Classe Wrapper => s�o classes que apoiam os tipos primitivos. Exemplo: parse().
		 * int => Integer
		 * double => Double
		 * float => Float
		 * boolean = Boolean
		 */
		
		String produto = JOptionPane.showInputDialog("Digite o produto");
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("C�digo"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
		double total = qtde*valor;
		System.out.println("Produto............: " + produto);
		System.out.println("Total..............: " + total);
		System.out.println("Total com Desconto.: " + (total*0.9));
		

	}

}
