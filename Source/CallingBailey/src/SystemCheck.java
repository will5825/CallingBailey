/*
 * Checks for ideal satellite from system
 * Checks connection between satellite and system
 * Checks other nodes are functional
 */
public class SystemCheck {


//checks for best satellite by taking in array of Satellites
public static satellite checkBestSatellite(satellite[] avaliableSat){
	double ping =9999999;
	int currentBestPing=0;
	for(int i=0; i<avaliableSat.length; i++){
		if(avaliableSat[i].sendPackage()<ping){
			ping = avaliableSat[i].sendPackage();
			currentBestPing = i;
		}
	}
	return avaliableSat[currentBestPing];
}

//checks that connection to satellite and nodes is valid
public Boolean checkConnection(satellite currentSat, nodes currentNode){
	if((currentSat.checkFunctional())&&(currentNode.checkFunctional())){
		return true;
	}else{
		return false;
	}
	
}
	
	
	
}