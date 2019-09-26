package com.poc.service;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Tag;
import io.swagger.annotations.SwaggerDefinition;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.poc.dao.BankAppDao;
import com.poc.dev.Person;



@Path("/bankappservice")
@SwaggerDefinition(tags = { @Tag(name = "Bank API", description = "JAXRS Based API") })
public class BankAppService {

		
		BankAppDao objBankAppDao = new BankAppDao();
	
		 @GET
			@Path("/validate/{varX}/{varY}")
		   @ApiOperation("Validate users")
		   //@Produces({"application/xml","application/json"})
		   @Produces(MediaType.APPLICATION_JSON)
		   @ApiResponses({ @ApiResponse(code = 201, message = "Validated users", response = Object.class) })
		   
		   public List<Person> validateUser(@PathParam("varX") String varX, @PathParam("varY") String varY){
			   System.out.println("Inside validate user");
			   return objBankAppDao.validateLogin(varX,varY);
		   }
		   
}