package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        // String은 불변 객체이므로 변경이 필요한 경우 기존 값을 변경하지 않고, 새로운 결과를 만들어서 반환
        // String은 왜 불변 객체일까? => 만약 String 내부의 값을 변경할 수 있다면, 기존에 문자열 풀에서 같은 문자를 참조하는
        // 변수의 모든 문자가 함께 변경되어 버리는 문제가 발생
    }
}
