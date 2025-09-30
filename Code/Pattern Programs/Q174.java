class Q174{
    
    public static void PrintPattern(int n){

        int star = 1;
        int space = n/2;
        int rowMid = n / 2 + 1;
        int num = 1;


        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++)
                System.out.print("  ");
              
            for (int j = 1; j <= star; j++){
              System.out.print((char)(64+j)+" ");
            }
            if (i < rowMid) {
                star+=2;
                space--;
            }
            else {
                star-=2;
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
