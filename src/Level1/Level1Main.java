package Level1;

public class Level1Main {
    public static void main(String[] args) {
        String[] keyword1 = {"기철초풍", "멋있는", "재미있는"};
        String[] keyword2 = {"도전적인", "노란색의", "바보같은"};
        String[] keyword3 = {"돌고래", "개발자", "오랑우탄"};

        RandomNicknameGenerator generator = new RandomNicknameGenerator(keyword1, keyword2, keyword3);
        System.out.println("랜덤 닉네임: " + generator.generate());
    }
}
