import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		//simulate 10 satellites
		satellite[] sampleSat = new satellite[10];
		for(int i=0; i<10; i++){
			sampleSat[i] = new satellite(i);
		}
		//check for satellite with best ping
		satellite bestSat ;
		bestSat = SystemCheck.checkBestSatellite(sampleSat);
		System.out.println("Satellite "+ bestSat.getName() + "has best ping");
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Please enter query - Warning, Weather or Current ");
		String n = reader.nextLine(); 
		
		//simulate sending info to satellite from user, and have it send back to system
		String userInput = bestSat.getQuery(n);
		
		if(userInput.equals("Warning")){
			//warning process
		}else if(userInput.equals("Weather")){
			//weather process
		}else{
			//current process
		}
		
		
		
	}
	
	
	  
}
