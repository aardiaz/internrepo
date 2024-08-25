package abstraction;

import java.util.UUID;

public class Test {
	
	public static void main(String[] args) {
		
		   //using impl.class
		//AccountService service = new ABCBank();
		//System.out.println(service.getAccountNumber());
		
		//using Anonymous inner class
//		AccountService  service = new AccountService() {
//			
//			  @Override
//			public String getAccountNumber() {
//				return UUID.randomUUID().toString().substring(1,8);
//			}
//		};
//		
//       System.out.println(service.getAccountNumber());
       
       //using lambda
       AccountService  service1 =  (x, p) -> {
				return UUID.randomUUID().toString().substring(1,8);
			};
		System.out.println(service1.getAccountNumber(343,45));
		
		
//		CentralBank  b = new NabilBank();
//		b.getBankName();
//		b.getInterestRate();
//		
//		UserService  service = new UserServiceImpl();
//		service.addUser();
//		service.deleteUser();
//		service.print();
//		service.update();
//		
//		UserService.getAll();
		
//		CommonService cs = new UserServiceImpl();
//		cs.print();
		
	}

}
