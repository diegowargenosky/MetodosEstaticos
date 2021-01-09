package Static;

public class Contador {

	static int cont;
	
	
    //* Toda vez que instanciar um objeto dessa classe é incrementado 1 */
	public Contador() {
		cont ++;
	}
	public static void incrementar() {

		cont++;

	}
	public static void decrementar() {
		cont --;
	}

	public static void zerar() {
		cont = 0;
	}
	
	public static int obterValor() {
		return cont;
	}
}
