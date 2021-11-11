package Data_Accessor.Mobile.DTO;

public class MobileDTO {

	private String brand;
	private int price;
	private String color;
	private String ram;
	
	public MobileDTO(String brand, int price, String color, String ram) {
		
		System.out.println("MobileDTO is created");
		
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.ram = ram;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}
	
	
	
}
