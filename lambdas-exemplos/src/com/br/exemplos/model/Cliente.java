package com.br.exemplos.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

	private int id;
	private String nome;
	private String telefone;
	private int idade;
	private boolean enviado;
}
