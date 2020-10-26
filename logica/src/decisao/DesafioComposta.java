package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		
		String veiculo = JOptionPane.showInputDialog("Veiculo").toUpperCase();
		byte capacidade = Byte.parseByte(JOptionPane.showInputDialog("Capacidade"));
		if (capacidade==2) {
			System.out.println(veiculo + " categoria A");
		}else if(capacidade>7) {
			System.out.println(veiculo + " categoria C");
		}else if(capacidade>=4) {
			System.out.println(veiculo + " categoria B");
		}else {
			System.out.println("Categoria desconhecida");
		}
		// Peça a entrada de Veiculo, capacidade de Passageiros
		// Exiba a mensagem:
		// "Veiculo Categoria A", se a qtde passageiros for igual a 2
		// "Veiculo Categoria B", se a qtde de passageiros estiver entre 4 e 7
		// "Veiculo Categoria C", se a qtde de passageiros for maior que 7
		
		
		

	}

}
