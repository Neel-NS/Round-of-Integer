import java.util.Scanner;

class roundIntegerTestCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for(int m=0; m<t; m++) {
            long n = input.nextLong();
            long a = n;
            long sum = 0;

            if(a>0) {
                while(a!=0) {
                    sum = sum + a%10;
                    a = a/10;
                }
            }
            for(int i=0; i<=9; i++) {
                if((sum+i) % 10 == 0) {
                    System.out.println(n+""+i);
                    break;
                }
            }
        }
    }
}
