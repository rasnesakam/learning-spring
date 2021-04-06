package springIntro;

public class MysqlCustomerDal implements ICustomerDal {

	String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	
	@Override
	public void add() {
		System.out.println(connectionString+" baðlantý adresi kuruldu");
		System.out.println("Mysql Ortamýna Eklendi");
		
	}

	
}
