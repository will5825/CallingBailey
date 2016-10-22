import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Store {
	
	private final String ERROR_LOG = "ErrorLog.txt";
	private final String WEATHER_LOG = "WeatherLog.txt";
	private final String WARNING_LOG = "WarningLog.txt";
	private final String CURRENT_LOG = "OceanCurrentLog.txt";
	private final String USER_ID_LOG = "UserIDs.txt";

	public void storeErrorLog(String error) {
		writeToFile(error, ERROR_LOG);
	}

	public void storeWeatherLog(String weather) {
		writeToFile(weather, WEATHER_LOG);
	}

	public void storeWarningLog(String warning) {
		writeToFile(warning, WARNING_LOG);
	}

	public void storeOceanCurrentLog(String current) {
		writeToFile(current, CURRENT_LOG);
	}

	public void storeUserId(String id) {
		writeToFile(id, USER_ID_LOG);
	}
	
	public String getInternal(QueryType queryType) {
		if (queryType == QueryType.Weather) {
			return readFile(WEATHER_LOG);
		} else if (queryType == QueryType.Warning) {
			return readFile(WARNING_LOG);
		} else if (queryType == QueryType.Current) {
			return readFile(CURRENT_LOG);
		}
		return null;
	}
	
	public boolean isLogEmpty(QueryType queryType) {
		if (queryType == QueryType.Weather && readFile(WEATHER_LOG).equals("")) {
			return false;
		} else if (queryType == QueryType.Warning && readFile(WARNING_LOG).equals("")) {
			return false;
		} else if (queryType == QueryType.Current && readFile(CURRENT_LOG).equals("")) {
			return false;
		}
		return true;
	}
	
	public boolean isErrorLogEmpty() {
		if (readFile(ERROR_LOG).equals("")) {
			return false;
		}
		return true;
	}
	
	private String readFile(String filePath) {
		String file = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("logs/" + filePath));
			while ((br.readLine()) != null) {
				file.concat(br.readLine());
				file.concat("\n");
			}
			br.close();
			return file;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	private void writeToFile(String str, String filePath) {
		try {
			File file = new File("logs/" + filePath);
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
