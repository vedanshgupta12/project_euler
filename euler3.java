class project_euler3
{
    public static void main(String[] args) {
        long primefact = 0;
        for (long i = 1; i <= 600851475143L; i++) {
            if (600851475143L % i == 0) {
                int count = 0;
                for (long j = 1; j <= i; j++) {
                    if (i % j == 0)
                        count++;
                }
                if (count == 2)
                    primefact = i;
            }
        }
        System.out.println(primefact);
    }
}
