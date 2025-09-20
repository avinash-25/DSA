class Q13{
    
    public static void PrintPattern(int n){

        int star = 1;
        int x = n;
        int i = 1;
        int j = 1;

        for(i = 1; i <= x; i++){
            for( j = 1; j <= star; j++){
                System.out.print("* ");
                ++star;
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int num = 5;
        PrintPattern(num);
    }
}
