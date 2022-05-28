package codigTest2;

public class 코딩테스트7 {
    static int sum = 0;
    int data = 0;

    public static void main(String[] args) {
        코딩테스트7 p = new 코딩테스트7();
        int data = 0;
        int sum = 0 ;
        while(data<=10) {
            sum += data;
            data++;
        }
        System.out.println(data+ " : " + 코딩테스트7.sum);
    }
}
