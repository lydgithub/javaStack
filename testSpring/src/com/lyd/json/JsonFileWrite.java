package com.lyd.json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonFileWrite {

	/*
	 *ref: http://crunchify.com/how-to-write-json-object-to-file-in-java/
	 * 
	 */
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		JSONObject obj=new JSONObject();
		obj.put("Name", "lyd");
		obj.put("sex", "man");
		
		JSONArray company=new JSONArray();
		company.add("Company: eBay");
		company.add("Company: Paypal");
		company.add("Company: Google");
		
		obj.put("Company list", company);
		
		FileWriter fw=new FileWriter("C:/file1.txt");
		fw.write(obj.toJSONString());
		System.out.println("Successfully copied json object to file...");
		System.out.println("\nJSON Object:"+obj);
		
		fw.flush();
		fw.close();
		
		
		
	}
}
