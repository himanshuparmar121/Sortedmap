//  Print a following Pattern
/*
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 

 */



class Pattern{

        public static void main(String... args){

                for(int row = 1; row <= 5; row++){

                        for(int col = 1; col <= 5; col++){

                                System.out.printf(col+" ");

                        }
                                System.out.println();

                }

        }


}

