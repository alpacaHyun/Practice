package practice.silverPark.chapter8.inheritance.animal;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {

        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());

//        Animal[] animalList = new Animal[3];
//        animalList[0] = new Human();
//        animalList[1] = new Tiger();
//        animalList[2] = new Eagle();
//
//        ArrayList animals = new ArrayList();
//        animals.add(new Human());
//        animals.add(new Tiger());
//        animals.add(new Eagle());

    }
    public void moveAnimal(Animal animal){
        animal.move();
        //코드는 한줄인데 이 코드 한줄에 대한 결과는 다양하다 -> 이것이 다형성 (polymorphism)

        // instanceOf -> 다운캐스팅 하는 키워드
    }
}
