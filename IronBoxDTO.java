package Data_Accessor.IronBox.DTO;

public class IronBoxDTO {

	private String brand;
	private int serialNumber;
	private int watt;
	
	public IronBoxDTO(String brand, int serialNumber, int watt) {

		this.brand = brand;
		this.serialNumber = serialNumber;
		this.watt = watt;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getWatt() {
		return watt;
	}
	public void setWatt(int watt) {
		this.watt = watt;
	}
  
	
	
}
