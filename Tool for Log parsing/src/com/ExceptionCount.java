/**
 * 
 */
package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
	int fileExceptioncheck(String f) {
		int count =0;
		try{
		FileReader File = new FileReader(f);
		BufferedReader br = new BufferedReader(File);
		String line;
		while((line = br.readLine())!= null) {
			if (line.toLowerCase().indexOf("exception")!= -1){
			count++;
			}
		}
		logger.info(f+" is read and number of exceptions "+count);
		br.close();
		File.close();
		}catch(IOException e) {
			logger.log(Level.WARNING,"Error occurred",e);
		}
		return count;
	}

}
