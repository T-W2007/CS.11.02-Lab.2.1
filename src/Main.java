public class Main {


   public static void main(String[] args) {
       int twosum = add(3, 5);
       System.out.println(twosum);
       int foursum = add(1, 2, 3, 4);
       System.out.println(foursum);
       String morning = morningGreeting("Thomas");
       System.out.println(morning);
       String afternoon = afternoonGreeting("Claire");
       System.out.println(afternoon);
       String third = triple("Wow");
       System.out.println(triple("wow"));
       System.out.println(third);
       double biggertwo = half(20);
       System.out.println(biggertwo);
       int roundup = roundPositiveValueToNearestInteger(15);
       System.out.println(roundup);
       int rounddown = roundNegativeValueToNearestInteger(-2);
       System.out.println(rounddown);
   }


   public static int add(int a, int b) {
       return a + b;
   }


   public static int add(int a, int b, int c, int d) {
       return add(add(add(a, b), c), d);
   }


   public static String morningGreeting(String name) {
       return "早上好, " + name + "!";
   }


   public static String afternoonGreeting(String name) {
       return "下午好, " + name + "!";
   }


   public static String triple(String input) {
       return input + input + input;
   }


   public static double half(int a) {
       return (double) a / 2;
   }


   public static int roundPositiveValueToNearestInteger(double a) {
       return (int) (a + 0.5);
   }


   public static int roundNegativeValueToNearestInteger(double a) {
       return (int) (a - 0.5);
   }
}

