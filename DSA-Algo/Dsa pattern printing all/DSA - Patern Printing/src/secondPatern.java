
import java.util.*;
public class secondPatern {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int no = read.nextInt();


        int n = no;

        for(int i = 0 ; i <= n; i++){

            for (int j = 0; j < i ; j ++ ){

                System.out.print(" * " );
            }
            System.out.println();
        }
    }
}
