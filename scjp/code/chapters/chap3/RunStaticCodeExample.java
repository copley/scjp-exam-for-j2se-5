 class StaticCodeExample {
   static int counter=0;
   static {
        counter++;
       System.out.println("Static Code block: counter: " + counter);
   }
   StaticCodeExample() {
           System.out.println("Construtor:  counter: " + counter);
   }
 }
 public class  RunStaticCodeExample {
   public static void main(String[] args) {
         StaticCodeExample sce = new StaticCodeExample();
         System.out.println("main: counter: " + sce.counter);                  
   }
 }