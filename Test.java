package Data_Accessor.Bulb.DTO;

public class Test {

	public static void main(String[] args) {
		BulbDao bulbDao=new BulbDao();
		DTO createBulbDto=bulbDao.createBulbDto(123456, "Philips", 123, 30, "blue");
		bulbDao.displayBulbDTO(createBulbDto);

		

	}

}
