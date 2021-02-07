package org.struts;

import org.struts.businessservice.TutorialFinderService;

public class TutorialAction {
private String language;
private String setTutorialSite;
	public String execute() {
		TutorialFinderService tutorialfinderservice = new TutorialFinderService();
		setSetTutorialSite(tutorialfinderservice.languageFinder(language));
		return "success";
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getSetTutorialSite() {
		return setTutorialSite;
	}
	public void setSetTutorialSite(String setTutorialSite) {
		this.setTutorialSite = setTutorialSite;
	}
}
