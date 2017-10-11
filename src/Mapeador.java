import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class Mapeador {

	private int particao;
	private int hue;
	
	public Mapeador(int particao, int hue) {
		super();
		this.hue = hue;
		this.particao = particao;
	}
	
	public void funcao() {
		Integer total = hue * particao;
		
		long ini = System.currentTimeMillis();
		for (int i = total; i < total + hue; i++) {
			/*System.out.println("Particao: " + particao + " --- " + i + " --- time: "
					+ (System.currentTimeMillis() - ini));*/
			PassarVergonha.mapa.put(i, i);
		}
		long fim = System.currentTimeMillis();
		System.out.println("Total: " + (fim - ini) + " - Mapa: " + PassarVergonha.mapa.size());
	}
	
}
