package deneme;

public class HibernateUrunDao implements IUrunDao{

	@Override
	public void add() {
		System.out.println("Urun Hibernate kullanilarak eklendi.");
		
	}

}
