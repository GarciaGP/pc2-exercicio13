package br.com.etechoracio.training.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_ALUNO")
public class Aluno extends BaseORM {
	
	@Id
	@GeneratedValue
	@Column(name="ID_ALUNO")
	private Long id;
	
	@Column(name="NM_ALUNO")
	private String nome;
	
	@Column(name="NR_CPF")
	private Long cpf;
	
	@Column(name="TX_FONE")
	private String telefone;
	
	@Column(name="TX_EMAIL")
	private String email;
	
	@Column(name="DT_CRIACAO")
	private Date dataCriacao;
	
	@OneToOne(mappedBy="aluno", cascade = CascadeType.ALL)
	private Endereco endereco = new Endereco();
	
}
