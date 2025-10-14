class Q178{
    
    public static void PrintPattern(int n){

        int star = 1;
        int space = n/2;
        int rowMid = n / 2 + 1;
        int num = 64+rowMid;


        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++)
                System.out.print("  ");
              
            for (int j = 1; j <= star; j++){
              System.out.print((char)(num)+" ");
            }
            if (i < rowMid) {
                star+=2;
                space--;
                num--;
            }
            else {
                star-=2;
                space++;
                num++;
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num = 7; // Here value of n always should be odd
        PrintPattern(num);
    }
}
