package activities.week01.revisao;

import java.util.List;

public class CalculadoraNotasImpl extends CalculadoraNotas {

	public CalculadoraNotasImpl(BaseDados dados) {
		super(dados);
	}

	@Override
	public float calculaNotaFinal(Aluno a) {
		List<Float> notas = a.getNotas();
		float P1 = notas.get(0);
		float P2 = notas.get(1);
		
		return (P1+P2)/2f;
	}

}
