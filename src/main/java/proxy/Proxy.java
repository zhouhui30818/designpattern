package proxy;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/14 16:00
 */
public class Proxy implements Sourceable{

    private Sourceable sourceable;

    public Proxy() {
        this.sourceable = new Source();
    }

    @Override
    public void method() {
        System.out.println("before");
        sourceable.method();
        System.out.println("after");
    }
}
