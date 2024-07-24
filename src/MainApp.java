public class MainApp {
    
    public static void main(String[] args){

    int a = 10;
    int b = 20;
    int c = 11;
    int d = 12;

    int sum1 = a+b;
    boolean bool1 = sum1 % 2 == 0;
    
    int sum2 = c+d;
    boolean bool2 = sum2 % 2 == 0;
    
    if (bool1 && bool2) {
        System.out.println("Obie sumy są parzyste");
    } else {
        System.out.println("Nie wszystkie sumy są patrzyste");
    }
      }

}
