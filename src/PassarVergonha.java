import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PassarVergonha {
	static ExecutorService service = Executors.newFixedThreadPool(4);
	public static ConcurrentMap<Integer, Integer> mapa = new ConcurrentHashMap<Integer, Integer>();
	
	public static void main(String[] args) throws Exception {
		Thread t = new Thread(new Importador(new Mapeador(0, 2500)));
		Thread t2 = new Thread(new Importador(new Mapeador(1, 2500)));
		Thread t3 = new Thread(new Importador(new Mapeador(2, 2500)));
		Thread t4 = new Thread(new Importador(new Mapeador(3, 2500)));
		long ini = System.currentTimeMillis();
		service.execute(t);
		service.execute(t2);
		service.execute(t3);
		service.execute(t4);
		long fim = System.currentTimeMillis();
		System.out.println("Total Final: " + (fim - ini));
	}
	
}