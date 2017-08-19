package mediator;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 15:07
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
