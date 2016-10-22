import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Store {

	public void storeErrorLog(String error) {
		writeToFile(error, "ErrorLog.txt");
	}

	public void storeWeatherLog(String weather) {
		writeToFile(weather, "WeatherLog.txt");
	}

	public void storeWarningLog(String warning) {
		writeToFile(warning, "WarningLog.txt");
	}

	public void storeOceanCurrentLog(String current) {
		writeToFile(current, "OceanCurrentLog.txt");
	}

	public void storeUserId(String id) {
		writeToFile(id, "UserIDs.txt");
	}

	private void writeToFile(String str, String filePath) {
		try {
			File file = new File("/Logs/" + filePath);
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(str);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
