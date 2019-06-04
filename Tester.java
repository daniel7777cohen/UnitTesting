package ass1SE;

import ass1SE.Proxy;

public class Tester implements Bridge{
	
	 Proxy p = new Proxy(); 
	 
	 public boolean  AddNewProject(String Name , String Details , double Time ,String Info,  String Organization) {
	return p.AddNewProject ( Name ,  Details ,  Time , Info,  Organization );
}

	 public boolean  sign (int Id,String Chief) {
	return p.sign (Id,Chief);
}
}