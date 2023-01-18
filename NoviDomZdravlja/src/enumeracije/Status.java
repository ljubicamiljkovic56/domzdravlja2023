package enumeracije;

public enum Status {
	zatrazen,
	zakazan,
	otkazan,
	zavrsen;
	
	public static Status valueOf(int a) {
		switch (a) {
		case 1:
			return zatrazen;
		case 2:
			return zakazan;
		case 3:
			return otkazan;
		default:
			return zavrsen;
		}
	}
	
	public static int toInt(Status status) {
		switch (status) {
		case zatrazen:
			return 1;
		case zakazan:
			return 2;
		case otkazan:
			return 3;
		default:
			return 4;
		}
	}
}
