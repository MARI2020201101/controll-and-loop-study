package loop;

public class FlowEx2 {
    public static void main(String[] args) {
        Loop1 : for(int i=2;i<=9;i++){
            for(int j =1 ; j <=9 ;j++){
                if(j==5)
                    break Loop1;
                System.out.printf("%d * %d = %d", i, j, i*j);
                System.out.println();
            }
        }
        System.out.println("End of Loop 1");
    }
}
