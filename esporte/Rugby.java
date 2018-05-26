package esporte;

public class Rugby extends Esporte implements RegrasEsporte {

	@Override
	public void tempoDeJogo() {
		setTempoDeJogo(80);
	}

}
