import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for (int i = 1; i <= n; i++ ){
            // System.out.print(i * 2+" ");                               // 2 table beacuse i =1 --> 10 <= n  (even number up to n)
            // System.out.println((i * 2)-1 +" ");                        //  10 odd number  will be printed
            System.out.print(i * i +" ");

            if(i % 2==0){
                                                          // even number 2 , 4 ,6 ,8 , 10;
                // System.out.print( i + " ");
            
            }
            
       }

       
    }
}
