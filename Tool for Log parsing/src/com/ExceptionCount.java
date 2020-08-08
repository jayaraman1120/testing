/**
 * 
 */
package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
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
	}
	HashMap <String, Integer> fileExceptionCount(String f) {
		HashMap <String, Integer> exceptioncount = new HashMap<>();
		int /*overallCount =0,*/arithemeticexc = 0,nullpointerexc=0,numberformatexc=0,arrindexoutofexc =0;
		int ioexc =0, sqlexc=0,classnotfoundexc=0,illegalargexc=0,arraystoreexc=0,indexoutofboundexc=0;
		int  securityexc =0, stringindexoutexc=0,unsupportedopexc=0,instationexc=0,interruptedexc=0,filenotfoundexc=0,unidenfiedexc=0;
		try{
		FileReader File = new FileReader(f);
		BufferedReader br = new BufferedReader(File);
		String line;
		while((line = br.readLine())!= null) {
			if (line.toLowerCase().indexOf("exception")!= -1){
				//overallCount++;
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
				}else {
					unidenfiedexc++;
				}
			}
		}
		//logger.info(f+" is read and number of exceptions "+overallCount);
		br.close();
		File.close();
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
		return exceptioncount;
	}

}
