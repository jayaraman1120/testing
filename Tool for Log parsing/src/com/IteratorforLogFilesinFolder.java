package com;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IteratorforLogFilesinFolder {
	private final static Logger logger = Logger.getLogger(FolderParser.class.getName());
	public IteratorforLogFilesinFolder() {
		// TODO Auto-generated constructor stub
		logger.info("Class IteratorforLogFilesinFolder instance is constructed");
	}
	boolean checkFolderexists(String filename) {
		if (new File(filename).exists() && new File(filename).isDirectory()) return true;
		return false;
	}
	
	List<String> listLogFiles (String file,String fileFormat) {
		logger.info("Provided folder name is "+file+"  Provided file format to retrive is "+fileFormat);
		File inputFolder = new File(file);
		List <String> fileListString = new ArrayList<String>();
		try { FileFilter filetypefilter = new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				logger.info("iterated file is "+pathname.getName());
				if ((pathname.getName().endsWith(fileFormat.toLowerCase())) || (pathname.isDirectory())) {
					return true;
				}
				return false;
			}
			
		};
		File fileList[] = inputFolder.listFiles(filetypefilter);
		for (File individualFile: fileList) {
			if(individualFile.canRead() ) {
			if(individualFile.isFile()) {
				fileListString.add(individualFile.getAbsolutePath());
			}else {
				List <String> subFolderfilelist = new ArrayList <String> ();
				subFolderfilelist = listLogFiles(individualFile.getAbsolutePath(),fileFormat);
				if (!subFolderfilelist.isEmpty()) fileListString.addAll(subFolderfilelist);
			}
		}else {
			logger.info(individualFile.getName()+ "does not have read permission");
		}
		}
		}catch (Exception e) {
			logger.log(Level.WARNING, "Exception occurred",e);
		}
		logger.info("Returning from IteratorforLogFilesinFolder class");
		return fileListString;
	}
}
