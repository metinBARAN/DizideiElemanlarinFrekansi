import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        int[] arr={60,50,10,60,30,30,40,50,10,80,40,60,20};
        int sizes=arr.length;

        int[] frequency=new int[sizes];

        for (int i=0;i<sizes;i++) {
            frequency[i] = 1;
        }

        for (int i=0;i<sizes;i++){
            for (int j=0;j<sizes;j++){
                if ((i!=j)&&(arr[i]==arr[j])){
                    frequency[i]++;
                }
            }
        }
        for (int i=0;i<sizes;i++){
            for (int j=0;j<sizes;j++){
                if ((i !=j) && (arr[i]==arr[j])){
                    arr[j]=0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<sizes;i++){
            if (frequency[i]>1){
                if (arr[i]!=0) {


                    System.out.println(arr[i] + " sayisi " + frequency[i] + " kere tekrar edildi.");
                }
            }

        }
    }
}
