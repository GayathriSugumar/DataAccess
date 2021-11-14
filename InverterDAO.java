package Data_Accessor.Inverter.DAO;

import Data_Accessor.Inverter.DTO.InverterDTO;

public class InverterDAO {
	
	public InverterDAO() {
		System.out.println("Inverter DAO created");
	}
	
	InverterDTO inverter[]=new InverterDTO[3];
	int index=0;
	
	public void saveDTO(InverterDTO obj) {
		inverter[index]=obj;
		index++;
	}
	
	public void displayInfo() {
		for(int i=0;i<inverter.length;i++) {
			System.out.println(inverter[i].getBrand());
			System.out.println(inverter[i].getCapcaity());
			System.out.println(inverter[i].getPrice());
		}
	}
	
	public void displayByBrandName(String brandName) {
		for(int i=0;i<inverter.length;i++) {
			if(inverter[i].getBrand().equals(brandName)) {
			System.out.println(inverter[i].getBrand());
			System.out.println(inverter[i].getCapcaity());
			System.out.println(inverter[i].getPrice());
		}
	}
}
	public void updateBrandNameByBrandName(String brandName,int newPrice) {
		for(int i=0;i<inverter.length;i++) {
			if(inverter[i].getBrand().equals(brandName)) {
				inverter[i].setPrice(newPrice);
			}
		}
	}
	public void deleteByBrandName(String brand) {
		for(int i=0;i<inverter.length;i++) {
			if(inverter[i].getBrand().equals(brand)) {
				inverter[i]=null;
			}
		}
	}
	public InverterDTO createObject(String brand, int price, int capcaity) {
		InverterDTO inverterDto=new InverterDTO(brand,price,capcaity);
		return inverterDto;
	}
	
	
	
}
