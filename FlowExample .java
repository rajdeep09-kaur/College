import java.awt.*;

public class FlowExample {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout Example");
        
        // Set the layout manager
        frame.setLayout(new FlowLayout());
        
        frame.add(new Button("Button 1"));
        frame.add(new Button("Button 2"));
        frame.add(new Button("Button 3"));
        
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
