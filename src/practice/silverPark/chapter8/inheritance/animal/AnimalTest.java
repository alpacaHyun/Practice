package practice.silverPark.chapter8.inheritance.animal;

public class AnimalTest {
    public static void main(String[] args) {

        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());



    }
    public void moveAnimal(Animal animal){
        animal.move();
        //코드는 한줄인데 이 코드 한줄에 대한 결과는 다양하다 -> 이것이 다형성 (polymorphism)
    }
}
