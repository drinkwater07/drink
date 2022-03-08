package dataAccess;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import resources.PropertiesFile;
import utilities.Playback;

public class PoliceData 

{
		
//	public static String jsonPath = "\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\EditableJsonFiles\\";
	//public static String jsonPath = "\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\JSON\\";
	
	public static String jsonPath = PropertiesFile.readPropertiesFile("TestDataFilePath");
	public static String testID=Playback.testContext.getAttribute("testID").toString();
	public static String moduleName=Playback.testContext.getAttribute("moduleName").toString();
	public static String testDataFilePath =  PropertiesFile.readPropertiesFile("testDataFilePath");
	
	public static String getPropertyModuleValue(String columnName)
	{   
		String columnValue = null;
		String moduleName=Playback.testContext.getAttribute("moduleName").toString();
		String testID=Playback.testContext.getAttribute("testID").toString();
		JSONParser jsonParser = new JSONParser();
						
		try{	

			Object obj = jsonParser.parse(new FileReader(jsonPath+moduleName+".json")); 		
            JSONObject jsonObject= new JSONObject(obj.toString());          
            JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
            String ParamKey= testcaseID.getString(columnName);
            columnValue= ParamKey;
            
        }
		
        catch(Exception e) {e.printStackTrace();}
        
        return columnValue;
		
  }
	
	
	public static String getRecordsModuleValue(String columnName)
	{   
		String columnValue = null;
		String moduleName=Playback.testContext.getAttribute("moduleName").toString();
		String testID=Playback.testContext.getAttribute("testID").toString();
		JSONParser jsonParser = new JSONParser();
						
		try{		
			Object obj = jsonParser.parse(new FileReader(jsonPath+moduleName+".json")); 		
            JSONObject jsonObject= new JSONObject(obj.toString());          
            JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
            String ParamKey= testcaseID.getString(columnName);
            columnValue= ParamKey;
            
        }
		
        catch(Exception e) {e.printStackTrace();}
        
        return columnValue;
		
  }
	public static String getPoliceSmokeModuleValue(String columnName)
	{   
		String columnValue = null;
		String moduleName=Playback.testContext.getAttribute("moduleName").toString();
		String testID=Playback.testContext.getAttribute("testID").toString();
		JSONParser jsonParser = new JSONParser();
						
		try{		
			Object obj = jsonParser.parse(new FileReader(jsonPath+moduleName+".json")); 		
            JSONObject jsonObject= new JSONObject(obj.toString());          
            JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
            String ParamKey= testcaseID.getString(columnName);
            columnValue= ParamKey;
            
        }
		
        catch(Exception e) {e.printStackTrace();}
        
        return columnValue;
		
  }
	public static String getTestContextData(String columnName)
	{
		String moduleName=Playback.testContext.getAttribute("moduleName").toString();
		String testID=Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;
				
		JSONParser jsonParser = new JSONParser();
						
		try{			
				
			//Object obj = jsonParser.parse(new FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\Geo.json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath+moduleName+".json"));
            JSONObject jsonObject= new JSONObject(obj.toString());          
            JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
            String ParamKey= testcaseID.getString(columnName);
            columnValue= ParamKey;
            
        }
		
 catch(Exception e) {e.printStackTrace();}
        
        return columnValue;
  }	
	
	
		
		
		public static String getK9ModuleValue(String columnName)
		{
	   
			String columnValue = null;
					
			JSONParser jsonParser = new JSONParser();
							
			try{			
				String testID=Playback.testContext.getAttribute("testID").toString();	
				String moduleName=Playback.testContext.getAttribute("moduleName").toString();		
				
				//Object obj = jsonParser.parse(new FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
				Object obj = jsonParser.parse(new FileReader(jsonPath+moduleName+".json"));
	            JSONObject jsonObject= new JSONObject(obj.toString());          
	            JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
	            String ParamKey= testcaseID.getString(columnName);
	            columnValue= ParamKey;
	            
	        }
			
	        catch(Exception e) {e.printStackTrace();}
	        
	        return columnValue;
	  }
		public static String getWarrantModuleValue(String columnName)
		{
	   
			String columnValue = null;
					
			JSONParser jsonParser = new JSONParser();
							
			try{			
				String testID=Playback.testContext.getAttribute("testID").toString();	
				String moduleName=Playback.testContext.getAttribute("moduleName").toString();		
				
				//Object obj = jsonParser.parse(new FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
				Object obj = jsonParser.parse(new FileReader(jsonPath+moduleName+".json"));
	            JSONObject jsonObject= new JSONObject(obj.toString());          
	            JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
	            String ParamKey= testcaseID.getString(columnName);
	            columnValue= ParamKey;
	            
	        }
			
	        catch(Exception e) {e.printStackTrace();}
	        
	        return columnValue;
	  }
		
