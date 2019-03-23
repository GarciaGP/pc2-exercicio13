package br.com.etechoracio.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_ENDERECO")
public class Endereco extends BaseORM {

	@Id
	@GeneratedValue
	@Column(name="ID_ENDERECO")
	private Long id;
	
	@Column(name="TX_LOGRADOURO")
	private String logradouro;
	
	@Column(name="NR_LOGRADOURO")
	private Long numero;
	
	@Column(name="TX_COMPLEMENTO")
	private String complemento;
	
	@Column(name="TX_BAIRRO")
	private String bairro;
	
	@Column(name="TX_CIDADE")
	private String cidade;
	
	@Column(name="TX_UF")
	private String uf;
	
	@Column(name="TX_CEP")
	private String cep;
	
	@OneToOne
	@JoinColumn(name="ID_ALUNO")
	private Aluno aluno;
	
}
