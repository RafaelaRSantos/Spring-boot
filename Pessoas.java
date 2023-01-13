package com.criaco.demo.model;

//import java.time.LocalDate;
import java.util.Objects;

//import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;


@Entity
@IdClass(Pessoas.class)
public class Pessoas {
	
	@Column(nullable = false)
	private String nome;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional = false)
	@Column(name = "id", unique = true, nullable = false)
	private long id;

	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@Basic(optional = false)
	//@Column(name = "data_nascimento")
	///@DateTimeFormat(pattern = "dd/MM/yyyy")
	//private LocalDate dataNascimento;


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoas other = (Pessoas) obj;
		return id == other.id;
	}


	//public LocalDate getDataNascimento() {
		//return dataNascimento;
	//}


	//public void setDataNascimento(LocalDate dataNascimento) {
		//this.dataNascimento = dataNascimento;
	//}


	//@Override
	//public int hashCode() {
		//return Objects.hash(dataNascimento, id);
	//}


	
	

	
	
}

	
	
