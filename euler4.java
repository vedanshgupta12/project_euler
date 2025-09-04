class euler4
  {
    public static void main(String[] args) {
        int palprime = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                int sum = 0;
                int x = i * j;
                int y = x;
                while (y != 0) {
                    int r = y % 10;
                    sum = sum * 10 + r;
                    y = y / 10;
                }
                if (sum == x && sum > palprime)
                    palprime = x;
            }
        }
        System.out.println(palprime);
    }
}
