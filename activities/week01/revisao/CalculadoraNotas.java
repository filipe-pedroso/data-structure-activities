package activities.week01.revisao;

import java.util.List;

public abstract class CalculadoraNotas {
	protected BaseDados baseDados;

	public CalculadoraNotas(BaseDados dados){
		this.baseDados = dados;
	}
	
	public void imprimeNotas(){
		List<Aluno> alunos = baseDados.getAlunos();
		for (Aluno a : alunos){
			float f = this.calculaNotaFinal(a);
			System.out.println(a.getNome() + " - " + f);
		}
	}
	
	public abstract float calculaNotaFinal(Aluno a);
}
