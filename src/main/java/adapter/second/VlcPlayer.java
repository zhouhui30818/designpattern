package adapter.second;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/16 14:59
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {
        //什么也不做
    }
}
