import java.util.Scanner;
public class Q27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to convert in Hexadecimal : ");

        int num = sc.nextInt();
        
        String hex = getHexaDecimal(num);
        System.out.println("Hexadecimal is : "+hex);
    }

    public static String getHexaDecimal(int n) {
        String Hex = "";

        while (n > 0) {
            int rem = n % 16;

            if (rem <= 9)
                Hex = rem + Hex;
            else
                Hex = (char) (rem + 55) + Hex;
            
                /*
            else if (rem == 10)
                Hex = Hex + 'A';
            else if (rem == 11)
                Hex = Hex + 'B';
            else if (rem == 12)
                Hex = Hex + 'C';
            else if (rem == 13)
                Hex = Hex + 'D';
            else if (rem == 14)
                Hex = Hex + 'E';
            else if (rem == 15)
                Hex = Hex + 'F';
            */
                
            
            n /= 16;
        }
        return Hex;
    }

}
