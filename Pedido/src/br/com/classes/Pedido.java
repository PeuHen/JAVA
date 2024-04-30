package br.com.classes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int numero;
	private double total;
	private Cliente cliente; // criando uma variavel com acesso a classe cliente
	// Iniciando (criando) uma lista  de produtos; dentro do < > é chamado de operador diamante
	public List<Produto> produtos = new ArrayList<>();
	
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public void mostrarPedido() {
		System.out.println("----------------------");
		System.out.println("Numero do pedido: " + getNumero());
		System.out.println("----------------------");
		System.out.println("Nome do cliente:" + cliente.getNome()); // chamando o objeto NOME q esta no cliente
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("Email do cliente : " + cliente.getEmail());
		System.out.println("----------------------");
		System.out.println("Itens do pedido");
		System.out.println("----------------------");
		
		// laço de repetição que ocorre de acordo com a quantidade de produto
		for (Produto p : produtos ) { // Produto virou p
			System.out.println("--" + p.getDescricao());
			System.out.println("--" + p.getValor());
			total += p.getValor();
		}
		System.out.println("----------------------");
		
		System.out.println("Total: " + getTotal());
		
		}
		
	}
		

