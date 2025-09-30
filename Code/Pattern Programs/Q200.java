class Q200{
    
    public static void PrintPattern(int n){

        int mid = n / 2 + 1;
        int startStar = 1;
        int endStar = n;

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++) {
                if (j <= startStar || j >= endStar)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            if (i < mid) {
                startStar++;
                endStar--;
            }
            else {
                startStar--;
                endStar++;
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num = 7; // Here value of n always should be odd
        PrintPattern(num);
    }
}
