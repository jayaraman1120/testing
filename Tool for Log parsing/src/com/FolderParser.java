package com;


import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author jaya-8047
 *
 */
public class FolderParser {
	public FolderParser() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	
	private final static Logger logger = Logger.getLogger(FolderParser.class.getName());
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogManager.getLogManager().reset();
		logger.setLevel(Level.ALL);
		ConsoleHandler conhandler = new ConsoleHandler();
		conhandler.setLevel(Level.WARNING);
		logger.addHandler(conhandler);
		try {
			FileHandler fh = new FileHandler("logfolderparse.log");
			fh.setLevel(Level.INFO);
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter); 
		}catch(Exception e) {
			logger.log(Level.INFO,"Exception",e);
		}
		logger.info("program started to execute");
		IteratorforLogFilesinFolder fileIterator = new IteratorforLogFilesinFolder(); //Creating instance of class for checking folder exist and file iterator
		ExceptionCount exceptionCount = new ExceptionCount();//Creating instance of class for exception count in file level and aggregated
		Scanner readinput = new Scanner(System.in);
		System.out.println("Enter the folder name to check");//expecting user to provide folder name
		String folderName = readinput.nextLine();
		if (!fileIterator.checkFolderexists(folderName)) {
			logger.warning("Given folder "+folderName+" does not exist or it is not a directory. Exiting from program");
			System.exit(1);
		}
		System.out.println("Enter the File format to check");
		String fileFormat = readinput.nextLine();
		readinput.close();
		logger.info(folderName+" is provided by user. "+fileFormat+" is the user provided fileformat and calling Filelist method to retrieve files in directory");
		logger.info("File lists");
		List <String> filelist = fileIterator.listLogFiles(folderName, fileFormat);
		logger.info("Files in subdiretory retrieved");
		if (filelist.isEmpty()) {
			logger.warning("Folder "+folderName+" does not contain any files");
		}else {
		JSONObject individualFilejson = new JSONObject();
		List<HashMap<String, Integer>> list = new ArrayList<HashMap<String, Integer>>();
		for (String file : filelist) {
			try {
				//To get relative path from execution / given folder
				String filename = (new File(file).getAbsolutePath().replace(new File(folderName).getAbsolutePath(), "")).replaceFirst("\\\\","");
				@SuppressWarnings("rawtypes")
				HashMap hashmap= new HashMap(exceptionCount.fileExceptionCount(file));
				list.add(hashmap);
				individualFilejson.put(filename, hashmap);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				logger.log(Level.WARNING,"following error occurred",e);
			}
		}
		JSONObject folderexccount = new JSONObject();
		FileWriter fileoutput = null;
		try {
			folderexccount.put("Aggregated Exception Count in folder", exceptionCount.folderExceptionCount(list));			
			folderexccount.put("Exception count at individual file", individualFilejson);
			fileoutput = new FileWriter("fileoutput.json");
			fileoutput.write(folderexccount.toString());
			fileoutput.close();
			logger.info("Output is written to fileoutput.json");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.log(Level.WARNING,"following error occurred",e);
		}
		}
		logger.info("Program execution completed");
		System.out.println("Program execution completed");
	}
}
	
