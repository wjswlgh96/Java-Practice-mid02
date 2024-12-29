package collection.test;

public class Card implements Comparable<Card> {
    private int value;
    private Pattern pattern;

    public Card(int value, Pattern pattern) {
        this.value = value;
        this.pattern = pattern;
    }

    public int getValue() {
        return value;
    }

    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public int compareTo(Card o) {
        return this.value == o.getValue() ? this.pattern.compareTo(o.getPattern()) : Integer.compare(this.value, o.getValue());
    }

    @Override
    public String toString() {
        return pattern.getPattern() + "(" + value + ")";
    }
}
