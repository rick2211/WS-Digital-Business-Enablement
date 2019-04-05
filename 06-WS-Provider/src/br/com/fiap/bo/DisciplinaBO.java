package br.com.fiap.bo;

public class DisciplinaBO {

	public double calcularMedia(float nac, float ps, float am) {
		return nac*0.2 + ps*0.5 + am*0.3;
	}
	
	public double calcularNotaExame(float media) {
		return 12 - media;
	}
	
	public boolean retidoFalta(int aulas, int faltas) {
		return aulas*0.25 < faltas;
	}
	
}