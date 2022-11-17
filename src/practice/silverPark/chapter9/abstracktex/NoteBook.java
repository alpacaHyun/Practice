package practice.silverPark.chapter9.abstracktex;

public abstract class NoteBook extends Computer{
    @Override
    public void display() {
        System.out.println("NoteBook display");
    }

    public abstract void typing();
}
