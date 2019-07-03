package com.turing.tshirtshop.payload;

import javax.validation.constraints.NotNull;

public class ProcessoRequest {
    
	@NotNull
    private Integer numero;
    
    private String parecer;
	
    private Long id;
	
    private Long idUsuarioFinalizador;
    
	
	public Long getIdUsuarioFinalizador() {
		return idUsuarioFinalizador;
	}

	public void setIdUsuarioFinalizador(Long idUsuarioFinalizador) {
		this.idUsuarioFinalizador = idUsuarioFinalizador;
	}

	public String getParecer() {
		return parecer;
	}

	public void setParecer(String parecer) {
		this.parecer = parecer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

    
}
