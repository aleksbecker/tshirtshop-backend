package com.turing.tshirtshop.api.payload;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.Instant;
import java.util.List;

public class ProcessoResponse {
    private Long id;
    private Integer numero;
    private String question;
    private UserSummary createdBy;
	private Instant creationDateTime;
    private Instant expirationDateTime;
    private Boolean isExpired;

    private String parecer;
    private String usersFinalizadores;
    
    
    public ProcessoResponse(Long id, Integer numero,Instant creationDateTime, String parecer, String usersFinalizadores) {
		this.id=id;
		this.numero=numero;
		this.creationDateTime=creationDateTime;
		this.parecer=parecer;
		this.usersFinalizadores=usersFinalizadores;
	}
    

    public String getUsersFinalizadores() {
		return usersFinalizadores;
	}


	public void setUsersFinalizadores(String usersFinalizadores) {
		this.usersFinalizadores = usersFinalizadores;
	}


	public String getParecer() {
		return parecer;
	}


	public void setParecer(String parecer) {
		this.parecer = parecer;
	}


	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public UserSummary getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserSummary createdBy) {
        this.createdBy = createdBy;
    }


    public Instant getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Instant creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public Instant getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(Instant expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    public Boolean getExpired() {
        return isExpired;
    }

    public void setExpired(Boolean expired) {
        isExpired = expired;
    }

}
