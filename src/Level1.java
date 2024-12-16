import java.util.Random;

// Lv1. 랜덤 닉네임 생성기
public class Level1 {
    private String[] keyword1 = {"기철초풍", "멋있는", "재미있는"};
    private String[] keyword2 = {"도전적인", "노란색의", "바보같은"};
    private String[] keyword3 = {"돌고래", "개발자", "오랑우탄"};

    public String createRandomNickname() {
        Random random = new Random();
        int i1 = random.nextInt(keyword1.length); // 0 ~ 2 사이의 랜덤 인덱스
        int i2 = random.nextInt(keyword1.length);
        int i3 = random.nextInt(keyword1.length);
        return keyword1[i1] + " " + keyword2[i2] + " " + keyword3[i3];
    }

    public static void main(String[] args) {
        Level1 level1 = new Level1();
        String randomNickname = level1.createRandomNickname();
        System.out.print("랜덤 닉네임: " + randomNickname);
    }
}