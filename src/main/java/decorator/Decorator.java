package decorator;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/14 15:34
 */
public class Decorator implements Sourceable{


    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        System.out.println("before");
        sourceable.method();
        System.out.println("after");
    }
}
