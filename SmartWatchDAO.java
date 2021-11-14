package Data_Accessor.SmartWatch.DAO;

import Data_Accessor.SmartWatch.DTO.SmartWatchDTO;

public class SmartWatchDAO {
	
	public SmartWatchDAO() {
		System.out.println("Inside the SmartWatchDAO");
	}
	SmartWatchDTO smartWatch[]= new SmartWatchDTO[6];
	int index=0;
	
	public void saveDTO(SmartWatchDTO dto) {
		System.out.println("Inside save method");	
		smartWatch[index]=dto;
		index++;
	}
	public void displayInfo() {
		for(int i=0;i<smartWatch.length;i++) {
			System.out.println(smartWatch[i].getBrand());
			System.out.println(smartWatch[i].getColor());
			System.out.println(smartWatch[i].getSerialNumber());
			System.out.println(smartWatch[i].getPrice());
			System.out.println("----------------------");
	}
}
	public void displyByBrandName(String brandName) {
		for(int i=0;i<smartWatch.length;i++) {
			if(smartWatch[i].getBrand().equals(brandName)) {
			System.out.println(smartWatch[i].getBrand());
			System.out.println(smartWatch[i].getColor());
			System.out.println(smartWatch[i].getSerialNumber());
			System.out.println(smartWatch[i].getPrice());
			System.out.println("---------------------");
		}
	}
}
	public void updateTypeByBrandName(String brandName,int newPrice) {
		for(int i=0;i<smartWatch.length;i++) {
		if(smartWatch[i].getBrand().equals(brandName)) {
			smartWatch[i].setPrice(newPrice);
		}
	}
}	
	public void deleteByBrandName(String brandname) {
		for(int i=0;i<smartWatch.length;i++) {
			if(smartWatch[i].getBrand().equals(brandname)) {
				
				
				smartWatch[i]=null;
			}
		}
	}
	
	public SmartWatchDTO createobject(String brand, int price, int serialNumber, String color) {
		SmartWatchDTO smartWatchdto=new SmartWatchDTO(brand,price,serialNumber,color);
		return smartWatchdto;
	}
}
