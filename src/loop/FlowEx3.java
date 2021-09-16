package loop;

import java.util.Scanner;

public class FlowEx3 {
    public static void main(String[] args) {

        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);
        outer :
        while (true){
            System.out.println(" (1) square");
            System.out.println(" (2) square root");
            System.out.println(" (3) log");
            System.out.println(" 원하는 메뉴 1~3을 선택하세요. (종료: 0) >");

            menu = scanner.nextInt();

            if(menu==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else if(menu<0 || menu >3){
                System.out.println("메뉴를 다시 선택하십시오.");
                continue;
            }

            for(;;){
                System.out.println("계산할 값을 입력하세요. (계산 종료 : 0 , 전체종료 : 99)");
                num = scanner.nextInt();

                if(num==0){
                    break ;
                }

                if(num==99){
                    break outer;
                }

                switch (menu){
                    case 1:
                        System.out.println("result = " + num*num);
                        break ;
                    case 2 :
                        System.out.println("result = " + Math.sqrt(num));
                        break ;
                    case 3 :
                        System.out.println("result = "+ Math.log(num));
                        break ;
                }
            }

        }
    }
}
