package knjizicaPaket;

import java.util.Date;

import enumeracije.Kategorija;
import pacijentPaket.Pacijent;

public class Knjizica {
	private Pacijent pacijent;
	private String brojKnjizice;
	private Date datumIsteka;
	private Kategorija kategorija;

	public Knjizica() {
		this.pacijent = null;
		this.brojKnjizice = "";
		this.datumIsteka = null;
		this.kategorija = Kategorija.treca;
	}
	
	public Knjizica(Pacijent pacijent, String brojKnjizice, Date datumIsteka, Kategorija kategorija) {
		super();
		this.pacijent = pacijent;
		this.brojKnjizice = brojKnjizice;
		this.datumIsteka = datumIsteka;
		this.kategorija = kategorija;
	}
	
	public Knjizica(Knjizica original) {
		this.pacijent = original.pacijent;
		this.brojKnjizice = original.brojKnjizice;
		this.datumIsteka = original.datumIsteka;
		this.kategorija = original.kategorija;
	}

	public Pacijent getPacijent() {
		return pacijent;
	}

	public void setPacijent(Pacijent pacijent) {
		this.pacijent = pacijent;
	}

	public String getBrojKnjizice() {
		return brojKnjizice;
	}

	public void setBrojKnjizice(String brojKnjizice) {
		this.brojKnjizice = brojKnjizice;
	}

	public Date getDatumIsteka() {
		return datumIsteka;
	}

	public void setDatumIsteka(Date datumIsteka) {
		this.datumIsteka = datumIsteka;
	}

	public Kategorija getKategorija() {
		return kategorija;
	}

	public void setKategorija(Kategorija kategorija) {
		this.kategorija = kategorija;
	}

	@Override
	public String toString() {
		return "Knjizica pacijent: " + pacijent + 
				", brojKnjizice: " + brojKnjizice + 
				", datumIsteka: " + datumIsteka + 
				", kategorija: " + kategorija + " ";
	}
	
}