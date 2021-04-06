package springIntro;

public class MsSqlCustomerDal implements ICustomerDal {

	String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	
	@Override
	public void add() {
		System.out.println(connectionString+" ba�lant� adresi kuruldu");
		System.out.println("Microsoft ortam�na eklendi");
	}

}
