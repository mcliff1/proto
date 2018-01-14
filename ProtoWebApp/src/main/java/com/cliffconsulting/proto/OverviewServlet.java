package com.cliffconsulting.proto;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException;

public class OverviewServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6334914160933771229L;

	
	private static final String AWS_ACCESS_KEY_ID = "AKIAJ27MW6HDGCXJ4O6A";
	
	private static final String AWS_SECRET_ACCESS_KEY = "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";
	
	private static final String AWS_REGION = "us-west-2";

	private static BasicAWSCredentials creds = new BasicAWSCredentials(AWS_ACCESS_KEY_ID, AWS_SECRET_ACCESS_KEY);
	
	//final AmazonDynamoDB db = AmazonDynamoDBClientBuilder.defaultClient();
	final AmazonDynamoDB db = AmazonDynamoDBClientBuilder.standard().withRegion(AWS_REGION).withCredentials(new AWSStaticCredentialsProvider(creds)).withRegion("us-west-2").build();
	
	
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
        	
        	item_values.put("botId", new AttributeValue("testbot"));
        	item_values.put("field1", new AttributeValue("field1Value"));
        	String botId="test";
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

