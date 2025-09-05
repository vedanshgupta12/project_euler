import java.math.BigInteger;

class sixteen2
 {
    public static void main(String args[]) 
    {
        
        BigInteger a = BigInteger.valueOf(2).pow(1000);
        BigInteger b = a;
        BigInteger ten = BigInteger.TEN;
        BigInteger sum = BigInteger.ZERO;

        while (!b.equals(BigInteger.ZERO)) {
            BigInteger[] divRem = b.divideAndRemainder(ten);
            sum = sum.add(divRem[1]); 
            b = divRem[0];          
        }

        System.out.println(sum); 
    }
}
