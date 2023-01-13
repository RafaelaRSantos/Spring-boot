package com.criaco.demo.localizacao;


import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(Endereco.class)
public class Endereco {
	
	@Column(nullable = false)
	private String Logradouro;
	
	@Id
	private int CEP;
	@Id
	private int Numero;
	
	@Column(nullable = false)
	private String Cidade;

	public String getLogradouro() {
		return Logradouro;
	}

	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}

	public int getCEP() {
		return CEP;
	}

	public void setCEP(int cEP) {
		CEP = cEP;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CEP, Cidade, Logradouro, Numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return CEP == other.CEP && Objects.equals(Cidade, other.Cidade) && Objects.equals(Logradouro, other.Logradouro)
				&& Numero == other.Numero;
	}

	
}
