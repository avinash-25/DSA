class Pattern22{
    
    public static void PrintPattern(int n){

        int star = 1;
        int i = 1;
        int j = 1;

        for(i = 1; i <= n; i++){
            int num = i;
            for( j = 1; j <= star; j++){
                System.out.print(num-- +" ");
                star++;
                System.out.println();
            }
            
        }
    }
    public static void main(String[] args) {
        int num = 5;
        PrintPattern(num);
    }
}
