public class Q45{
    static  int OrignalArr[] = {80,80,43,50,38,63,58,80};

    public static void main(String[] args) {
        
        int num = secondBiggest(OrignalArr);
        System.out.println("Second Biggenst number is : "+num);

    }
        public static int secondBiggest(int[] a){
            int max = Integer.MIN_VALUE;
            int secondMax = max;

            for(int x:a){
                if(x > max){
                    secondMax = max;
                    max = x;
                }else if(x > secondMax && x != max){
                    secondMax = x;
                }
            }

           return  secondMax;
        }
}

