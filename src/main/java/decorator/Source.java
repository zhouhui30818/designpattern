package decorator;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/14 15:34
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("Source method");
    }

}
