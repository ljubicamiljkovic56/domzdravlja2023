package pacijentPaket;

import enumeracije.Pol;
import enumeracije.Uloga;
import knjizicaPaket.Knjizica;
import osnovniPaket.Osoba;
import zaposleniPaket.Lekar;

public class Pacijent extends Osoba {
	private Lekar izabraniLekar;
	private Knjizica knjizica;
	
	public Pacijent() {
		this.izabraniLekar = null;
		this.knjizica = null;
	}
	
	public Pacijent(String ime, String prezime, String jmbg, Pol pol, String adresa, String brojTel,
			String korisnickoIme, String lozinka, Uloga uloga, Lekar izabraniLekar, Knjizica knjizica) {
		super(ime, prezime, jmbg, pol, adresa, brojTel, korisnickoIme, lozinka, uloga);
		this.izabraniLekar = izabraniLekar;
		this.knjizica = knjizica;
	}

	public Pacijent(Pacijent original) {
		this.izabraniLekar = original.izabraniLekar;
		this.knjizica = original.knjizica;
	}
	public Lekar getIzabraniLekar() {
		return izabraniLekar;
	}
	public void setIzabraniLekar(Lekar izabraniLekar) {
		this.izabraniLekar = izabraniLekar;
	}
	public Knjizica getKnjizica() {
		return knjizica;
	}
	public void setKnjizica(Knjizica knjizica) {
		this.knjizica = knjizica;
	}

	@Override
	public String toString() {
		return "Pacijent:  "
				+ "izabraniLekar: " + izabraniLekar + 
				", knjizica: " + knjizica + 
				", ime: " + ime + 
				", prezime: " + prezime + 
				", jmbg: " + jmbg + 
				", pol: " + pol + 
				", adresa: " + adresa + 
				", brojTel: " + brojTel + 
				", korisnickoIme: " + korisnickoIme + 
				", lozinka: " + lozinka + 
				", uloga: " + uloga + " ";
	}
	

	
}
