package mediator;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 15:06
 */
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
