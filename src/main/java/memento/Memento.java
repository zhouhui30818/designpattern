package memento;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 14:43
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
