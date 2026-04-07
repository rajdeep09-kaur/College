import java.awt.*;

public class button extends Button {

    button(String text) {
        super(text);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        Panel p = new Panel(null);

        button bt = new button("Click here");
        bt.setBounds(100, 150, 100, 40);

        p.add(bt);
        frame.add(p);

        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}
