package br.com.excecoes.implementacoes;

public class TesteExcecao {

	public static void main(String[] args) {
		// Exce��es: n�o s�o controladas pelo programador.
		// Existem dois tipos
		// A - ) checked: o Java verifica
		// B - ) Unchecked: s� ocorre apos a compila��o

		try {
			int numero = Integer.parseInt("7");
			System.out.println("Resultado = " + (numero));

			String email="null";
			if (email==null) {
				throw new RuntimeException ("Dados Corrompidos");
			}
			System.out.println("Usuario:"  + email.substring(0, email.indexOf("@")));

			
		} catch (NullPointerException  e) {
			System.out.println("Objeto Nulo");
			
			
			
			
		} catch (NumberFormatException e) {
			System.out.println("Numero Invalido");
			
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("Coordenada Invalida");
			
			
		}catch(Exception e) {
			System.out.println("Deu ruim");
		}finally {
			System.out.println("At� logo");
		}










	}

}
