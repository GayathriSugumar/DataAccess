package Data_Accessor.Inverter.DAO;

import Data_Accessor.Inverter.DTO.InverterDTO;

public class InveterTester {

	public static void main(String[] args) {
		
		InverterDAO inverterDao=new InverterDAO();
		
		InverterDTO Amaron=inverterDao.createObject("Amaron", 20000, 880);
		inverterDao.saveDTO(Amaron);
		
		InverterDTO Livfast=inverterDao.createObject("Livfast", 16000, 650);
		inverterDao.saveDTO(Livfast);

		InverterDTO Microtech=inverterDao.createObject("Microtech", 9000,1100);
		inverterDao.saveDTO(Microtech);
		
		inverterDao.displayInfo();
		
		inverterDao.displayByBrandName("Vcard");
		
		inverterDao.updateBrandNameByBrandName("Microtech", 10000);
		inverterDao.displayByBrandName("Microtech");
		
		inverterDao.deleteByBrandName("Amaron");
		
		inverterDao.displayInfo();
	}

}
