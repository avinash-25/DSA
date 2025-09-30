public class Q76 {

    public static void PrintPattern(int n) {
        int star = 1;
        int space = n - 1;
        int num = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            int starMid = star/2 +1;
            for (int j = 1; j <= star; j++) {
                if(j < starMid)
                    System.out.print(num++ + " ");
                  else
                  System.out.print(num--+" ");
            }
                
            
            star += 2;
            space--;  
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n = 6;
        PrintPattern(n);
    }

}
