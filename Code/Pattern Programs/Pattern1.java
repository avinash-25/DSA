class Pattern1{
    public static void main(String[] args) {

        int i = 0, j = 0;


          for(i = 1; i <= 5; i++){ // this is for row
          String p = "";

             for(j = 1; j<= 5;j++){  // this is for column in each row
                p = p+"* ";
               }
               System.out.println(p);  // this will crete new line after each row completion
       }
    }
}

/**
         int i = 0, j = 0;

        for(i = 1; i <= 5; i++){ // this is for row

             for(j = 1; j<= 5;j++){  // this is for column in each row
               System.out.print("* ");
               }
               System.out.println("");  // this will crete new line after each row completion
       }
 */
