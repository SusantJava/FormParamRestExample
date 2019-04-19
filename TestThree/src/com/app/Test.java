package com.app;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/Home")
public class Test {
	
	@POST
	@Path("/msg")
	public String showMsg(@FormParam("eid")int empId,@FormParam("ename")String empName,@FormParam("esal")double empSal) {
		return "Hello: "+empId+","+empName+","+empSal;
	}
	
}
