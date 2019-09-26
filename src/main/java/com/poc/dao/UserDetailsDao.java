package com.poc.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.poc.dev.User;
public class UserDetailsDao {

	public List<User> getAllUsers(){
	      List<User> userList = null;
	      try {
	    	  	userList = new ArrayList<User>();
	            userList.add(new User(1, "Joe", "Professor"));
	            userList.add(new User(2, "Ryan", "Business"));
	            userList.add(new User(3, "John", "IT"));
	            userList.add(new User(4, "Patrick", "Scientist"));
	            userList.add(new User(5, "Bryan", "Sports"));
	            userList.add(new User(6, "Jessica", "Tutor"));
	            
	            //saveUserList(userList);		
	         }catch (Exception e) {
	        	 System.out.println("Exception in UserDetailsDao:getAllUsers() :: "+e);
	      } 	
	      return userList;
	}
	
	private void saveUserList(List<User> userList){
		File file = null;  
		try {
	         file = new File("D:/users.dat");
	         FileOutputStream fos;

	         fos = new FileOutputStream(file);

	         ObjectOutputStream oos = new ObjectOutputStream(fos);
	         oos.writeObject(userList);
	         oos.close();
	         fos.close();
	         oos.close();
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	   }   
	
}
