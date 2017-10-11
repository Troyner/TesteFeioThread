import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

public class Importador implements Runnable {
	Mapeador mapeador;

	public Importador(Mapeador m) {
		mapeador = m;
	}

	@Override
	public void run() {
		mapeador.funcao();
	}
}