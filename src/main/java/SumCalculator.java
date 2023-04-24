public class SumCalculator {
    public int sum(int n) throws IllegalArgumentException {
        int sum = 0;
        if (n == 0){
            throw new IllegalArgumentException("Not equals zero");
        }
        else {
            if (n==1){
                sum = n;
            }
            else{
                for (int i = 1; i < n; i++) {sum = sum + n;}
            }
            return sum;
        }
    }
}


