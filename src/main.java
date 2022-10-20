public class main {
    public static void main(String args[]){

        Thread first = new Thread(){
            public void run(){
                drawRocks(20);
                this.interrupt();
            }
        };
        Thread second = new Thread(){
            public void run(){
                drawRocks(20);
                this.interrupt();
            }
        };
        first.start();
        second.start();
        }
    public static void drawRocks(int x) {
        for (int i = 0; i < x; i++) {
            Ugg.UggRock rock = Ugg.drawRock();
            System.out.println(Thread.currentThread().getName() + ": type = "
                    + rock.getType() + ", size = " + rock.getSize());
        }
    }
}