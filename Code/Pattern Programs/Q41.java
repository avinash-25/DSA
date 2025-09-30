public class Q41 {

    public static void PrintPattern(int n) {
        int star = 1;
        int num = n * (n + 1) / 2;
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print("\t");
            for (int j = 1; j <= star; j++)
                System.out.print(num--+"\t");
            
            star++;
            space--;  
            num = num + (2 * i + 1);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n = 6;
        PrintPattern(n);
    }

}
