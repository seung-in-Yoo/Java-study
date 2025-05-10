package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초) 가져오기
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis : " + currentTimeMillis);

        // 현재 시간(나노초) 가져오기
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano : " + currentTimeNano);

        // 환경 변수 읽기
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version")); // 자바 버전 읽기

        // 배열을 고속으로 복사
        char[] originalArray = {'h','e','l','l','o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray,0,copiedArray,0,originalArray.length);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        // System.exit(0); // 가급적이면 사용 X

    }
}
