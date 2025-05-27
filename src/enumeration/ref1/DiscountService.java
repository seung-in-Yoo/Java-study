package enumeration.ref1;


public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        // int discountPercent = classGrade.getDiscountPercent(); // 이 코드가 밑에 로직을 대체함

        /*
        if (classGrade == ClassGrade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }
         */
        return price * classGrade.getDiscountPercent() / 100;
    }
}
