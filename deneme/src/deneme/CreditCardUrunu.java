package deneme;

public class CreditCardUrunu extends Urun{

	public double anaPara;
	double faiz;
	double gecikmeFaizi;

	public double getAnaPara() {
		return anaPara;
	}

	public void setAnaPara(double anaPara) {
		this.anaPara = anaPara;
	}

	public double getFaiz() {
		return faiz;
	}

	public void setFaiz(double faiz) {
		this.faiz = faiz;
	}

	public double getGecikmeFaizi() {
		return gecikmeFaizi;
	}

	public void setGecikmeFaizi(double gecikmeFaizi) {
		this.gecikmeFaizi = gecikmeFaizi;
	}
	
	public CreditCardUrunu(int urunId, double anaPara, double faiz, double gecikmeFaizi) {
		super(urunId);
		this.anaPara = anaPara;
		this.faiz = faiz;
		this.gecikmeFaizi = gecikmeFaizi;
	}
	
	public CreditCardUrunu() {
	
	}


}
