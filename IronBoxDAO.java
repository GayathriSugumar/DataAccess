package Data_Accessor.IronBox.DAO;

import Data_Accessor.IronBox.DTO.IronBoxDTO;

public class IronBoxDAO {
	
	public IronBoxDAO() {
		System.out.println("Inside IronBoxDAO");
		
	}
	IronBoxDTO ironbox[]=new IronBoxDTO[3];
	int index=0;
	
	public void saveDto(IronBoxDTO obj) {
		ironbox[index]=obj;
		index++;
	}
	public void displayinfo(){
		for(int i=0;i<ironbox.length;i++) {
			System.out.println(ironbox[i].getBrand());
			System.out.println(ironbox[i].getSerialNumber());
			System.out.println(ironbox[i].getWatt());
			System.out.println("------------");
		}
	}

	public void displayByBrandName(String brand) {
		for (int i = 0; i < ironbox.length; i++) {
			if (ironbox[i].getBrand().equals(brand)) {
				System.out.println(ironbox[i].getBrand());
				System.out.println(ironbox[i].getSerialNumber());
				System.out.println(ironbox[i].getWatt());
				System.out.println("---------------");
			}
		}
	}

	public void updateWattByBrandName(String brand, int newWatt) {
		for (int i = 0; i < ironbox.length; i++) {
			if (ironbox[i].getBrand().equals(brand)) {
				ironbox[i].setWatt(newWatt);
			}
		}

	}

	public void deleteBySerialNumber(int serialNumber) {
		for (int i = 0; i < ironbox.length; i++) {
			if (ironbox[i].getSerialNumber() == serialNumber) {
				ironbox[i] = null;
			}
		}
	}

	public IronBoxDTO createObj(String brand, int serialNumber, int watt) {
		IronBoxDTO ironboxDto = new IronBoxDTO(brand, serialNumber, watt);
		return ironboxDto;
	}
	
}
