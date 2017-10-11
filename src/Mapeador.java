import java.util.concurrent.ConcurrentMap;

public class Mapeador implements Importable {

	private int particao;
	private int hue;
	private ConcurrentMap<Integer, Integer> mapa;
	
	public Mapeador(int particao, int hue, ConcurrentMap<Integer, Integer> mapa) {
		super();
		this.hue = hue;
		this.particao = particao;
		this.mapa = mapa;
	}
	
	public void funcao() {
		Integer total = hue * particao;
		
		long ini = System.currentTimeMillis();
		for (int i = total; i < total + hue; i++) {
			/*System.out.println("Particao: " + particao + " --- " + i + " --- time: "
					+ (System.currentTimeMillis() - ini));*/
			mapa.put(i, i);
		}
		long fim = System.currentTimeMillis();
		System.out.println("Total: " + (fim - ini) + " - Mapa: " + mapa.size());
	}
	
}
