package Data_Accessor.Mobile.DAO;

import Data_Accessor.Mobile.DTO.MobileDTO;

public class MobileDAO {
	
	public MobileDAO() {
		System.out.println("Inside DAO constructor");
		System.out.println("***********************");
	}
	public static void  DisplayMobileDTO(MobileDTO dto) {
		System.out.println(dto.getBrand());
		System.out.println(dto.getPrice());
		System.out.println(dto.getColor());
		System.out.println(dto.getRam());
	}
	
	
	public MobileDTO createMobileDto(String brand, int price, String color, String ram) {
		System.out.println("Inside createMobileDto ");
		MobileDTO dto=new MobileDTO(brand,price,color,ram);
		return dto;
	}
	
	public static void  DisplayMobileDTO(MobileDTO MobileDTOArray[]) {
		System.out.println("Inside MobileDTOArray method ");
		for(int i=0;i<MobileDTOArray.length;i++)
		{
			System.out.println(MobileDTOArray[i].getBrand());
			System.out.println(MobileDTOArray[i].getPrice());
			System.out.println(MobileDTOArray[i].getColor());
			System.out.println(MobileDTOArray[i].getRam());
			System.out.println("*******************");
		}
	}
}
