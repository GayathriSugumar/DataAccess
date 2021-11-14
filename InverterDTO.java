package Data_Accessor.Inverter.DTO;

public class InverterDTO {
	private String brand;
	private int price;
	private int capcaity;
	public InverterDTO(String brand, int price, int capcaity) {
		
		this.brand = brand;
		this.price = price;
		this.capcaity = capcaity;
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
	public int getCapcaity() {
		return capcaity;
	}
	public void setCapcaity(int capcaity) {
		this.capcaity = capcaity;
	}
	
	
	
	
	
	

}
