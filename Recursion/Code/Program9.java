public class Program9 {
  public static void main(String[] ar){
      int n1 = 10, n2 = 20, n3 = 30, n4 = 40;
      
      System.out.println("Biggest Without Rrcursion : ");
      int biggest = big(n1, n2, n3, n4);
      System.out.println(biggest);

      System.out.println("Biggest Using Rrcursion : ");

      int bigNum = bigUsingRecursion(bigUsingRecursion(n1, n2), bigUsingRecursion(n3, n4));
      System.out.println(bigNum);

  }
  public static int bigUsingRecursion(int a, int b){
      return a > b ? a : b;
  }

  public static int big(int a, int b, int c, int d){
      return (a > b && a > c && a > d) ? a : (b > c && b > d) ? b : (c > d) ? c : d;
  }
}
