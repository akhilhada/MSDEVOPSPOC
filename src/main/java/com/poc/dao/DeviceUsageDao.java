package com.poc.dao;

import java.util.ArrayList;
import java.util.List;

import com.poc.dev.DeviceDetails;
import com.poc.dev.Person;
import com.poc.dev.User;

public class DeviceUsageDao {

public List<DeviceDetails> checkUsage(String id, String year){
		
		boolean loginStatus = false;
		List<DeviceDetails> deviceUsageList = null;
		DeviceDetails objDeviceDetails = null;
		try{
			if((id!=null && !id.equals("")) && (year!=null && !year.equals(""))){
				if(id.equalsIgnoreCase("ID001") && year.equalsIgnoreCase("2019")){
					System.out.println("Valid request");
					deviceUsageList = new ArrayList<DeviceDetails>();
					
					objDeviceDetails = new DeviceDetails(); 
					objDeviceDetails.setId("ID001"); 
					objDeviceDetails.setYear("2019"); 
					objDeviceDetails.setStartMeterReading("0000100"); 
					objDeviceDetails.setEndMeterReading("0000235"); 
					objDeviceDetails.setUnits("135"); 
					deviceUsageList.add(objDeviceDetails);
					 
					
					//personList.add(new Person("1","2","3","4","5","6"));
										
				}
			}else{
				System.out.println("ID and year cannot be blank...");
			}
			
		}catch(Exception e){
			System.out.println("Exception in checkUsage :: "+e);
		}
		
		return deviceUsageList;
	}
	
}
