package readjson;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class TestJson {

	public static void main(String[] args)  {
		
JSONObject employeeDetails=new JSONObject();
employeeDetails.put("firstName","dulquar");
employeeDetails.put("lastName","salmaN");
employeeDetails.put("website","example");
 



 
JSONObject employeeObject = new JSONObject(); 
employeeObject.put("employee", employeeDetails);
 
//Second Employee
JSONObject employeeDetails2 = new JSONObject();
employeeDetails2.put("firstName", "fahad");
employeeDetails2.put("lastName", "fazil");
employeeDetails2.put("website", "example.com");
 
JSONObject employeeObject2 = new JSONObject(); 
employeeObject2.put("employee", employeeDetails2);
 
//Add employees to list
JSONArray employeeList = new JSONArray();
employeeList.add(employeeObject);
employeeList.add(employeeObject2);



try(FileWriter file= new FileWriter("employees.json")){//try with resources is in java 1.1
	file.write(employeeList.toJSONString());
	file.flush();
	
}catch(IOException e) {
	e.printStackTrace();
	
}
		

	}

}
