package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Curso;

public class ImplementarCurso {

	public static void main(String[] args) {
		Curso objeto = new Curso(
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("Descricao").toUpperCase(),
				Float.parseFloat(JOptionPane.showInputDialog("Valor")),
				Integer.parseInt(JOptionPane.showInputDialog("Carga Horária"))
				);
		
		System.out.println(objeto.getAll());
			
	}

}
