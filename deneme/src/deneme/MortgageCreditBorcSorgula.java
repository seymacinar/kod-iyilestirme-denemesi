package deneme;

public class MortgageCreditBorcSorgula extends BorcSorgula{
	Urun urun;
	double borc;
	
	public void sorgula(Urun mortgageCreditUrunu) {
		borc = ((MortgageCreditUrunu) mortgageCreditUrunu).getAnaPara() + ((MortgageCreditUrunu) mortgageCreditUrunu).getKomisyon();
		System.out.println(borc);
		
	}

}
