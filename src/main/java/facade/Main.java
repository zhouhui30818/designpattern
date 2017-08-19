package facade;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/14 16:18
 */
public class Main {


    /**
     * 外观模式，其思想是对一系列的子类进行封装，对外提供封装之后的接口调用。
     * 比如启动计算机，需要启动cpu，内存，硬盘，如果由调用者自己分别启动，那么后期再要启动启动设备，那么调用者就需要修改。
     * 现在封装一个计算机类，调用者只需要对计算机启动，至于要启动cpu，内存，硬盘或者还有其他的设备，都是透明的。
     * 减小了耦合度。
     *
     * 其他的例子：
     * 房间有电扇，点灯，电视等，如果需要逐个开关，比较复杂，电源总开关就是外观模式。
     * 参考图：http://img.my.csdn.net/uploads/201205/04/1336116055_1914.jpg
     */
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
    }
}
