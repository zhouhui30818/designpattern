package facade;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/14 16:14
 */
public class Computer {

    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.disk = new Disk();
    }


    public void start(){
        cpu.start();
        memory.start();
        disk.start();
    }
}
