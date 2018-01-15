package com.cliffconsulting.proto;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException;

public class OverviewServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6334914160933771229L;

	
	
	final AmazonDynamoDB db = AmazonDynamoDBClientBuilder.defaultClient();
	
	
	public void init() throws ServletException {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> this is  my message </h1>");
        try {
        	Map<String, AttributeValue> item_values =
        			new HashMap<String, AttributeValue>();

        	String botId = "test";
        	String ts = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        	
        	item_values.put("botId", new AttributeValue(botId));
        	item_values.put("timestamp", new AttributeValue(ts));
        	item_values.put("field1", new AttributeValue("field1Value"));
        	
        	db.putItem("SimBot", item_values);
        } catch (ResourceNotFoundException e) {
        	out.println("error:" + e);
        	
        } catch (AmazonServiceException e) {
        	out.println("amazon error:" + e);
        }
        out.println("added somethign to dynamo db table ha ha");
    }

    public void destroy() {
    }

}

