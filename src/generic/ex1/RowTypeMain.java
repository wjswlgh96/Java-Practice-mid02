package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();               // 이렇게 타입 인자를 아무것도 전달을 안해주면 Object 로 된다. 이런 것을 로 타입( Row type ), 또는 원시 타입이라고 한다.
        // GenericBox<Object> integerBox = new GenericBox<>();  // 권장
        integerBox.set(10);
        Integer o = (Integer) integerBox.get();
        System.out.println("o = " + o);

        // 위처럼 원시 타입을 지원하는 이유는 자바가 오랜기간 사용된 이후에 제네릭이 등장했기 때문에 제네릭이 없던 시절의 과거 코드와의 하위 호환이 필요했다. 그래서 어쩔 수 없이 이런 원시 타입을 지원한다.
        // 정리하면 로 타입을 사용하지 않아야 한다.
    }
}
