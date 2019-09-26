package com.h2k.spring;

public class MSWord {
	
	public MSWord(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	private String docTitle;
	private String docLanguage;
	// Dependency of SpellChecker 
	private SpellChecker spellChecker;
	/**
	 * @return the docTitle
	 */
	public String getDocTitle() {
		return docTitle;
	}
	/**
	 * @param docTitle the docTitle to set
	 */
	public void setDocTitle(String docTitle) {
		this.docTitle = docTitle;
	}
	/**
	 * @return the docLanguage
	 */
	public String getDocLanguage() {
		return docLanguage;
	}
	/**
	 * @param docLanguage the docLanguage to set
	 */
	public void setDocLanguage(String docLanguage) {
		this.docLanguage = docLanguage;
	}
	/**
	 * @return the spellChecker
	 */
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	/**
	 * @param spellChecker the spellChecker to set
	 */
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
}
