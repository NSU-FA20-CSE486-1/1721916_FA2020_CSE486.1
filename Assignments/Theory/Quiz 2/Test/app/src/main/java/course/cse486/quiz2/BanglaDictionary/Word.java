package course.cse486.quiz2.BanglaDictionary;

public class Word {
    private String englishWord;
    private String banglaWord;

    public Word(String englishWord, String banglaWord) {
        this.englishWord = englishWord;
        this.banglaWord = banglaWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getBanglaWord() {
        return banglaWord;
    }
}
