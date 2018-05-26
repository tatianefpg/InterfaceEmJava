package esporte;

public class Futebol extends Esporte implements RegrasEsporte {

	@Override
	public void tempoDeJogo() {
		setTempoDeJogo(90);
	}

}
