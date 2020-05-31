package teste1;

/**
 * @author felipe.silva
 * @date 31/05/2020
 */

public class ChallengeOne {

	public ChallengeOne() {

	}

	public static String getPrimeBiggerNumber(int numInicio, int numFinal) {

		int menorNum = 0, maiorNum = 0, resultado = 0;

		if (numInicio == numFinal) {
			return "Não existe intervalo de número inteiros!";
		} else if (numInicio < 0) {
			return "O primeiro número inserido não pertece ao conjunto de números inteiros!";
		} else if (numFinal < 0) {
			return "O segundo número inserido não pertece ao conjunto de números inteiros!";
		}

		if (numInicio < numFinal) {
			menorNum = numInicio;
			maiorNum = numFinal;
		} else if (numFinal < numInicio) {
			menorNum = numFinal;
			maiorNum = numInicio;
		}

		for (int i = menorNum; i < maiorNum; i++) {
			Boolean isPrime = false;

			for (int j = 2; j <= i; j++) {
				if (((i % j) == 0) && (j != i)) {
					isPrime = true;
					break;
				}
			}

			if (!isPrime) {
				if (resultado < i)
					resultado = i;
			}
		}
		return "Maior numero primo: " + resultado;
	}
}
