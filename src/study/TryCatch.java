package study;

public class TryCatch {
    public static void main(String[] args) {

        try {
            System.out.println(10 / 1);
            System.out.println("끝");
        }catch(Exception e){
            System.out.println("예외처리");
        }finally {
            System.out.println(1);
        }
    }
}
// 예외가 발생할 수도 있는 코드들은 try {} 안으로 감싸주고 예외가 발생하면 catch 안에 있는 코드 실행 finally 는 반드시 실행되는 코드