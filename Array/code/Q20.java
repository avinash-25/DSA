
import java.util.Scanner;

public class Q20{
    static  int OrignalArr[] = {10,20,30,40,50,60,70};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the index to delete : ");
        int index = sc.nextInt();

        

        int[] updatedArr = removeElement(OrignalArr, index);

        for(int i = 0; i<updatedArr.length;i++){
            System.out.println(updatedArr[i]+" ");
        }
    }
        public static int[] removeElement(int[] a, int index){
            if(index < 0 || index > OrignalArr.length-1)
               return a;
            int[] b = new int[a.length-1];

            for(int i = 0; i < b.length; i++){
                if(i < index)
                  b[i] = a[i];
                else
                  b[i] = a[i+1];
            }
            return b;
        }
}

