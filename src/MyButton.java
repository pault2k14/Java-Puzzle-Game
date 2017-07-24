import javax.swing.*;

/**
 * Created by Paul on 7/23/2017.
 */

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyButton extends JButton {

    private boolean isLastButton;

    public MyButton() {

        super();
        initUI();
    }

    public MyButton(Image image) {
        super(new ImageIcon(image));
        initUI();
    }

    private void initUI() {

        isLastButton = false;
        BorderFactory.createLineBorder(Color.GRAY);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.GRAY));
            }
        });
    }

    public void setLastButton() {
        isLastButton = true;
    }

    public boolean isLastButton() {
        return isLastButton;
    }
}
