import java.util.Scanner;

class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "Avi123";
        int attempts = 3;  
        boolean loggedIn = false;

        do {
            System.out.println("Your Left Attempt: " + attempts);
            System.out.print("Enter Password: ");
            String askedPass = sc.next();

            if (askedPass.equals(password)) {
                loggedIn = true; 
                break;
            }

            attempts--; 

        } while (attempts > 0);

        if (loggedIn)
            System.out.println("You are logged in");
        else
            System.out.println("Your Account has been locked");
    }
}
