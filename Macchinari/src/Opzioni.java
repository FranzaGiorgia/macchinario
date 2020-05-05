/*Scrivere un programma Java che consenta ad un responsabile di laboratorio di tenere aggiornato il registro
dei macchinari presenti nel laboratorio stesso.
Ogni macchinario è descritto da:
- Tipologia (computer/stampante/dispositivo generico)
- Caratteristiche
- Codice
- Data
- Funzionante/non funzionante
- In Riparazione
Il programma consente di:
1. Aggiungere un macchinario   fatto
2. Modificare il macchinario(funzionante/non funzionante)
3. Modificare il macchinario(In riparazione si/no) fatto
4. Stampare tutti i macchinari funzionanti     fatto
5. Stampare tutti i macchinari in riparazione   fatto
6. Stampare il macchinario più recente*/
public class Opzioni {
public Carat[] Macchinari;
private int numM;
public Opzioni() {
	numM=0;
	Macchinari=new Carat[30];
}
public void addMacchinario(Carat c) {
	if(numM<30) {
		Macchinari[numM]=c;
		numM++;
	}
}
public int getFunzionante() {
	int cont =0;
	for(int i=0; i<numM; i++)
		if(Macchinari[i].isRiparazione()==true)
			cont++;
		
	return cont;
}
public String toString() {
	String s="macchinari riparati";
	for (int i=0; i<numM; i++)
		s+=Macchinari[i];
	return s;
}
public void addMacchiariFun(Carat c) {
	if(numM<30) {
		Macchinari[numM]=c;
		numM++;
	}
}
public void addMacchiariRipar(Carat c) {
	if(numM<30) {
		Macchinari[numM]=c;
		numM--;
	}
}
public static void main(String[] args) {
	Opzioni o= new Opzioni();
	Carat c= new Carat ("auto", "verde", 233, true, 22/03/2009 );
	Carat c1= new Carat ("moto", "gialla", 23, true, 22/03/2006 );
	System.out.println("la prima auto è: "+ c);
	System.out.println("la seconda auto è: "+ c1);
}
}




