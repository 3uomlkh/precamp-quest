package Level1;

import java.util.Random;

public class RandomNicknameGenerator {
    private final String[] keyword1;
    private final String[] keyword2;
    private final String[] keyword3;
    private final Random random = new Random();

    public RandomNicknameGenerator(String[] keyword1, String[] keyword2, String[] keyword3) {
        this.keyword1 = keyword1;
        this.keyword2 = keyword2;
        this.keyword3 = keyword3;
    }

    public String generate() {
        return String.join(" ", getRandomKeyword(keyword1), getRandomKeyword(keyword2), getRandomKeyword(keyword3));
    }

    private String getRandomKeyword(String[] keywords) {
        return keywords[random.nextInt(keywords.length)];
    }
}
