
import java.util.Scanner;

public class Q21{
    static  int OrignalArr[] = {10,20,30,40,50,60,70};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the index to insert : ");
        int index = sc.nextInt();
        System.out.println("Enter value : ");
        int value = sc.nextInt();

        

        int[] updatedArr = insertElement(OrignalArr, index, value);
        System.out.println("Orignal Array : ");
        System.out.println();


        for(int i = 0; i<OrignalArr.length;i++){
            System.out.print(OrignalArr[i]+" ");
        }
        System.out.println();
        System.out.println("Array After inserted : ");

        for(int i = 0; i<updatedArr.length;i++){
            System.out.print(updatedArr[i]+" ");
        }
    }
        public static int[] insertElement(int[] a, int index, int value){
            if(index < 0 || index > OrignalArr.length){
               System.out.println("Element cant be inserted at given index");
               return a;
            }
            int[] b = new int[a.length+1];
            b[index] = value;

            for(int i = 0; i < b.length; i++){
                if(i < index)
                  b[i] = a[i];
                else if(i > index)
                  b[i] = a[i-1];
            }
            return b;
        }
}

