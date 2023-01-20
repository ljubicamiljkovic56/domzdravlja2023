package main;

import glavniILogin.Login;
import knjizicaPaket.Knjizica;
import listePaket.Liste;

public class MainApp {

	public static void main(String[] args) {
		Liste liste = new Liste();
		liste.ucitajSestru();
		liste.ucitajLekara();
		liste.ucitajPacijenta();
		liste.ucitajPregled();
		liste.ucitajKnjizicu();
		Knjizica knjizica = new Knjizica();
		Login login = new Login(liste,knjizica);
		login.setVisible(true);

	}

}
