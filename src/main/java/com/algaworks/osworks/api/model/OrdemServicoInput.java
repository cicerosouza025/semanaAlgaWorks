package com.algaworks.osworks.api.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrdemServicoInput {
	
	@NotNull
	private String descricao;
	
	@NotNull
	private BigDecimal preco;
	
	@NotNull
	@Valid
	private ClienteIdInput cliente;
	

}
