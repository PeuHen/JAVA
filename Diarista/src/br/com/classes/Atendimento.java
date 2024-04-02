package br.com.classes;

public class Atendimento {
	
	private double horas;

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		
		if ( horas < 1 || horas>12) {
			System.out.println("Impossivel, horario tem q ser maior 1h ou menor 12h");
			 System.exit(0); //caso seja verdadeira, o cod. ira fechar
		} else {
			this.horas = horas; //caso seja falso, o cod ira continuar normal
		}
	}
}
