package lang.string.euqals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello"); // 참조값 x001
        String str2 = new String("hello"); // 참조값 x002
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
        // 이렇게 사용하면 안됨 return x == y; => 문자열 비교는 == 으로 사용하면 안됨
        return x.equals(y);
    }
}
