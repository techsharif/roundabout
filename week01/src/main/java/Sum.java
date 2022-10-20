public class Sum {

     Integer start;
     Integer end;
     Long sum = 0L;

     public Sum(Integer start, Integer end) {
          this.start = start;
          this.end = end;
     }

     public Long getSum() {
          return sum;
     }

     private boolean isPrime(Integer n){
          if (n < 2) return false;
          for (int i=2; i * i <= n; i++){
               if (n % i == 0) return false;
          }
          return true;
     }

     private Long primeSum(Integer n){
          Long ps = 0L;
          for (int i=2; i<=n ; i++){
               if (isPrime(n)) ps += i;
               ps %= 100000007;
          }
          return ps;
     }

     public Long calculateSum(Integer start, Integer end){
          Long sum = 0L;
          for (Integer i = start; i<= end; i++){
               sum += primeSum(i);
          };
          return sum;
     }

     public Long calculateSum1(Integer start, Integer end){
          Long sum = 0L;
          for (Integer i = start; i<= end; i++){
               sum += i;
          };
          return sum;
     }

     public void compute(){
         if (end < start) sum = 0L;
         sum = calculateSum(start, end);
     }


}
