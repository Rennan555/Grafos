public class MathBasics {
    
    private static int[] multiples(int num, int quant) {

        int[] res = new int[quant];
        
        for(int i=0;i<quant;i++) res[i] = num * (i + 2);

        return res;
    }

    private static int[] divisors(int num) {

        int nDiv = 0;

        for(int i=1;i<=num;i++) {
            if(num%i==0) ++nDiv;
        }

        int[] res = new int[nDiv];
        int iter = 0;

        for(int i=1;i<=num;i++) {
            if(num%i==0) {
                res[iter] = i;
                iter++;
            }
        }

        return res;
    }
}
