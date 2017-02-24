public class Fibonacci{
  public static void main(String[] args){
    int fPrev = 1;
    int fCurr = 1;
    int tmp = fPrev;
    for(int i = 1; i <= 100; i++){
      System.out.print(fCurr + " ");
      tmp = fCurr;
      fCurr = fCurr + fPrev;
      fPrev = tmp;
    }
  }
}
