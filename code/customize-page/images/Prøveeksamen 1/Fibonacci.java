public class Fibonacci {
    public int [] fib(int dim) {
        int [] retur = new int[dim];
        retur[0] = 0;
        retur[1] = 1;
        
        for (int i = 2; i < dim; i++) {
            retur[i] = retur[i - 1] + retur[i - 2];
        }
        return retur;
    }
    
    public void mainMethod() {
        int [] fibonacci = fib(20);
        for (int num : fibonacci) {
            System.out.println(num);
        }
    }
        
}
