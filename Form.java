import java.awt.*;
import java.awt.event.*;

public class CardExample {
    public static void main(String[] args) {
        Frame frame = new Frame("CardLayout Example");

        Button button = new Button("NEXT");
        TextField TX1 = new TextField("USERNAME", 20);
        TextField TX2 = new TextField("PASSWORD", 20);

        CardLayout cl = new CardLayout();
        Panel panel = new Panel();
        panel.setLayout(cl);

        panel.add(TX1, "Username");
        panel.add(TX2, "Password");
        panel.add(button, "Submit");

        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
