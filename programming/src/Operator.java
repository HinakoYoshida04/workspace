public class Operator {
    public static void main(String[] args) {
        // ソースコードをここに記述
      int a = 0b1100;
      int b = 0b1010;

      System.out.println("a & b: " + Integer.toBinaryString(a & b));
      System.out.println("a << 1: " + Integer.toBinaryString(a << 1));
    }
      
}
