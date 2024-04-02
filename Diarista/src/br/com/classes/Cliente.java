package br.com.classes;

public class Cliente extends Pessoa{
//saldo


	@Override
public void depositar(double valor) {
		var saldoAtual = getSaldo();
		var novoSaldo = saldoAtual + valor;
		setSaldo(valor);
			
		}

		

@Override
public void sacar(double valor) {
		
			
		}
	


}