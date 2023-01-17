package enumeracije;

public enum Pol {
	muski,
	zenski;
	
	
	public static Pol valueOf(int a) {
		switch (a) {
		case 1:
			return muski;
		default:
			return zenski;
		}
	}
	
	public static int toInt(Pol pol) {
		switch (pol) {
		case muski:
			return 1;
		default:
			return 2;
		}
	}

}
