public class Recursion {
  
  // How to calculate power of a positive int using recursion ? 
  public static int numPow(int n, int pow) {
    if(pow < 2) {
      return n;
    }

    return n * numPow(n, pow -1);
  }

  //Q1: How to find the sum of digits of a positive integer number using recursion?   
  public static int sumIntDigits(int n) {

    if(n<=0){
      return 0;
    }

    return n%10 + sumIntDigits(n/10);
  }
}
