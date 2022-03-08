package dataAccess;

import java.io.File;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import resources.PropertiesFile;
import utilities.Playback;


public class BaseData {
	// public static String jsonPath =
	// "\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\EditableJsonFiles\\";
	// public static String jsonPath =
	// "\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\JSON\\";

	public static String jsonPath = PropertiesFile.readPropertiesFile("TestDataFilePath");
	public static String testID = Playback.testContext.getAttribute("testID").toString();
	public static String moduleName = Playback.testContext.getAttribute("moduleName").toString();
	public static String testDataFilePath = PropertiesFile.readPropertiesFile("testDataFilePath");


	public static String getGeoModuleValue(String columnName)
	{   

		String moduleName=Playback.testContext.getAttribute("moduleName").toString();
		String testID=Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;

		JSONParser jsonParser = new JSONParser();

		try {

			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;
	}

	public static String getNamesModuleValue(String columnName) {
		String moduleName = Playback.testContext.getAttribute("moduleName").toString();
		String testID = Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;

		JSONParser jsonParser = new JSONParser();

		try {

			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;
	}

	public static String getBaseSmokeModuleValue(String columnName) {
		String moduleName = Playback.testContext.getAttribute("moduleName").toString();
		String testID = Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;

		JSONParser jsonParser = new JSONParser();

		try {

			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;
	}

	public static String getVehicleModuleValue(String columnName) {

		String columnValue = null;

		JSONParser jsonParser = new JSONParser();

		try {

			String testID = Playback.testContext.getAttribute("testID").toString();
			String moduleName = Playback.testContext.getAttribute("moduleName").toString();
			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;
	}

	public static String getInventoryModuleValue(String columnName) {
		String columnValue = null;

		JSONParser jsonParser = new JSONParser();

		try {

			String testID = Playback.testContext.getAttribute("testID").toString();
			String moduleName = Playback.testContext.getAttribute("moduleName").toString();
			// Object obj = jsonParser.parse(new
			// FileReader("\\\\hpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;

	}

	public static String getHomeModuleValue(String columnName) {
		String columnValue = null;

		JSONParser jsonParser = new JSONParser();

		try {

			String testID = Playback.testContext.getAttribute("testID").toString();
			String moduleName = Playback.testContext.getAttribute("moduleName").toString();
			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;

	}

	public static String getHelpdeskModuleValue(String columnName) {
		String columnValue = null;

		JSONParser jsonParser = new JSONParser();

		try {

			String testID = Playback.testContext.getAttribute("testID").toString();
			String moduleName = Playback.testContext.getAttribute("moduleName").toString();
			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;

	}

	public static String getLoginModuleValue(String columnName) {
		String columnValue = null;

		JSONParser jsonParser = new JSONParser();

		try {

			String testID = Playback.testContext.getAttribute("testID").toString();
			String moduleName = Playback.testContext.getAttribute("moduleName").toString();
			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;

	}

	public static String getTestContextData(String columnName) {
		String moduleName = Playback.testContext.getAttribute("moduleName").toString();
		String testID = Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;
		JSONParser jsonParser = new JSONParser();

		try {

			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;

	}

	public static String getSettingsModuleValue(String columnName) {

		String moduleName = Playback.testContext.getAttribute("moduleName").toString();
		String testID = Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;

		JSONParser jsonParser = new JSONParser();


		try {

			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;
	}

	public static String getTrainingModuleValue(String columnName) {

		String moduleName = Playback.testContext.getAttribute("moduleName").toString();
		String testID = Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;

		JSONParser jsonParser = new JSONParser();

		try {

			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;

	}

	public static String getBIModuleValue(String columnName) {

		String moduleName = Playback.testContext.getAttribute("moduleName").toString();
		String testID = Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;

		JSONParser jsonParser = new JSONParser();

		try {

			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;
	}

	public static String getDetailWorkModuleValue(String columnName) {

		String moduleName = Playback.testContext.getAttribute("moduleName").toString();
		String testID = Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;

		JSONParser jsonParser = new JSONParser();

		try {

			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;
	}

	public static String getSchedulingModuleValue(String columnName) {

		String moduleName = Playback.testContext.getAttribute("moduleName").toString();
		String testID = Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;

		JSONParser jsonParser = new JSONParser();

		try {

			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;
	}

	public static String getQAFormValue(String columnName) {

		String moduleName = Playback.testContext.getAttribute("moduleName").toString();
		String testID = Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;
		JSONParser jsonParser = new JSONParser();

		try {

			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;
	}

	public static String getPersonnelModuleValue(String columnName) {
		String moduleName = Playback.testContext.getAttribute("moduleName").toString();
		String testID = Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;
		JSONParser jsonParser = new JSONParser();

		try {

			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;
	}

	public static String getAccountingModuleValue(String columnName) {

		String moduleName = Playback.testContext.getAttribute("moduleName").toString();
		String testID = Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;
		JSONParser jsonParser = new JSONParser();

		try {

			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;
	}

	public static String getActivityModuleValue(String columnName) {

		String columnValue = null;
		JSONParser jsonParser = new JSONParser();

		try {

			String testID = Playback.testContext.getAttribute("testID").toString();
			String moduleName = Playback.testContext.getAttribute("moduleName").toString();
			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;

	}

	public static String getCADModuleValue(String columnName) {

		String moduleName = Playback.testContext.getAttribute("moduleName").toString();
		String testID = Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;
		JSONParser jsonParser = new JSONParser();

		try {

			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;
	}

	public static String getTowModuleValue(String columnName) {
		String moduleName = Playback.testContext.getAttribute("moduleName").toString();
		String testID = Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;

		JSONParser jsonParser = new JSONParser();

		try {

			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;
	}

	public static String getEmploymentApplicantsModuleValue(String columnName) {
		String moduleName = Playback.testContext.getAttribute("moduleName").toString();
		String testID = Playback.testContext.getAttribute("testID").toString();
		String columnValue = null;
		JSONParser jsonParser = new JSONParser();

		try {

			// Object obj = jsonParser.parse(new
			// FileReader("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\2018StableJSONFiles\\Police\\NonSequential\\"+moduleName+".json"));
			Object obj = jsonParser.parse(new FileReader(jsonPath + moduleName + ".json"));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return columnValue;
	}

	public static String readJson(String testID, String columnName) {

		File file = new File("\\\\chpnxfsvr\\qa\\PhoenixTest\\TestData\\JSON\\Dataread\\" + moduleName + ".json");
		String columnValue = null;
		JSONParser jsonParser = new JSONParser();
		try {
			Object obj = jsonParser.parse(new FileReader(file));
			JSONObject jsonObject = new JSONObject(obj.toString());
			JSONObject testcaseID = (JSONObject) jsonObject.get(testID);
			String ParamKey = testcaseID.getString(columnName);
			columnValue = ParamKey;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return columnValue;

	}
}
