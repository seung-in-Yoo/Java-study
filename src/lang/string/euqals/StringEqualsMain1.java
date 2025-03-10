package lang.string.euqals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); // 참조값 x001
        String str2 = new String("hello"); // 참조값 x002
        System.out.println("new String() == 비교: " + (str1 == str2)); // false
        System.out.println("new String() equals 비교: " + (str1.equals(str2))); // true

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4)); // true
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4))); // true
        // 여기서는 왜 둘다 true가 나오지? => 문자열 리터럴을 사용하는 경우 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용
        // 같은 문자를 사용하는 경우 문자열 풀을 사용하여 메모리 사용을 줄이고 성능을 최적화
        // 풀(Pool) => 공용 자원이 모여있는 곳 => 힙 영역, 해시 알고리즘 사용
    }
}
