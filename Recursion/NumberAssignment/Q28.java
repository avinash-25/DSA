import java.util.Scanner;
public class Q28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hexadecimal to convert in to Decimal : ");

        String str = sc.next();
        
        String res = convertHexToDec(str);
        System.out.println(res);
    }

    public static String convertHexToDec(String s) {
        int dec = 0;
        int sixteenNum = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if(c >= 48 && c <= 57)
                dec = dec + sixteenNum * (c - 48);
            else if( c >= 'A' && c <= 'F')
                dec = dec + sixteenNum * (c - 55);
            else if( c >= 'a' && c <= 'f')
                dec = dec + sixteenNum * (c - 87);
            else
                return "Invalid hexadecimal number: It should be in range of 0...F ";

            sixteenNum *= 16;
        }

        return "Decimal Number is : "+dec;
    }
}
