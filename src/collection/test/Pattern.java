package collection.test;

public enum Pattern {
    SPADE("♠"), HEART("♥"), DIAMOND("♦"), CLOVER("♣");

    private String pattern;

    Pattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

}
