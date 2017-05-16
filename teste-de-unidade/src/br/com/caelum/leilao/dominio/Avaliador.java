package br.com.caelum.leilao.dominio;

public class Avaliador {
	private Double menorDeTodos = Double.POSITIVE_INFINITY;
	private Double maiorDeTodos = Double.NEGATIVE_INFINITY;

	public void avalia(Leilao l) {
		for (Lance lance : l.getLances()) {
			if (lance.getValor() < this.menorDeTodos) {
				this.menorDeTodos = lance.getValor();
			}
			if (lance.getValor() > this.maiorDeTodos) {
				this.maiorDeTodos = lance.getValor();
			}
		}
	}

	public double calculaMediaDosLances(Leilao l) {
		double somaDosLances = 0;
double mediaDosLances = 0;

		for (Lance lance : l.getLances()) {
somaDosLances += lance.getValor();
		}
		
mediaDosLances = somaDosLances/l.getLances().size();		

		return mediaDosLances;
	}

	public Double getMenorLance() {
		return menorDeTodos;
	}

	public Double getMaiorLance() {
		return maiorDeTodos;
	}

}
