package deneme;

public class UrunManager {
	
	IUrunDao urunDao;
	
	public UrunManager(IUrunDao urunDao) {
		super();
		this.urunDao = urunDao;
	}
	
	public void add(Urun urun) {
		urunDao.add();
	}

}
