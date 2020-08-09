/**
 * 
 */
package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jaya-8047
 *
 */
public class ExceptionCount {

	/**
	 * 
	 */
	private final static Logger logger = Logger.getLogger(FolderParser.class.getName());
	
	public ExceptionCount() {
		// TODO Auto-generated constructor stub
		logger.info("Exception count class is initializing");
	}
	
	/*This method receives file as input and 
	 * Calculate exception count for each type and return as hashmap
	 */
	HashMap <String, Integer> fileExceptionCount(String f) {
		HashMap <String, Integer> exceptioncount = new HashMap<>();
		int arithemeticexc = 0,nullpointerexc=0,numberformatexc=0,arrindexoutofexc =0;//Variable to store exception count for each exception type
		int ioexc =0, sqlexc=0,classnotfoundexc=0,illegalargexc=0,arraystoreexc=0,indexoutofboundexc=0;
		int  securityexc =0, stringindexoutexc=0,unsupportedopexc=0,instationexc=0,interruptedexc=0,filenotfoundexc=0,unidenfiedexc=0;
		try{
		FileReader file = new FileReader(f);
		BufferedReader br = new BufferedReader(file);
		String line;
		
		while((line = br.readLine())!= null) {
			if (line.toLowerCase().indexOf("exception")!= -1){
				//For each line , If exception text present, it allows to check for type of exception
				if(line.toLowerCase().indexOf("arithmeticexception")!= -1) {
					arithemeticexc++;
				}else if (line.toLowerCase().indexOf("nullpointerexception")!= -1){
					nullpointerexc++;
				}else if (line.toLowerCase().indexOf("numberformatexception")!= -1){
					numberformatexc++;
				}else if (line.toLowerCase().indexOf("arrayindexoutofboundsexception")!= -1){
					arrindexoutofexc++;
				}else if (line.toLowerCase().indexOf("ioexception")!= -1){
					ioexc++;
				}else if (line.toLowerCase().indexOf("sqlexception")!= -1){
					sqlexc++;
				}else if (line.toLowerCase().indexOf("classnotfoundexception")!= -1){
					classnotfoundexc++;
				}else if (line.toLowerCase().indexOf("illegalargumentexception")!= -1){
					illegalargexc++;
				}else if (line.toLowerCase().indexOf("arraystoreexception")!= -1){
					arraystoreexc++;
				}else if (line.toLowerCase().indexOf("indexoutofboundsexception")!= -1){
					indexoutofboundexc++;
				}else if (line.toLowerCase().indexOf("securityexception")!= -1){
					securityexc++;
				}else if (line.toLowerCase().indexOf("stringindexoutofbounds")!= -1){
					stringindexoutexc++;
				}else if (line.toLowerCase().indexOf("unsupportedoperationexception")!= -1){
					unsupportedopexc++;
				}else if (line.toLowerCase().indexOf("instantiationexception")!= -1){
					instationexc++;
				}else if (line.toLowerCase().indexOf("interruptedexception")!= -1){
					interruptedexc++;
				}else if (line.toLowerCase().indexOf("filenotfoundexception")!= -1){
					filenotfoundexc++;
				}else { //If detected exception does not fall under above, this is categorized to unidentified Exception
					unidenfiedexc++;
				}
			}
		}
		br.close();
		file.close();
		//writing calculated exception type to Hashmap
		exceptioncount.put("Arithmetic Exception", arithemeticexc);
		exceptioncount.put("Null Pointer Exception", nullpointerexc);
		exceptioncount.put("Number Format Exception", numberformatexc);
		exceptioncount.put("Array index out of bounds Exception", arrindexoutofexc);
		exceptioncount.put("IO Exception", ioexc);
		exceptioncount.put("Sql Exception", sqlexc);
		exceptioncount.put("Class not Found Exception", classnotfoundexc);
		exceptioncount.put("Illegal Argument Exception", illegalargexc);
		exceptioncount.put("Array store Exception", arraystoreexc);
		exceptioncount.put("Index out of bounds Exception", indexoutofboundexc);
		exceptioncount.put("Security Exception", securityexc);
		exceptioncount.put("String Index out of Bound Exception", stringindexoutexc);
		exceptioncount.put("Unsupported Operation Exception", unsupportedopexc);
		exceptioncount.put("Instantiation Exception", instationexc);
		exceptioncount.put("Interrupted Exception", interruptedexc);
		exceptioncount.put("File not Found Exception", filenotfoundexc);
		exceptioncount.put("Unidentified Exception", unidenfiedexc);

		}catch(IOException e) {
			logger.log(Level.WARNING,"Error occurred",e);
		}
		logger.log(Level.INFO,f+" file is gone through to calculate exception count and returning exception count hashmap to main class");
		return exceptioncount;
	}
	
