package com.poc.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/demomessage")
public class DemoUserService
{
    @GET
    public String getMsg()
    {
         return "Hello Bharat & Akhil & Dhiraj!! - Jersey 2";
    }
}
