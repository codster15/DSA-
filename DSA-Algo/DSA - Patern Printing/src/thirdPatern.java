public class thirdPatern {
    public static void main(String[] args) {

        int n = 4;

        for(int i = 0 ; i <= n; i++){

            for (int j = 0; j < n ; j ++ ){

                if(i == 1 && j ==1){
                    System.out.print("   ");
                    break;
                }else{
                    System.out.print(" * " );
                }


            }
            System.out.println();
        }
    }
}
