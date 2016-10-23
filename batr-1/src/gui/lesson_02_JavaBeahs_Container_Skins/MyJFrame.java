package gui.lesson_02_JavaBeahs_Container_Skins;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mega on 13.09.2016.
 */
public class MyJFrame extends JFrame {
    public MyJFrame(String title, int width, int height) {
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null); // располагает окно по центру
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.setVisible(true);
        super.setLayout(new FlowLayout());
    }

    public MyJFrame(String title, int width, int height, Component component) {
        this(title, width, height);
        super.getContentPane().add(component);
    }
}
