class Q107{
    
    public static void PrintPattern(int n){

        int star = n;
        int space = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++)
                System.out.print(" ");

            for (int j = 1; j <= star; j++) 
                System.out.print("* ");

            star--;
            space++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num = 5;
        PrintPattern(num);
    }
}
