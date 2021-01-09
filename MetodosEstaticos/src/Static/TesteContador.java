package Static;

public class TesteContador {
	
	static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}

	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i ++) {
			Contador.incrementar();
		}
		imprimirValor();
		
		Contador cont1 = new Contador();
		Contador cont2 = new Contador();
		imprimirValor();
	}

}
