package Data_Accessor.Bulb.DTO;

public class BulbDao {

	public BulbDao() {
		System.out.println("Inside DAO constructor");
	}

	public DTO createBulbDto(int serialNumber, String brand, int price, int volt, String color) {
		System.out.println("Inside a create method");
		DTO bulbDTO = new DTO(serialNumber, brand, price, volt, color);
		return bulbDTO;
	}

	public void displayBulbDTO(DTO dto) {
		System.out.println("Inside the display method");
		System.out.println(dto.getSerialNumber());
		System.out.println(dto.getBrand());
		System.out.println(dto.getPrice());
		System.out.println(dto.getVolt());
	}
}
