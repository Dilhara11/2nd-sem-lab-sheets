public class Pyramid {

    public void patternPrint() {
          int i;
          for (i = 1; i <= 5; i++) {
              int j;
              for (j = 1; j <= i; j++) {
                  System.out.print("* ");
              }
              System.out.print("\n");
          }
      }
}
