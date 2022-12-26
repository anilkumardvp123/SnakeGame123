import javax.swing.*;
import java.awt.*;

public class Game extends JFrame
{  {
    this.add(new Graphics());

    this.setTitle("Snake Game");

    this.pack();

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setResizable(false);

    this.setVisible(true);

    this.setLocationRelativeTo(null);

}
}
