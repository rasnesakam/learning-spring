package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerManager oracleCustomerManager = // get class from context (Spring ioc)
				context.getBean("customerManager",CustomerManager.class);
		
		// CustomerManager manager2 = // get class from context (Spring ioc) 
		// 		new CustomerManager(context.getBean("mysqldb",ICustomerDal.class));
		// manager2.add();
		
		oracleCustomerManager.add();
	}

}
