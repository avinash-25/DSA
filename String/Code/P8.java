public class P8 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Mohan");
        StringBuilder sb2 = new StringBuilder("Mohan");

        System.out.println(sb1 == sb2);

        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.toString().equals(sb2.toString()));

    }
}
