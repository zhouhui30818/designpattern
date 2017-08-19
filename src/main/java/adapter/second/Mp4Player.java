package adapter.second;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/16 15:00
 */
public class Mp4Player implements AdvancedMediaPlayer{

    public void playVlc(String fileName) {
        //什么也不做
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