	/* This method gets hashmap of exception count of each file as argument and aggregate
	 * each type of exception for overall given folder and return as hashmap
	 */
	HashMap <String, Integer> folderExceptionCount (List<HashMap <String,Integer>> list) {
		HashMap <String, Integer> folderLevelExcCount = new HashMap <String,Integer>();
		int arithemeticexc = 0,nullpointerexc=0,numberformatexc=0,arrindexoutofexc =0;
		int ioexc =0, sqlexc=0,classnotfoundexc=0,illegalargexc=0,arraystoreexc=0,indexoutofboundexc=0;
		int  securityexc =0, stringindexoutexc=0,unsupportedopexc=0,instationexc=0,interruptedexc=0,filenotfoundexc=0,unidenfiedexc=0;
		
		for (HashMap<String,Integer> map : list) {
			arithemeticexc = arithemeticexc + map.get("Arithmetic Exception");
			nullpointerexc = nullpointerexc + map.get("Null Pointer Exception");
			numberformatexc = numberformatexc + map.get("Number Format Exception");
			arrindexoutofexc = arrindexoutofexc + map.get("Array index out of bounds Exception");
			ioexc = ioexc + map.get("IO Exception");
			sqlexc = sqlexc + map.get("Sql Exception");
			classnotfoundexc = classnotfoundexc + map.get("Class not Found Exception");
			illegalargexc = illegalargexc + map.get("Illegal Argument Exception");
			arraystoreexc = arraystoreexc + map.get("Array store Exception");
			indexoutofboundexc = indexoutofboundexc + map.get("Index out of bounds Exception");
			securityexc = securityexc + map.get("Security Exception");
			stringindexoutexc = stringindexoutexc + map.get("String Index out of Bound Exception");
			unsupportedopexc = unsupportedopexc + map.get("Unsupported Operation Exception");
			instationexc = instationexc + map.get("Instantiation Exception");
			interruptedexc = interruptedexc + map.get("Interrupted Exception");
			filenotfoundexc = filenotfoundexc + map.get("File not Found Exception");
			unidenfiedexc = unidenfiedexc + map.get("Unidentified Exception");
		}
		
		folderLevelExcCount.put("Arithmetic Exception", arithemeticexc);
		folderLevelExcCount.put("Null Pointer Exception", nullpointerexc);
		folderLevelExcCount.put("Number Format Exception", numberformatexc);
		folderLevelExcCount.put("Array index out of bounds Exception", arrindexoutofexc);
		folderLevelExcCount.put("IO Exception", ioexc);
		folderLevelExcCount.put("Sql Exception", sqlexc);
		folderLevelExcCount.put("Class not Found Exception", classnotfoundexc);
		folderLevelExcCount.put("Illegal Argument Exception", illegalargexc);
		folderLevelExcCount.put("Array store Exception", arraystoreexc);
		folderLevelExcCount.put("Index out of bounds Exception", indexoutofboundexc);
		folderLevelExcCount.put("Security Exception", securityexc);
		folderLevelExcCount.put("String Index out of Bound Exception", stringindexoutexc);
		folderLevelExcCount.put("Unsupported Operation Exception", unsupportedopexc);
		folderLevelExcCount.put("Instantiation Exception", instationexc);
		folderLevelExcCount.put("Interrupted Exception", interruptedexc);
		folderLevelExcCount.put("File not Found Exception", filenotfoundexc);
		folderLevelExcCount.put("Unidentified Exception", unidenfiedexc);
		
		logger.info("Returning overall exception count at folder level ");
		return folderLevelExcCount;
	}
}
