package mediator;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 15:06
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
