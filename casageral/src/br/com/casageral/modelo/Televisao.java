package br.com.casageral.modelo;

public class Televisao {

	private String marca;
	private float valor;
	private boolean status;
	private int canal;
	private int volume;
	
	public void preencherMarca(String pMarca) {
		this.marca=pMarca.toUpperCase();
	}
	
	public void preencherValor(float pValor) {
		valor=pValor;
	}
	
	public String retornarMarca() {
		return marca;
	}
	
	public float retornarValor() {
		return valor;
	}
	
	public void ligar() {
		status=true;
	}
	
	public void desligar() {
		status=false;
		canal=0;
	}
	
	public boolean retornarStatus() {
		return status;
	}
	
	public void mudarCanal(int pCanal) {
		if (status==true && pCanal>0) {
			canal=pCanal;
		}
	}
	
	public int retornarCanal() {
		return canal;
	}
	
	public void aumentarVolume(int pVolume) {
		if (status==true && pVolume>0) {
			volume+=pVolume;
		}
	}
	
	public void diminuirVolume(int pVolume) {
		if (status==true && (volume-pVolume)>=0) {
			volume-=pVolume;
		}
	}
	
	public int retornarVolume() {
		return volume;
	}
	
	public String retornarTudo() {
		String resultado="";
		if (status==true) {
			resultado="LIGADA";
		}else {
			resultado="DESLIGADA";
		}
		return 
				"Marca..: " + marca + "\n" + 
				"Valor..: " + valor + "\n" +
				"Status.: " + resultado + "\n" +
				"Volume.: " + volume + "\n" +
				"Canal..: " + canal;
	}
	
	
	
	
	
	
	
	
	
}// fecha a classe
