package p0718_singleton;

public class Speaker3 {
	private  static Speaker3 speaker=new Speaker3();
	private int volume;
	
	private Speaker3() {
		volume=5;
	}

	public static Speaker3 getInstance() {
		return speaker;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}