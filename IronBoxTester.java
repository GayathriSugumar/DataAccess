package Data_Accessor.IronBox.DAO;

import Data_Accessor.IronBox.DTO.IronBoxDTO;

public class IronBoxTester {

	public static void main(String[] args) {
		IronBoxDAO ironboxDao = new IronBoxDAO();
		IronBoxDTO philips = ironboxDao.createObj("Philips", 123456, 1000);
		ironboxDao.saveDto(philips);

		IronBoxDTO usha = ironboxDao.createObj("Usha", 3320, 1100);
		ironboxDao.saveDto(usha);

		IronBoxDTO bajaj = ironboxDao.createObj("Bajaj", 4562, 1200);
		ironboxDao.saveDto(bajaj);

		ironboxDao.displayinfo();

		ironboxDao.displayByBrandName("Usha");

		ironboxDao.updateWattByBrandName("Philips", 1199);
		ironboxDao.displayByBrandName("Philips");

		ironboxDao.deleteBySerialNumber(4562);
		ironboxDao.displayinfo();
	}

	
}


