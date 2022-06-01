package deneme;

public class VergiBorcuSorgula extends BorcSorgula{
	
	Urun urun;
	double borc;
	
	public void sorgula(Urun vergiBorcuUrunu) {
		borc = ((VergiBorcuUrunu) vergiBorcuUrunu).getTutar() ;
		System.out.println(borc);
		
	}

}
