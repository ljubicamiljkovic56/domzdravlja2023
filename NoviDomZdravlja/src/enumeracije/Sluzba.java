package enumeracije;

public enum Sluzba {
	Sluzba_opste_medicine,
	Sluzba_zdravstvene_zastite_dece,
	Stomatološka_sluzba,
	Sluzba_zdravstvene_zastite_radnika,
	Sluzba_za_pravne_i_ekonomske_poslove,
	Sluzba_za_tehnicke_poslove; 
	
	public static Sluzba valueOf(int a) {
		switch(a) {
		case 1:
			return Sluzba_opste_medicine;
		case 2:
			return Sluzba_zdravstvene_zastite_dece;
		case 3:
			return Stomatološka_sluzba;
		case 4:
			return Sluzba_zdravstvene_zastite_radnika;
		case 5:
			return Sluzba_za_pravne_i_ekonomske_poslove;
		default:
			return Sluzba_za_tehnicke_poslove;
		}
	}
	public static int toInt(Sluzba sluzba) {
		switch(sluzba) {
		case Sluzba_opste_medicine:
			return 1;
		case Sluzba_zdravstvene_zastite_dece:
			return 2;
		case Stomatološka_sluzba:
			return 3;
		case Sluzba_zdravstvene_zastite_radnika:
			return 4;
		case Sluzba_za_pravne_i_ekonomske_poslove:
			return 5;
		default:
			return 6;
		}
	}

}
