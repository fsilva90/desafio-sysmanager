package teste2;

/**
 * @author felipe.silva
 * @date 31/05/2020
 */

public class ChallengeTwo {

	public static String toEncrypt(String text, int key) {
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String criptografia = "";

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				criptografia = criptografia + " ";
			} else {
				int posicaodaletra = alfabeto.indexOf(text.toUpperCase().charAt(i));
				int novaposicao = posicaodaletra + key;
				if (novaposicao > 25) {
					char novaletra = alfabeto.charAt(posicaodaletra + key - 26);
					criptografia = criptografia + novaletra;
				} else {
					char novaletra = alfabeto.charAt(novaposicao);
					criptografia = criptografia + novaletra;
				}

			}
		}
		return criptografia;
	}

	public static String toDecrypt(String palavra, int chave) {
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String descriptografia = "";

		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.indexOf(palavra.charAt(i)) == ' ') {
				char novaletra = '#';
				descriptografia = descriptografia + novaletra;
			} else {
				int posicaodaletra = alfabeto.indexOf(palavra.toUpperCase().charAt(i));
				int novaposicao = posicaodaletra - chave;
				if (novaposicao < 0) {
					char novaletra = alfabeto.charAt(posicaodaletra - chave + 26);
					descriptografia = descriptografia + novaletra;
				} else {
					char novaletra = alfabeto.charAt(novaposicao);
					descriptografia = descriptografia + novaletra;
				}

			}
		}
		return descriptografia;
	}
}