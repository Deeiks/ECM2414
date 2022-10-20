public class FlagThreadApp {

        public static void main (String args[]) {
             FlagExample a = new FlagExample();
             FlagExample b = new FlagExample();
             a.start();
             b.start();
             System.out.println("Main thread is still running");
             /* note: below we are using the static (class level) sleep method
11 * as we do not have an instance to refer to cause the main thread
12 * to sleep, instead Thread.sleep() causes the currently executing
13 * thread to sleep which here is the main method as we want.
14 */
             try {
             Thread.sleep(1000); // sleep for 1000 milliseconds
                 } catch (InterruptedException e){
                 // as before, we are not going to respond to an interruption
                 }
             a.stopThread();
             b.stopThread();
             }
         }

