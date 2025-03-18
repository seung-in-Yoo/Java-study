package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split()
        String[] splitStr = str.split(",");
        for (String s: splitStr) {
            System.out.println(s);
        }

        // 그냥 join 안쓰고 합치는거
        String joinStr = "";
        for(String string : splitStr) {
            joinStr += string + "-";
        }

        for(int i=0; i<splitStr.length; i++) {
            String string = splitStr[i];
            joinStr += string;
            if (i != splitStr.length-1) {
                joinStr += "-";
            }
        }
        System.out.println("joinStr = " + joinStr);

        //join() 쓰고 간단하게 합치자
        String joinedStr = String.join("-","A","B","C");
        System.out.println("연결된 문자열 = " + joinedStr);

        String result = String.join("-",splitStr);
        System.out.println("result = " + result);
    }
}
