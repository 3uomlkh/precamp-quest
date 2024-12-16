import java.util.Random;

public class Level1 {
    public static void main(String[] args) {
        // Lv1. 랜덤 닉네임 생성기
        String[] keyword1 = {"기철초풍", "멋있는", "재미있는"};
        String[] keyword2 = {"도전적인", "노란색의", "바보같은"};
        String[] keyword3 = {"돌고래", "개발자", "오랑우탄"};

        Random random = new Random();
        int i1 = random.nextInt(keyword1.length); // 0 ~ 2 사이의 랜덤 인덱스
        int i2 = random.nextInt(keyword1.length);
        int i3 = random.nextInt(keyword1.length);

        System.out.print("랜덤 닉네임: " + keyword1[i1] + " " + keyword2[i2] + " " + keyword3[i3]);
    }
}