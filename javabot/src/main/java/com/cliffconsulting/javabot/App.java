package com.cliffconsulting.javabot;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        // write out a string to JSON
        // http://www.mkyong.com/java/how-to-convert-java-object-to-from-json-jackson/
        // https://www.mkyong.com/java/json-simple-example-read-and-write-json/
        // http://www.mkyong.com/java/jackson-2-convert-java-object-to-from-json/
        
        
        JSONObject obj = new JSONObject();
        obj.put("botId","mybot");
        obj.put("age", new Integer(12));
     
        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        obj.put("messages", list);
        
        
        System.out.println(obj);
    }
}
