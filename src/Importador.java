public class Importador implements Runnable {
	Importable importable;

	public Importador(Importable importable) {
		this.importable = importable;
	}

	@Override
	public void run() {
		importable.funcao();
	}
}