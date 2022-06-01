package deneme;

public class CreditCardBorcSorgula extends BorcSorgula{
	Urun urun;
	double borc;
	
	public void sorgula(Urun creditCardUrunu) {
		borc = ((CreditCardUrunu) creditCardUrunu).getAnaPara() + ((CreditCardUrunu) creditCardUrunu).getFaiz() + ((CreditCardUrunu) creditCardUrunu).getGecikmeFaizi();
		System.out.println(borc);
		
	}
}
