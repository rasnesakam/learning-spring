package springIntro;

public class CustomerManager {
	
	private ICustomerDal dal;
	
	/*
	// Constructor injection
	public CustomerManager(ICustomerDal dal) {
		this.dal = dal;
	}
	*/
	
	// Setter injection
	public void setDal(ICustomerDal dal) {
		this.dal = dal;
	}

	public void add() {
		// �� Kurallar�
		// (sa�lan�rsa)
		
		dal.add();
	}

}
