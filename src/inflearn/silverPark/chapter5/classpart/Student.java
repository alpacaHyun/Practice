package inflearn.silverPark.chapter5.classpart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student(){} // 기본생성자

    public Student(int id, String name){
        this.studentID = id;
        this.studentName = name;


    }

    public void showStudentInfo(){
        System.out.println(studentName + "," + address);
    }

    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String name){
        studentName = name;
    }


}
