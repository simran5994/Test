package com.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;



public class ServletJSON extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request,
            HttpServletResponse response)
    throws ServletException, IOException{
		JSONObject obj = new JSONObject();
		
		
			try {
				obj.put("name", "foo");
				obj.put("num", new Integer(100));
			    obj.put("balance", new Double(1000.21));
			    obj.put("is_vip", new Boolean(true));
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	      
		
		
		

}


}
