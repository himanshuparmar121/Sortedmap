class StringDemo {

        public static void main(String[] args) {

                String s1 = new String("BieMedia");
                String s2 = new String("Bielearn");
                String s3 = new String("BieTickets");

                System.out.println(s1.indexOf('b'));         // 
                System.out.println(s2.indexOf('e',3));       // 4
                System.out.println(s2.indexOf("kets",9));    // -1
        }
}
