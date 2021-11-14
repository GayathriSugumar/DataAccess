package Data_Accessor.SmartWatch.DTO;

public class SmartWatchDTO {
	
	private String brand;
	private int price;
	private int serialNumber;
	private String color;
	public SmartWatchDTO(String brand, int price, int serialNumber, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.serialNumber = serialNumber;
		this.color = color;
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
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
