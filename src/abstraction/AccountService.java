package abstraction;

import java.util.UUID;

public interface AccountService {
	String getAccountNumber(int a,int y);
}

//class  ABCBank implements AccountService{
//
//	@Override
//	public String getAccountNumber() {
//		 
//		return UUID.randomUUID().toString().substring(1,8);
//	}
//}

