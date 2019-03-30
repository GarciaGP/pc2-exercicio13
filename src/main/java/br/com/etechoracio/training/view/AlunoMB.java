package br.com.etechoracio.training.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.common.view.BaseMB;
import br.com.etechoracio.training.business.AlunoSB;
import br.com.etechoracio.training.model.Aluno;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
@Scope("view")
public class AlunoMB extends BaseMB {

	@Autowired
	private AlunoSB alunoSB;
	
	private Aluno edit = new Aluno();
	
	public void onSave() {
		edit.getEndereco().setAluno(edit);
		alunoSB.save(edit);
		showInsertMessage();
	}
}
