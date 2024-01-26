



public class UniqueElements {
    public static void main(String[] args) {

        int arr[] = {3, 7, 7, 1, 3, 3, 8};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {


                if (arr[i] == arr[j]) {

                    count++;
                }


            }

//            System.out.println(count);

            if (count == 1) {
                System.out.println(arr[i]);
            }

            count = 0 ;


        }
    }
}