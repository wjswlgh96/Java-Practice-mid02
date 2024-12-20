package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 100);

        AnimalMethod.checkUp(dog);
        AnimalMethod.checkUp(cat);

        Dog targetDog = new Dog("큰 멍멍이", 300);
        Dog biggerDog = AnimalMethod.bigger(dog, targetDog);
        System.out.println("biggerDog = " + biggerDog);
    }
}
