class Example{
    public static void main(String[] args) {
        System.out.println("Main start");
        test(1);
        System.out.println("Main End");
    }
    
    public static void test(int n) {
        if (n <= 3) {
            System.out.println("This is test method");
            test(n + 1);
        }
    }
}