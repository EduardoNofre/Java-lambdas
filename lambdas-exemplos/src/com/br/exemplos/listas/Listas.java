package com.br.exemplos.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.br.exemplos.model.Cliente;

public class Listas {

	public List<Cliente> listaCliente() {

		// List<Cliente> clientes = new ArrayList<Cliente>();

		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		Cliente cliente4 = new Cliente();
		Cliente cliente5 = new Cliente();
		Cliente cliente6 = new Cliente();

		// 1
		cliente1.setId(1);
		cliente1.setNome("eu");
		cliente1.setIdade(33);
		cliente1.setTelefone("1111-1111");
		// clientes.add(cliente1);

		// 2
		cliente2.setId(1);
		cliente2.setNome("tu");
		cliente2.setIdade(26);
		cliente2.setTelefone("2222-2222");
		// clientes.add(cliente2);

		// 3
		cliente3.setId(1);
		cliente3.setNome("nos");
		cliente3.setIdade(15);
		cliente3.setTelefone("3333-3333");
		// clientes.add(cliente3);

		// 4
		cliente4.setId(1);
		cliente4.setNome("vos");
		cliente4.setIdade(18);
		cliente4.setTelefone("4444-4444");
		// clientes.add(cliente4);

		// 5
		cliente5.setId(1);
		cliente5.setNome("seus");
		cliente5.setIdade(24);
		cliente5.setTelefone("555-555");
		// clientes.add(cliente5);

		cliente6.setId(1);
		cliente6.setNome("outros");
		cliente6.setIdade(29);
		cliente6.setTelefone("6666-6666");
		// clientes.add(cliente6);

		return Arrays.asList(cliente1, cliente2, cliente3, cliente4, cliente5, cliente6);
	}
	
	
	public Optional<List<Cliente>> listaClienteOptional() {

		Optional<List<Cliente>> op = null;

		List<Cliente> clientes = new ArrayList<Cliente>();

		Cliente cliente1 = new Cliente();

		// 1
		cliente1.setId(1);
		cliente1.setNome("eu");
		cliente1.setIdade(33);
		cliente1.setTelefone("1111-1111");
		clientes.add(cliente1);

		return op;
	}
}
