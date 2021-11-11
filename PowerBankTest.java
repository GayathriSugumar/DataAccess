package Data_Accessor.PowerBank.DAO;
import Data_Accessor.PowerBank.DTO.PowerBankDTO;

public class PowerBankTest {
	
public static void main(String[] args) {
		
		
		System.out.println("inside main");
		PowerBankDAO dao=new PowerBankDAO();
		//powerbankDAO.createPowerbank("Mi",1000,10000,"blue");
		PowerBankDTO dto=dao.createPowerbank("Mi",1000,10000,"blue");
		
		System.out.println(dto.getBrand());
		System.out.println(dto.getColor());

		System.out.println(dto.getPrice());
		
	}


}
