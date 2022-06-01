package deneme;

public class VergiBorcuUrunu extends Urun{

	double tutar;

	public VergiBorcuUrunu(int urunId, double tutar) {
		super(urunId);
		this.tutar = tutar;
	}
	
	public VergiBorcuUrunu() {
	}

	public double getTutar() {
		return tutar;
	}

	public void setTutar(double tutar) {
		this.tutar = tutar;
	}

}
