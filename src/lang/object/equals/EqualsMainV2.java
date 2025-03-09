package lang.object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        // 현재 동일성은 다르지만 동등성은 똑같음 (객체의 참조가 다르지만 둘다 같은 id가 같음)
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2)); // 결과 false
        System.out.println("equality = " + user1.equals(user2)); // 결과 true (오버라이딩 제대로 됨)

    }


}
