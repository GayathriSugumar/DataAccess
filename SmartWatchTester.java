package Data_Accessor.SmartWatch.DAO;

import Data_Accessor.SmartWatch.DTO.SmartWatchDTO;

public class SmartWatchTester {

	public static void main(String[] args) {
		
		SmartWatchDAO smartWatchDao=new SmartWatchDAO();
		
		 SmartWatchDTO apple=smartWatchDao.createobject("apple", 50000, 123, "purple");
		 smartWatchDao.saveDTO(apple);
		 
		 SmartWatchDTO redmi=smartWatchDao.createobject("redmi", 7000, 456, "black");
		 smartWatchDao.saveDTO(redmi);
		 
		 SmartWatchDTO realme=smartWatchDao.createobject("realme", 5000, 1123, "gray");
		 smartWatchDao.saveDTO(realme);
		 
		 SmartWatchDTO Boat=smartWatchDao.createobject("Boat", 3000,1023, "bLACK");
		 smartWatchDao.saveDTO(Boat);
		 
		 SmartWatchDTO BoatPro=smartWatchDao.createobject("BoatPro", 7000, 1024, "mate purple");
		 smartWatchDao.saveDTO(BoatPro);
		 
		 smartWatchDao.saveDTO(BoatPro);
		
		 System.out.println("Before update");
		 smartWatchDao.displyByBrandName("apple");
		
		 smartWatchDao.updateTypeByBrandName("apple", 55000);
		 
		 System.out.println("After update");
		 smartWatchDao.displyByBrandName("apple");
		 
		 
		 smartWatchDao.deleteByBrandName("Boat");
		 smartWatchDao.displayInfo();
	}
	
}
