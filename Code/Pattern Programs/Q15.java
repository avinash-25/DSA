class Q15{
    
    public static void PrintPattern(int n){

        int star = 1;
        int space = n-1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++)
                System.out.print(" ");

            for (int j = 1; j <= star; j++) 
                System.out.print("* ");

            star++;
            space--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num = 5;
        PrintPattern(num);
    }
}
