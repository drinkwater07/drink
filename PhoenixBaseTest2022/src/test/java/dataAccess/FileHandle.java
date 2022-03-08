package dataAccess;

import java.io.FileReader;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import resources.PropertiesFile;

public class FileHandle 

{
		
	
	public static String testDataFilePath =  PropertiesFile.readPropertiesFile("testDataFilePath");
	
	public static String ReadGeoJsonData(String iD,String columnName)
	{
   
		String columnValue = null;


		
		
		JSONParser jsonParser = new JSONParser();
						
		try{			
						
									
			Object obj = jsonParser.parse(new FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\Geo.json")); 		
            JSONObject jsonObject= new JSONObject(obj.toString());          
            JSONObject testcaseID=(JSONObject)jsonObject.get(iD); 
            String ParamKey= testcaseID.getString(columnName);
            columnValue= ParamKey;
            
        }
		
        catch(Exception e) {e.printStackTrace();}
        
        return columnValue;
  }
   
   public static void WriteJsonData(String filePath) {
    
}
   
}
