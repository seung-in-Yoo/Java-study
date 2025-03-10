package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        // x001
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate date2 = date1; // date1,date2 = x001
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        // 방법 1
        // date2 = new ImmutableMyDate(2025,1,1);

        // 방법 2
        date1 = date1.withYear(2025); // date1=x002. date2=x001
        System.out.println("date1 = " + date1); // x002
        System.out.println("date2 = " + date2); // x001
    }
}
