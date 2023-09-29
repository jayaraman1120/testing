package hackerrank;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//import org.json.JSONObject;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WriteJSON {
public static void main(String[] args) throws IOException, ParseException{
JSONObject json = new JSONObject();
json.put("a", "1");
json.put("c", "3");
System.out.println(json.toString());
FileWriter file = new FileWriter("demo.json");
file.write(json.toString());
file.flush();
file.close();
JSONObject j = (JSONObject) new JSONParser().parse(new FileReader("demo.json"));
//JSONObject newjson = (JSONObject) j;
//System.out.println(j.keys());
}
}