		public static String getAlarmModuleValue(String columnName)
		{
	   
			String columnValue = null;
					
			JSONParser jsonParser = new JSONParser();
							
			try{			
				String testID=Playback.testContext.getAttribute("testID").toString();	
				String moduleName=Playback.testContext.getAttribute("moduleName").toString();		
				
				//Object obj = jsonParser.parse(new FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
				Object obj = jsonParser.parse(new FileReader(jsonPath+moduleName+".json"));
	            JSONObject jsonObject= new JSONObject(obj.toString());          
	            JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
	            String ParamKey= testcaseID.getString(columnName);
	            columnValue= ParamKey;
	            
	        }
			
	        catch(Exception e) {e.printStackTrace();}
	        
	        return columnValue;
	  }
		
		public static String getCMModuleValue(String columnName)
		{
	   
			String columnValue = null;
					
			JSONParser jsonParser = new JSONParser();
							
			try{			
				String testID=Playback.testContext.getAttribute("testID").toString();	
				String moduleName=Playback.testContext.getAttribute("moduleName").toString();		
				
				//Object obj = jsonParser.parse(new FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
				Object obj = jsonParser.parse(new FileReader(jsonPath+moduleName+".json"));
	            JSONObject jsonObject= new JSONObject(obj.toString());          
	            JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
	            String ParamKey= testcaseID.getString(columnName);
	            columnValue= ParamKey;
	            
	        }
			
	        catch(Exception e) {e.printStackTrace();}
	        
	        return columnValue;
	  }
   
		
		public static String getCivilModuleValue(String columnName)
		{
	   
			String columnValue = null;
					
			JSONParser jsonParser = new JSONParser();
							
			try{			
				String testID=Playback.testContext.getAttribute("testID").toString();	
				String moduleName=Playback.testContext.getAttribute("moduleName").toString();		
				
			//	Object obj = jsonParser.parse(new FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
				Object obj = jsonParser.parse(new FileReader(jsonPath+moduleName+".json"));
	            JSONObject jsonObject= new JSONObject(obj.toString());          
	            JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
	            String ParamKey= testcaseID.getString(columnName);
	            columnValue= ParamKey;
	            
	        }
			
	        catch(Exception e) {e.printStackTrace();}
	        
	        return columnValue;
	  }
		
		public static String getTrafficModuleValue(String columnName)
		{
	   
			String columnValue = null;
					
			JSONParser jsonParser = new JSONParser();
							
			try{			
				String testID=Playback.testContext.getAttribute("testID").toString();	
				String moduleName=Playback.testContext.getAttribute("moduleName").toString();		
				
				//Object obj = jsonParser.parse(new FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
				Object obj = jsonParser.parse(new FileReader(jsonPath+moduleName+".json"));
	            JSONObject jsonObject= new JSONObject(obj.toString());          
	            JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
	            String ParamKey= testcaseID.getString(columnName);
	            columnValue= ParamKey;
	            
	        }
			
	        catch(Exception e) {e.printStackTrace();}
	        
	        return columnValue;
	  }
		
		public static String getTrafficWIModuleValue(String columnName)
		{
	   
			String columnValue = null;
					
			JSONParser jsonParser = new JSONParser();
							
			try{			
				String testID=Playback.testContext.getAttribute("testID").toString();	
				String moduleName=Playback.testContext.getAttribute("moduleName").toString();		
				
				//Object obj = jsonParser.parse(new FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
				Object obj = jsonParser.parse(new FileReader(jsonPath+moduleName+".json"));
	            JSONObject jsonObject= new JSONObject(obj.toString());          
	            JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
	            String ParamKey= testcaseID.getString(columnName);
	            columnValue= ParamKey;
	            
	        }
			
	        catch(Exception e) {e.printStackTrace();}
	        
	        return columnValue;
	  }
		
		public static String getAnimalControlModuleValue(String columnName)
		{
	   
			String columnValue = null;
					
			JSONParser jsonParser = new JSONParser();
							
			try{			
				String testID=Playback.testContext.getAttribute("testID").toString();	
				String moduleName=Playback.testContext.getAttribute("moduleName").toString();		
				
				//Object obj = jsonParser.parse(new FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
				Object obj = jsonParser.parse(new FileReader(jsonPath+moduleName+".json"));
	            JSONObject jsonObject= new JSONObject(obj.toString());          
	            JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
	            String ParamKey= testcaseID.getString(columnName);
	            columnValue= ParamKey;
	            
	        }
			
	        catch(Exception e) {e.printStackTrace();}
	        
	        return columnValue;
	  }
		
