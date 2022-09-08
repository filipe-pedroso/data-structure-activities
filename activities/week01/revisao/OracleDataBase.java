package activities.week01.revisao;

import java.util.ArrayList;
import java.util.List;

public class OracleDataBase implements BaseDados {

	@Override
	public List<Aluno> getAlunos() {
		List<Aluno> lista = new ArrayList<Aluno>();
		lista.add(new Aluno("Guilherme").addNota(4f).addNota(5.6f));
		lista.add(new Aluno("Jo�o").addNota(7f).addNota(9.6f));
		return lista;
	}

}
