package algorithm;
import java.util.*;

import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.*;
import java.io.*;


public class ClinividAssignment {

	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	String str=s.next();
	String[] userDataArr = str.split("\\|");
	JSONObject userDataJson = new JSONObject();
	//setting userId
	userDataJson.put("id", userDataArr[1]);
	
	//Setting User name
	JSONObject name = new JSONObject();
	String[] nameData = userDataArr[2].split(">");
	name.put("first", nameData[0].substring(1));
	name.put("middle", nameData[1].substring(1));
	name.put("last", nameData[2].substring(1));
	userDataJson.put("name",name);

	  //Setting User DOB
	userDataJson.put("dob",userDataArr[3]);
	
	//Setting Locations
	JSONArray locationArr = new JSONArray();
	String[] loc=userDataArr[4].split(",");

	for(int i=0;i<loc.length;i++){
	    	JSONObject cityJson=new JSONObject();
	    JSONObject coordJson = new JSONObject();
	    String[] locData=loc[i].split(">");
	    cityJson.put("name",locData[0].substring(1));
	    coordJson.put("long",locData[1].substring(2));
	    coordJson.put("lat",locData[2].substring(1));
	    cityJson.put("coords",coordJson);
	    locationArr.put(cityJson);
	}
	String imageId=userDataArr[5];
	userDataJson.put("locations", locationArr);
	
	//Setting User imageId
	userDataJson.put("imageId",imageId);
	
	System.out.println(userDataJson);
	
	}

	private static void userDataJson(String string, String imageId) {
		// TODO Auto-generated method stub
		
	}

	private static void userDataJson(String string, JSONArray locationArr) {
		// TODO Auto-generated method stub
		
	}
	
}