		public static String getCoronerModuleValue(String columnName)
		{
	   
			String columnValue = null;
					
			JSONParser jsonParser = new JSONParser();
							
			try{			
				String testID=Playback.testContext.getAttribute("testID").toString();	
				String moduleName=Playback.testContext.getAttribute("moduleName").toString();		
				
				//Object obj = jsonParser.parse(new FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
				Object obj = jsonParser.parse(new FileReader(jsonPath+moduleName+".json"));
	            JSONObject jsonObject= new JSONObject(obj.toString());          
	            JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
	            String ParamKey= testcaseID.getString(columnName);
	            columnValue= ParamKey;
	            
	        }
			
	        catch(Exception e) {e.printStackTrace();}
	        
	        return columnValue;
	  }
		
		
	
   
   public static void WriteJsonData(String filePath) {
    

}
   
	
	//Read and write XML file
      
   public static String xmlRead(String xmlFile, String testCaseID, String parameterName) throws ParserConfigurationException, SAXException, IOException
      {
            
             File file = new File(xmlFile);
             
             DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
             DocumentBuilder db = dbf.newDocumentBuilder();  
             Document doc = db.parse(file); 
             
             doc.getDocumentElement().normalize();  
             Element testCaseElement = doc.getElementById(testCaseID);
             NodeList parameterNodeList = testCaseElement.getElementsByTagName(parameterName);
             
             String parameterValue = parameterNodeList.item(0).getTextContent();
      
             
             return parameterValue;
      }
      
      public static void xmlWrite(String xmlFile, String testCaseID, String parameterName,String parameterValue) throws ParserConfigurationException, SAXException, IOException 
      {
             File file = new File(xmlFile);
             DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
             DocumentBuilder db = dbf.newDocumentBuilder();  
             Document doc = db.parse(file); 
             
             doc.getDocumentElement().normalize();  
             Element testCaseElement = doc.getElementById(testCaseID);
             NodeList parameterNodeList = testCaseElement.getElementsByTagName(parameterName);
             
             parameterNodeList.item(0).setTextContent(parameterValue);
             
             doc.normalizeDocument();
             Playback.controlReadyThreadWait();
             
      }


      public static void writeJson(String testID,String columnName,String value) throws FileNotFoundException, IOException, ParseException 
      {
              
          File filePath = new File("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\JSON\\Dataread\\"+moduleName+".json");
                      JSONParser jsonParser = new JSONParser();                  
                                      Object obj = jsonParser.parse(new FileReader(filePath));           
                          JSONObject jsonObject= new JSONObject(obj.toString());          
                          JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
                         
                     System.out.println(testcaseID.toString());
                     testcaseID.put(columnName, value);
                     System.out.println(testcaseID.toString());
                     
                     try (FileWriter file = new FileWriter(filePath)) {
                              //We can write any JSONArray or JSONObject instance to the file
                              file.write(jsonObject.toString()); 
                              file.flush();
                   
                          } catch (IOException e) {
                              e.printStackTrace();
                          }
      }

 

      public static String readJson(String testID,String columnName)
      {
      
        
        File file = new File("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\JSON\\Dataread\\"+moduleName+".json");
              String columnValue = null;
              JSONParser jsonParser = new JSONParser();                   
              try{  
               Object obj = jsonParser.parse(new FileReader(file));           
          JSONObject jsonObject= new JSONObject(obj.toString());          
          JSONObject testcaseID=(JSONObject)jsonObject.get(testID); 
          String ParamKey= testcaseID.getString(columnName);
          columnValue= ParamKey;     
      }
      catch(Exception e) 
              {e.printStackTrace();}
      return columnValue;
              
      }
      
//      
//      public static String getTrafficModuleXMLValue(String testCaseID, String parameterName)
//                    throws ParserConfigurationException, SAXException, IOException 
//      {
//             String value = xmlRead("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\\"+moduleName+\".xml", testCaseID,
//                          parameterName);
//
//             return value;
//      }
//
//      public static void setTrafficModuleXMLValue(String testCaseID, String parameterName, String parameterValue)
//                    throws ParserConfigurationException, SAXException, IOException 
//      {
//             xmlWrite("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\\"+moduleName+\".xml", testCaseID, parameterName,
//                          parameterValue);
//      }
//           

   
}
