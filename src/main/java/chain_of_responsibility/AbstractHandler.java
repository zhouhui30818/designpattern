package chain_of_responsibility;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 14:32
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
