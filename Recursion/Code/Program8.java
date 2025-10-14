class Program8{
  public static void main(String[] ar){
    int n1 = 10, n2 = 20, n3 = 30, n4 = 40, n5 = 50, n6 = 60, n7 = 70, n8 = 80, n9 = 90, n10 = 100, n11 = 110;

    int sum1 = add(n1, n2);

    int sum2 = add(add(n3,n4),n5);

    int sum3 = add(add(add(n6,n7), add(n8,n9)), add(n10, n11));

    System.out.println("Sum - 1 : "+sum1);
    System.out.println("Sum - 2 : "+sum2);
    System.out.println("Sum - 3 : "+sum3);

  }


  public static int add(int a, int b){
    return a+b;
  }
}