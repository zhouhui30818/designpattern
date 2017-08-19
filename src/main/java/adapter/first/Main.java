package adapter.first;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/14 15:07
 */
public class Main {

    /**
     *  接口Sourceable有两个方法，如果直接继承，需要实现其素有的方法，但是某些时候只需要实现部分
     *  现在的实现是，抽象类Wrapper实现接口Sourceable
     *  根据实际情况重写抽象类的方法
     */
    public static void main(String[] args) {
        Sourceable sourceable1 = new SourceSub1();
        sourceable1.method1();
        sourceable1.method2();

        Sourceable sourceable2 = new SourceSub2();
        sourceable2.method1();
        sourceable2.method2();
    }
}
