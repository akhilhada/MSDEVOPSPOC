package com.poc.dao;

import java.util.ArrayList;
import java.util.List;

import com.poc.dev.Person;
import com.poc.dev.User;

public class BankAppDao {

public List<Person> validateLogin(String username, String password){
		
		boolean loginStatus = false;
		Person objPerson = null;
		List<Person> personList = null;
		try{
			if((username!=null && !username.equals("")) && (password!=null && !password.equals(""))){
				if(username.equalsIgnoreCase("Akhil") && password.equalsIgnoreCase("akhil")){
					System.out.println("Valid user");
					personList = new ArrayList<Person>();
					/*
					 * objPerson = new Person(); loginStatus = true;
					 * objPerson.setLoginStatus(loginStatus); objPerson.setfName(username);
					 * objPerson.setlName("HADA"); objPerson.setEmail("abc@tcs-demo.com");
					 * objPerson.setEmpId("123456"); objPerson.setDepartment("IT");
					 * objPerson.setPhone("9876543210"); personList.add(objPerson);
					 */
					
					personList.add(new Person("1","2","3","4","5","6"));
										
				}else{
					System.out.println("Invalid user");
					objPerson = new Person();
					loginStatus = false;
					objPerson.setLoginStatus(loginStatus);
					
				}
			}else{
				System.out.println("Username or password cannot be blank");
			}
			
		}catch(Exception e){
			System.out.println("Exception in Person:validateLogin :: "+e);
		}
		
		return personList;
	}
	
}
