package br.com.classes;

import interfaces.Isaldo;

public abstract class Pessoa implements Isaldo {
	
	
private double saldo=0;

private String nome;

private String endereco;

private String telefone;
private String ChavePix;


//METODOS ACESSORES  (pós deixar privado os atributos acima)
	// get pegar; set colocar 
public String getNome() { 		// esse vai tirar algo da variavel nome
	return nome;
}

public void setNome(String nome) { // esse vai colocar algo na variavel nome
	this.nome = nome;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}
	public String getChavePix() {
		return ChavePix;
	}

	public void setChavePix(String chavePix) {
		ChavePix = chavePix;
	}


}