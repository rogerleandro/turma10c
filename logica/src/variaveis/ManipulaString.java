package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "humberto";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtde de caracteres: " + email.length());
		System.out.println("Posicao do @: " + email.indexOf("@"));
		System.out.println("Exibir do 2� at� o 4�: " + email.substring(1,4));
		System.out.println("Do 3� em diante: " + email.substring(2));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		// Exibir o usu�rio do email (antes do @)
		System.out.println("Usu�rio: " + email.substring(0, email.indexOf("@")));
		// Exibir o servidor do email (depois do @)
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1));
		System.out.println("Primeiro Caracter: " + email.charAt(4));
		System.out.println("Compara��o: " + email.equals("humberto@fiap.com.br"));
		System.out.println("Compara��o ignorando caixa: " + 
								email.equalsIgnoreCase("HUMBERTO@FIAP.COM.BR"));
		
		
	}

}
