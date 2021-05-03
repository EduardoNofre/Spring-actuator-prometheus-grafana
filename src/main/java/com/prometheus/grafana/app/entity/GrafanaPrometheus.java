package com.prometheus.grafana.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "GrafanaPrometheus")
public class GrafanaPrometheus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(description = "Id.", example = "123", required = true)
	@Column(name="id", length = 2)
	private Integer id;
	
	
	@Schema(description = "Nome.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name="nome", length = 50)
	private String  nome;
	
	
	@Schema(description = "idade.", example = "123", required = true)
	@Size(max = 2)
	@Column(name="idade", length = 2)
	private int idade;
	
	
	@Schema(description = "Endereco.", example = "abc", required = true)
	@Size(max = 100)
	@Column(name="endereco", length = 100)
	private String  endereco;
	
	
	@Schema(description = "Complemento do Endereco.", example = "abc")
	@Size(max = 50)
	@Column(name="enderecoComplemento", length = 50)
	private String  enderecoComplemento;
	
	@Schema(description = "Numero da Residencial.", example = "123", required = true)
	@Size(max = 50)
	@Column(name="numeroResidencial", length = 50)
	private int numeroResidencial;
	
	@Schema(description = "Numero do Apartamento.", example = "123", required = true)
	@Size(max = 50)
	@Column(name="numeroApartamento", length = 50)
	private int numeroApartamento;
}
