package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "           Java Programming   ";
        System.out.println("소문자 변환: " + strWithSpaces.toLowerCase());
        System.out.println("대문자 변환: " + strWithSpaces.toUpperCase());

        System.out.println("공백 제거: '" + strWithSpaces.trim() + "'");  // trim 사용
        System.out.println("공백 제거: '" + strWithSpaces.strip() + "'"); // strip 사용
        System.out.println("앞 공백 제거: '" + strWithSpaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거: '" + strWithSpaces.stripTrailing() + "'");
    }
}
