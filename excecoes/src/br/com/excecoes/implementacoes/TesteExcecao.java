package br.com.excecoes.implementacoes;

public class TesteExcecao {

	public static void main(String[] args) {
		// Exceções: não são controladas pelo programador.
		// Existem dois tipos
		// A - ) checked: o Java verifica
		// B - ) Unchecked: só ocorre apos a compilação

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
			System.out.println("Até logo");
		}










	}

}
