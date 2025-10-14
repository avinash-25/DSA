class Pattern3{
    public static void main(String[] args) {
        int i = 0, j = 0;

        for(i = 1; i <= 5; i++){ // this is for row

             for(j = 1; j<= 5;j++){  // this is for column in each row
               System.out.print(i%2+" ");
               }
               System.out.println("");  // this will crete new line after each row completion
       }

    }
}