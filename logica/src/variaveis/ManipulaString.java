package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "humberto";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtde de caracteres: " + email.length());
		System.out.println("Posicao do @: " + email.indexOf("@"));
		System.out.println("Exibir do 2º até o 4º: " + email.substring(1,4));
		System.out.println("Do 3º em diante: " + email.substring(2));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		// Exibir o usuário do email (antes do @)
		System.out.println("Usuário: " + email.substring(0, email.indexOf("@")));
		// Exibir o servidor do email (depois do @)
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1));
		System.out.println("Primeiro Caracter: " + email.charAt(4));
		System.out.println("Comparação: " + email.equals("humberto@fiap.com.br"));
		System.out.println("Comparação ignorando caixa: " + 
								email.equalsIgnoreCase("HUMBERTO@FIAP.COM.BR"));
		
		
	}

}
