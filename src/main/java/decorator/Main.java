package decorator;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/14 15:35
 */
public class Main {

    /**
     * 有接口Sourceable的实现类Source，要扩展实现，一般的方法是继承，子类进行扩展
     * 另外的方法是，通过生成实现Sourceable接口，和类Source平行的类Decorator。
     * 讲source注入到Decorator中，在source本身的方法之外进行扩展。
     *
     * 思考：
     * 其实Decorator不实现Sourceable接口也是可以实现对source的扩展，但是实现接口的话，还可以返回Sourceable类型的对象
     * 对调用者是方便的。
     */
    public static void main(String[] args) {
        Sourceable sourceable = new Decorator(new Source());
        sourceable.method();
    }
}
