
public class Main {
	public static void main(String[] args){
		
		//simulate 10 satellites
		satellite[] sampleSat = new satellite[10];
		for(int i=0; i<10; i++){
			sampleSat[i] = new satellite(i);
		}
		//check for satellite with best ping
		satellite bestSat = new satellite();
		bestSat = SystemCheck.checkBestSatellite(sampleSat);
		System.out.println("Satellite "+ bestSat.getName() + "has best ping");
		
		
		
		
	}
	
	
	  
}
