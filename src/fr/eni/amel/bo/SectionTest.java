package fr.eni.amel.bo;

public class SectionTest {
	private int nbQuestionsATirer;
	
	private Theme theme;
	
	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	// getter et setter
	public int getNbQuestionsATirer() {
		return nbQuestionsATirer;
	}

	public void setNbQuestionsATirer(int nbQuestionsATirer) {
		this.nbQuestionsATirer = nbQuestionsATirer;
	}

	//constructeur
	/**
	 * @param nbQuestionsATirer
	 */
	public SectionTest(int nbQuestionsATirer) {
		super();
		setNbQuestionsATirer(nbQuestionsATirer);
	}
	
	
	
	

}
