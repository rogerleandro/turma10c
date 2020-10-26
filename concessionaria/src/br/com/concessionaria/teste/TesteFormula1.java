package br.com.concessionaria.teste;

import javax.swing.JOptionPane;

import br.com.concessionaria.modelo.CarroFormula1;

public class TesteFormula1 {

	public static void main(String[] args) {
		//Criar um objeto
		CarroFormula1 objeto;
		//Instanciar um objeto
		CarroFormula1 carro = new CarroFormula1();
		carro.preencherEscuderia("BENNETON");
		carro.preencherValor((float) 100.10);
		carro.preencherCor("verMelhA");
		System.out.println(carro.retornarEscuderia());
		System.out.println(carro.retornarValor());
		System.out.println(carro.retornarCor());
		if (JOptionPane.showConfirmDialog(null, "Ligar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0) {
			System.out.println(carro.ligar());
		}else{
			System.out.println(carro.desligar());
		}
		
		carro.acelerar(50);
		carro.acelerar(30);
		System.out.println(carro.retornarVelocidadeAtual());
		carro.desacelerar(120);
		System.out.println(carro.retornarVelocidadeAtual());
	}

}
