import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Players {
	
	private static final AtomicInteger count = new AtomicInteger(0); 
	private static Long id;
	private String name;
	private int kills;
	private ArrayList<String> old_names;

	public Players(String name, int kills, ArrayList<String> old_names) {
		Players.id = (long) count.incrementAndGet();
		this.name = name;
		this.kills = kills;
		this.old_names = old_names;
	}

	public static Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getKills() {
		return kills;
	}

	public ArrayList<String> getOld_names() {
		return old_names;
	}
	
	public void setOld_names(String nomes) {
		this.old_names.add(nomes);
	}
	
}
