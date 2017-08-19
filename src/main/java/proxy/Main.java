package proxy;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/14 16:02
 */
public class Main {

    /**
     * 代理模式，就是对实际的资源进行了包装，包装类可以进行扩展操作。
     * 代理模式和装饰模式，相同点都是实现接口，可以进行扩展，不同点是装饰器模式需要调用者生成，代理模式是进行了封装袋里，调用者不知道被代理的信息。
     */
    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}
