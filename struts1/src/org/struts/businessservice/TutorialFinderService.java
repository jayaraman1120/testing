package org.struts.businessservice;

public class TutorialFinderService {

	public String languageFinder(String language) {
		if (language != null) {
		if (language.equals("java")) {
		return "Language Available" + language;
		} 
		return language + "  language not supported";
		}else {
			return "language not supported";
		}
	}
}
