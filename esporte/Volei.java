package esporte;

public class Volei extends Esporte implements RegrasEsporte {

	@Override
	public void tempoDeJogo() {
		setTempoDeJogo(1000000);
	}

}
