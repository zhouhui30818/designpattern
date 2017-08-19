package flyweight;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 12:00
 */
public class Main {

    /**
     *  享元模式（Flyweight）享元模式的主要目的是实现对象的共享，即共享池
     *  对象的创建销毁，开销比较大，可以同意管理，共享池减小开销
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Main().new MyRun(),String.valueOf(i)).start();
        }
        ConnectionPool.closeAll();
    }

    class MyRun implements Runnable{

        public void run() {
            System.out.println(Thread.currentThread().getName() + ":" + ConnectionPool.fetchConnection());
        }
    }
}


