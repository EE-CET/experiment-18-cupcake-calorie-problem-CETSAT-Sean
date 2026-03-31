import java.util.Scanner;
public class Cupcake {
        static Scanner sc = new Scanner(System.in);

        public static int[] arrInput(int n){
                int[] arr = new int[n];
                for(int i=0; i<n; i++){
                        arr[i] = sc.nextInt();
                }
                return arr;
        }

        public static void arrSort(int[] arr){
                for(int i=0; i<arr.length; i++){
                        for(int j=i+1; j<arr.length; j++){
                                int temp = 0;
                                if(arr[j] > arr[i]){
                                        temp = arr[j];
                                        arr[j] = arr[i];
                                        arr[i] = temp;
                                }
                        }
                }
        }

        public static long miles(int[] arr){
                long m = 0;
                for(int j=0; j<arr.length; j++){
                        m += arr[j] * (long)Math.pow(2,j);
                }
                return m;
        }
        // TODO: Read n
        // TODO: Read calorie counts into an array
        // TODO: Sort the array (think about ascending vs descending)
        // TODO: Calculate the minimum miles using the formula (c * 2^j)
        // TODO: Print the result (Use 'long' for the sum to avoid overflow)
        public static void main(String[] args) {
                int n = sc.nextInt();
                int[] arr = arrInput(n);
                arrSort(arr);
                System.out.println(miles(arr));
        }
}               
