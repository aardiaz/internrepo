package methodoverriding;

import java.math.MathContext;

public class Test {
	
	public static void main(String[] args) {
		
		//static or early binding of object
		NabilBank nb = new NabilBank();
		nb.getBankName();
		nb.getInterestRate();
		
		//up-casting
		CentralBank  b = new NabilBank();
		
	}
	
	//late or dynamic binding of object
	//runtime polymorphism
	void  printBankInfo(CentralBank b) {
		
		b.getBankName();
		b.getInterestRate();
	}

}
