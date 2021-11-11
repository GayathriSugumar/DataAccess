package Data_Accessor.PowerBank.DAO;

import Data_Accessor.PowerBank.DTO.PowerBankDTO;



public class PowerBankDAO {
	
	public PowerBankDAO() {
		System.out.println("Inside Powerbank DAO");
		
	}
		
	
	
	public void displayPowerBankDAO(PowerBankDTO dto) {
		System.out.println(dto.getBrand());
		System.out.println(dto.getColor());
		System.out.println(dto.getPrice());
		
	}
	
	public PowerBankDTO createPowerbank(String brand, int price, int mah, String color) {
		System.out.println("Inside create method");
		PowerBankDTO powerBankDTO=new PowerBankDTO(brand,price,mah,color);
		return  powerBankDTO;
	}

}
