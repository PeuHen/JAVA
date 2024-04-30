package br.com.app;

import java.util.Scanner;

import br.com.classes.Cliente;
import br.com.classes.Pedido;
import br.com.classes.Produto;

public class App {

	public static void main(String[] args) {
		
		//criando objeto
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		Cliente cliente1 = new Cliente();
		Pedido pedido = new Pedido();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		produto1.setDescricao(sc.nextLine());
		System.out.println("Digite o valor: ");
		produto1.setValor(sc.nextDouble());
		
		sc.nextLine();
		System.out.println("Digite o nome do produto: ");
		produto2.setDescricao(sc.nextLine());
		System.out.println("Digite o valor: ");
		produto2.setValor(sc.nextDouble());
		
		sc.nextLine();
		System.out.println("Digite o nome do produto: ");
		produto3.setDescricao(sc.nextLine());
		System.out.println("Digite o valor: ");
		produto3.setValor(sc.nextDouble());
		
		//produto1.setDescricao="laptop core I5 16ram";
		//produto1.valor=5.500;

		//produto2.descricao="mouse sem fio";
		//produto2.valor=200;
		
		//produto3.descricao="headset sem fio";
		//produto3.valor=500;
		sc.nextLine();
		System.out.println("Digite o seu nome: ");
		cliente1.setNome(sc.nextLine());
		//cliente1.setNome="Osvaldo";
		//cliente1.telefone="11 54544-7887";
		//cliente1.email="osvaldinho@fecaf.com";
		System.out.println("Digite o seu telefone: ");
		cliente1.setTelefone(sc.nextLine());
		System.out.println("Digite o seu email: ");
		cliente1.setEmail(sc.nextLine());
		
		pedido.setCliente(cliente1); // tudo que envolve cliente1, o pedido.cliente vai ter acesso
		pedido.setNumero(1);
		
		pedido.produtos.add(produto2);
		pedido.produtos.add(produto2);
		pedido.produtos.add(produto3);
		pedido.produtos.add(produto1);
		pedido.mostrarPedido();
		
		sc.close();
	}
	

}
