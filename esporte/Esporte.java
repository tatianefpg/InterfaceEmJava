package esporte;

public class Esporte {

	private EsporteOlimpicoColetivo nomeEsporte;
	private int tempoDeJogo;

	public EsporteOlimpicoColetivo getNomeEsporte() {
		return nomeEsporte;
	}

	public void setNomeEsporte(EsporteOlimpicoColetivo nomeEsporte) {
		this.nomeEsporte = nomeEsporte;
	}

	public int getTempoDeJogo() {
		return tempoDeJogo;
	}

	public void setTempoDeJogo(int tempoDeJogo) {
		this.tempoDeJogo = tempoDeJogo;
	}

	/*
	 * public void retornarDDadosDoEsporte() { if
	 * (EsporteOlimpicoColetivo.BASQUETE.equals(getNomeEsporte())) {
	 * setTempoDeJogo(40); } else if
	 * (EsporteOlimpicoColetivo.FUTEBOL.equals(getNomeEsporte())) {
	 * setTempoDeJogo(90); } else if
	 * (EsporteOlimpicoColetivo.VOLEI.equals(getNomeEsporte())) {
	 * setTempoDeJogo(1000000); } else if
	 * (EsporteOlimpicoColetivo.RUGBY.equals(getNomeEsporte())) {
	 * setTempoDeJogo(80); } }
	 */

}
