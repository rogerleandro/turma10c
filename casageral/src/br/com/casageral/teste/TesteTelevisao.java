package br.com.casageral.teste;

import br.com.casageral.modelo.Televisao;

public class TesteTelevisao {

	public static void main(String[] args) {
		Televisao tv = new Televisao();
		System.out.println(tv.retornarTudo());
		tv.ligar();
		tv.mudarCanal(32);
		System.out.println(tv.retornarCanal());
		tv.aumentarVolume(5);
		tv.aumentarVolume(5);
		System.out.println(tv.retornarTudo());
	}

}
