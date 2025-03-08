package lang.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속받음. (최상위 부모 클래스는 Object)
// 묵시적 vs 명시적
// 묵시적: 개발자가 코드에 직접 기술하지 않아도 시스템 또는 컴파일러에 의해 자동으로 수행되는 것을 의미
// 명시적: 개발자가 코드에 직접 기술해서 작동하는 것을 의미

public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
