public class Recursion {
  
  //Q1: How to find the sum of digits of a positive integer number using recursion?   
  public static int sumIntDigits(int n) {

    if(n<=0){
      return 0;
    }

    return n%10 + sumIntDigits(n/10);
  }
}
