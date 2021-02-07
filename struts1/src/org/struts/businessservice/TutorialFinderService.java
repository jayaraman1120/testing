package org.struts.businessservice;

public class TutorialFinderService {

	public String languageFinder(String language) {
		if ("jaya".equals(language)) {
		return "Language Available" + language;
		} else {
			return "language not supported";
		}
	}
}
