package interfacesDemo;

public class SqlServerDal implements ICustomerDal{

	@Override
	public void Add() {
		
		System.out.println("Sql Server Eklendi.");
	}

}
