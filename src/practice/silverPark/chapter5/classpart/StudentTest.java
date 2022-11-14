package practice.silverPark.chapter5.classpart;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student(100, "이순신");   // studentLee, studentRim 은 지역변수
        studentLee.address = "고양시";

        Student studentRim = new Student(100, "임동현"); // 기본 생성자
        studentRim.address = "서울";

        Student studentKim = new Student(); // 기본 생성자를 만들어주었기 때문에 에러가 안남
        studentKim.studentName = "별";
        studentKim.studentID = 100;
        studentKim.address = "서울";

        studentRim.showStudentInfo();
        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        System.out.println(studentRim); //@ 뒤는  16진수 32비트 어드레스 (위치에 대한 주소값) - 힙메모리에 저장됨

    }
}

