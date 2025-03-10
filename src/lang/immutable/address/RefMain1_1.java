package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유 가능
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        b.setValue("부산"); // b의 값을 부산으로 변경해야함 (하지만 a,b는 같은 인스턴스를 참조) => a의 값도 함께 부산으로 변경됨
        System.out.println("부산 => b");
        System.out.println("a = " + a); // 사이드 이팩트 발생 (a까지 부산으로 바뀌어버림)
        System.out.println("b = " + b);


    }
}
