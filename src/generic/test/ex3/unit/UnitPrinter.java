package generic.test.ex3.unit;

public class UnitPrinter {

    static <T extends BioUnit> void printV1(Shuttle<T> unit) {
        T out = unit.out();
        System.out.println("이름 : " + out.getName() + ", HP : " + out.getHp());
    }

    static void printV2(Shuttle<? extends BioUnit> unit) {
        BioUnit out = unit.out();
        System.out.println("이름 : " + out.getName() + ", HP : " + out.getHp());
    }
}
