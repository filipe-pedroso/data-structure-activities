package activities.week01.revisao;

public class Main {

	public static void main(String[] args) {
		BaseDados base = new OracleDataBase();
		CalculadoraNotas calc = new CalculadoraNotasImpl(base);
		calc.imprimeNotas();
		
	}

}
