package study.copyobject;

public class CopyObject {
    private String name;
    private String author;

    public CopyObject() {
    }

    public CopyObject(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    protected CopyObject clone() throws CloneNotSupportedException {
        return (CopyObject) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return author;
    }

    public void setAge(String author) {
        this.author = author;
    }


    void mshallowCopy() throws CloneNotSupportedException {
        CopyObject original = new CopyObject("자바 공부중", "동현");
        CopyObject copy = original.clone();

        copy.setName("한별");

        System.out.println(original.getName());
        System.out.println(copy.getName());
    }


}
