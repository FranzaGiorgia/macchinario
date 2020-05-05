
public class Carat {
private String tipologia, caratteristiche;
private int codice, data;
private boolean riparazione;

public Carat(String t, String cara, int co, boolean r, int d) {
	tipologia=t;
	caratteristiche=cara;
	codice=co;
	data=d;
	riparazione=r;
	
}

public String getTipologia() {
	return tipologia;
}

public String getCaratteristiche() {
	return caratteristiche;
}

public int getCodice() {
	return codice;
}

public int getData() {
	return data;
}

public boolean isRiparazione() {
	return riparazione;
}

public void setTipologia(String tipologia) {
	this.tipologia = tipologia;
}

public void setCaratteristiche(String caratteristiche) {
	this.caratteristiche = caratteristiche;
}

public void setCodice(int codice) {
	this.codice = codice;
}

public void setData(int data) {
	this.data = data;
}

public void setRiparazione(boolean riparazione) {
	this.riparazione = riparazione;
}

public String toString() {
	return "il tipo è= " + tipologia + "le caratteristiche sono= " + caratteristiche +
			"il codice è= " + codice + "la data è= " + data + "la riparazione= "  + riparazione + "";
}

}
