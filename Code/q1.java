class q1 {
    public static int countDigit(int n) {
        int count = 0; 
        while (n > 0) {
            int rem = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }

    public static int multiple(int n) {
        int mul = 1;
        while (n > 1) {
            mul *= 10;
            n--;   
        }
        return mul;
    }

    public static boolean checknumDecreasing(int n, int count, int mul) {
        int var1 = 10;   
        while (n > 0) {
            int var2 = n / mul;  
            if (var1 > var2) {
                n -= (var2 * mul);
                mul /= 10;
                var1 = var2;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] a) {
        int value = 4321;
        int c = countDigit(value);   
        int m = multiple(c);
        if (checknumDecreasing(value, c, m)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}