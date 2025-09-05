class Fourteen {
    public static void main(String args[]) {
        int colattz = 13;   
        int maxcount = 0;   

        for (int i = 1000000; i >= 13; i--) {
            long a = i;     
            int count = 1;  

            while (a != 1) {
                if (a % 2 == 0) {
                    a = a / 2;
                } else {
                    a = 3 * a + 1;
                }
                count++;
            }

            if (count > maxcount) {
                maxcount = count;
                colattz = i;
            }
        }

        System.out.println(colattz);       
    }
}
