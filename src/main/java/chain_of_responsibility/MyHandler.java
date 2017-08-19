package chain_of_responsibility;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 14:33
 */
public class MyHandler extends AbstractHandler implements Handler{

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    public void operator() {
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }
}
