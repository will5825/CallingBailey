/*
 * Similate a satellite
 */
public class satellite {
	private int name;
	
	public satellite(int name){
		this.name = name;
	}
	//return name of satellite (number)
	public int getName(){
		return name;
	}
	
	//simulate ping 
	public int sendPackage(){
		int ping = (int) (Math.random()*100);
		return ping;
	}
	
	//check if satellite is functional
	public Boolean checkFunctional(){
		return true;
	}
	
	//simulate sending sending to satellite
	public String getQuery(String query){
		return query;
	}
	
	public void sendReply(String[] reply, String callerId){
		//SEND INFO TO USER
		return;
	}
	
	

}
