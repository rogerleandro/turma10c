package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.util.Magica;

public class ImplementarProfessor3 {

	public static void main(String[] args) {
		Professor professor = new Professor(
				Magica.i("ID"),
				Magica.s("Nome"),
				Magica.s("Formacao"),
				new Endereco(
						Magica.s("Logradouro"),
						Magica.s("Numero"),
						Magica.s("Complemento"),
						Magica.s("Bairro"),
						Magica.s("Cidade"),
						Magica.s("Estado"),
						Magica.s("Cep")
						)
				);
		
		System.out.println(professor.getAll());
		
		
		
		
		
		
		
	} // fecha o main

} // fecha a classe
