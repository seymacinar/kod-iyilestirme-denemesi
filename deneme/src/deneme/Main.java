package deneme;

public class Main {

	public static void main(String[] args) {
		
		Urun urun = new CreditCardUrunu(1, 100, 10, 5);
		CreditCard creditCard = new CreditCard(new CreditCardUrunManager(new HibernateUrunDao()));
		creditCard.creditCardUrunManager.add(urun);
		

		Urun urun2 = new MortgageCreditUrunu(2, 1000, 200);
		MortgageCredit mortgageCredit = new MortgageCredit(new MortgageCreditUrunManager(new HibernateUrunDao()));
		mortgageCredit.mortgageCreditUrunManager.add(urun2);
		
		Urun urun3 = new VergiBorcuUrunu(3, 1500); 
		VergiBorcu vergiBorcu = new VergiBorcu(new VergiBorcuUrunManager(new HibernateUrunDao()));
		vergiBorcu.vergiBorcuUrunManager.add(urun3);
		
		BorcSorgula borcSorgula = new CreditCardBorcSorgula();
		((CreditCardBorcSorgula) borcSorgula).sorgula(urun);
		
		BorcSorgula borcSorgula2 = new MortgageCreditBorcSorgula();
		((MortgageCreditBorcSorgula) borcSorgula2).sorgula(urun2);
		
		BorcSorgula borcSorgula3 = new VergiBorcuSorgula();
		((VergiBorcuSorgula) borcSorgula3).sorgula(urun3);
	
		
	}

}
