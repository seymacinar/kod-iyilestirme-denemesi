package deneme;

public class MortgageCreditUrunu extends Urun{

	double anaPara;
	double komisyon;

	public MortgageCreditUrunu(int urunId, double anaPara, double komisyon) {
		super(urunId);
		this.anaPara = anaPara;
		this.komisyon = komisyon;
	}
	
	public MortgageCreditUrunu() {
	}

	public double getAnaPara() {
		return anaPara;
	}

	public void setAnaPara(double anaPara) {
		this.anaPara = anaPara;
	}

	public double getKomisyon() {
		return komisyon;
	}

	public void setKomisyon(double komisyon) {
		this.komisyon = komisyon;
	}

}
