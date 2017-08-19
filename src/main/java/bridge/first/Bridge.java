package bridge.first;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/14 16:49
 */
public class Bridge {

    private Sourceable sourceable;

    public Bridge(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    public void execute(){
        sourceable.method();
    }
}
