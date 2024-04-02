package br.com.app;

import java.util.Scanner;

import br.com.classes.Atendimento;
import br.com.classes.Cliente;
import br.com.classes.Diarista;


	public class App {
	
		public static void main(String[] args) {
			//Criando instancia da classe diarista (objeto)
			Diarista diarista = new Diarista();
			Scanner campo = new Scanner(System.in);
			Cliente cliente = new Cliente();
			Atendimento atendimento = new Atendimento();
			
			
			
			
			
			
			
			System.out.println("Digite o nome do Cliente: ");
			cliente.setNome(campo.nextLine()); 
			System.out.println("Digite o telefone do Cliente: ");
			cliente.setTelefone(campo.nextLine());
			System.out.println("Digite o endereco do Cliente: ");
			cliente.setEndereco(campo.nextLine());
			cliente.setSaldo(100.00); //por nao entar valor
			System.out.println("Quantas horas? ");
			atendimento.setHoras(campo.nextDouble());
			cliente.depositar(campo.nextDouble());
			
			
			campo.nextLine();
			System.out.println("Digite o nome da Diarista: ");
			diarista.setNome(campo.nextLine());
			System.out.println("Digite o telefone da Diarista: ");
			diarista.setTelefone (campo.nextLine());
			System.out.println("Digite o endereco da Diarista: ");
			diarista.setEndereco (campo.nextLine());
			System.out.println("Digite a Chave Pix: ");
			diarista.setChavePix(campo.nextLine());
			
			
			System.out.println("======Dados clientes=======");
			System.out.println("Nome do Cliente: " + cliente.getNome());
			System.out.println("Telefone do Cliente: " + cliente.getTelefone());
			System.out.println("Endereço do Cliente: " + cliente.getEndereco());
			System.out.println("Endereço do Cliente: " + cliente.getSaldo());
			
			System.out.println("Atendimento é " + cliente.depositar());
			
			
			System.out.println("======Dados Diarista=======");
			System.out.println("Nome da Diarista: " + diarista.getNome());	
			System.out.println("Telefone da Diarista: " + diarista.getTelefone());
			System.out.println("Endereço da Diarista: " + diarista.getEndereco());
			System.out.println("Chave Pix: " + diarista.getChavePix());
			
			
			
			campo.close();
			
		}
	}
