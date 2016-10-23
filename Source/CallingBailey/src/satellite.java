
public class satellite {
	private int xCoord, yCoord;
	public satellite(){
	}
	
	public int sendPackage(){
		int ping = (int) (Math.random()*100);
		return ping;
	}
	
	public Boolean checkFunctional(){
		return true;
	}
	
	public String getQuery(String query){
		return query;
	}
	
	public void sendReply(String[] reply, String callerId){
		//SEND INFO TO USER
		return;
	}

}
