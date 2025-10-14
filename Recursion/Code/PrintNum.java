class PrintNum{
    public static void main(String[] args) {
        System.out.println("Main Starts");
        OneToTen(1);
        System.out.println("Main Ends");
    }
    
    public static void OneToTen(int n) {
        if (n <= 10) {
            System.out.println(" " + n);
            OneToTen(n + 1);
            System.out.println(" " + n);
        }
    }
}