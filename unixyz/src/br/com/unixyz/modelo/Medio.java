package br.com.unixyz.modelo;

import br.com.unixyz.padroes.PadraoFormacao;

public class Medio extends Formacao implements PadraoFormacao{
	private String tipo;

	public void calcMensalidade(double fator) {
		super.setMensalidade(super.getMensalidade() * 500 * (float) fator);
	}
	
	public String getAll() {
		return
				super.getAll() + "\n" + "Tipo: " + tipo; 
	}
	
	public void setAll(String descricao, int duracao, float mensalidade, String tipo) {
		super.setAll(descricao, duracao, mensalidade);
		this.tipo = tipo;
	}

	public Medio(String descricao, int duracao, float mensalidade, String tipo) {
		super(descricao, duracao, mensalidade);
		this.tipo = tipo;
	}

	public Medio() {
		super();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean add() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
