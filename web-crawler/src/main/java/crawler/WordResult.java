package crawler;

/**
 * A POJO for for storing the meta-data associated with
 * a specific word during crawling.
 */
public class WordResult {
    private String word;
    private int position;
    private int count;

    public WordResult(String word, int position, int count) {
        this.word = word;
        this.position = position;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public int getPosition() {
        return position;
    }

    public int getCount() {
        return count;
    }

    public void increaseCount() {
        count++;
    }
}
