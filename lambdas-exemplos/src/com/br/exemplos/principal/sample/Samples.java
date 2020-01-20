package com.br.exemplos.principal.sample;

import java.util.ArrayList;
import java.util.List;

import com.br.exemplos.listas.Listas;
import com.br.exemplos.model.Cliente;

public class Samples {

	public void forNomralDeObjetos() {

		Listas listaClientes = new Listas();

		for (Cliente c : listaClientes.listaCliente()) {

			System.out.println(c.getNome());
		}
	}

	// Simples forEach
	public void forEachLambda() {

		Listas listaClientes = new Listas();

		listaClientes.listaCliente().forEach((Cliente c) -> System.out.println(c.getNome() + " " + c.getIdade()));

	}

	// Estou utilizando a chave porque tem mais de uma condição
	public void forEachLambdautilizandoChave() {

		Listas listaClientes = new Listas();

		listaClientes.listaCliente().forEach((Cliente c) -> {
			System.out.println(c.getNome() + " " + c.getIdade() + " " + c.getTelefone() + " " + c.isEnviado());
			c.setEnviado(true);
			c.setTelefone("xxx-xxx");
		});
	}

	// lambda forEach atribuindo em outra lista
	public void listaAtribuindoEmoutraLista() {

		Listas listaClientes = new Listas();
		
		List<Integer> listaIdade = new ArrayList<Integer>();
		
		listaClientes.listaCliente().forEach(cliente -> {listaIdade.add(cliente.getIdade());
		});
	
		System.out.println(listaIdade);
	}
	
	public void listaOptinal() {
		
		Listas listaClientes = new Listas();
		
		if(listaClientes.listaClienteOptional().isPresent()) {
		
			listaClientes.listaClienteOptional().get().forEach(cliente -> System.out.println(cliente.getNome()));
		}
		
	}

}
