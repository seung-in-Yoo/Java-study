package lang.object.test;

public class RetangleMain {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(100,20);
        Rectangle rect2 = new Rectangle(100,20);
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect1 == rect2); // 동일성 비교 (false)
        System.out.println(rect1.equals(rect2)); // 동등성 비교 (true)
    }
}
