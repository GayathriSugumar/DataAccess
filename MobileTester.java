package Data_Accessor.Mobile.DAO;

import Data_Accessor.Mobile.DTO.MobileDTO;

public class MobileTester {

	public static void main(String[] args) {
		System.out.println("inside the main method");
		System.out.println("***********************");
		MobileDAO mobileDao=new MobileDAO();
		MobileDTO RedmiNotpad=new MobileDTO ("Redmi Notpad", 50000, "silver blue", "8GB");
		MobileDTO Realme8s=new MobileDTO ("Realme8", 18000, "purple", "8GB");
		MobileDTO SamsungZflip=new MobileDTO ("SamsungZflip", 150000, "purple", "16GB");
		
	
		MobileDTO MobileDTOArray[]= {RedmiNotpad,Realme8s,SamsungZflip};
		MobileDAO.DisplayMobileDTO(MobileDTOArray);
	
	}

}
