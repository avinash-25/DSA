class Q164{
    
    public static void PrintPattern(int n){

        int star = 1;
        int space = n/2;
        int rowMid = n / 2 + 1;
        int num = 1;


        for(int i = 1; i <= n; i++){
            if (i <= rowMid)
              num = i-1;
              else
              num = n-1;
            for(int j = 1; j <= space; j++)
                System.out.print(" ");
              
            int colMid = n / 2 + 1;
            for (int j = 1; j <= star; j++){
                System.out.print(num+" ");
            if (i <= rowMid)
              num = i-1;
            else
              num = n-1;
            }
            
            if (i < rowMid) {
                star++;
                space--;
            }
            else {
                star--;
                space++;
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num = 7; // Here value of n always should be odd
        PrintPattern(num);
    }
}
