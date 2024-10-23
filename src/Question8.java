import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int[] numbers= {2,4,6,8,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요: ");
        int target = sc.nextInt();

        boolean flag = false;

        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
            if(target == numbers[i]){
              flag =true;
              break;

            }

            }
        if(flag){
            System.out.println("존재합니다");
        }else{
            System.out.println("존재하지않습니다");
        }
    }
}
