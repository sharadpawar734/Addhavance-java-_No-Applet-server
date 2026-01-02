import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

public class mouse extends JFrame {
    private Point emojiPosition = new Point(0, 0);

    public mouse() {
        setTitle("Emoji Follows Mouse");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                emojiPosition = e.getPoint();
                repaint(); // Redraw the emoji
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                emojiPosition = e.getPoint();
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 36));
        g.setColor(Color.RED);

        String emoji = "\uD83D\uDE02";
        g.drawString(emoji, emojiPosition.x, emojiPosition.y);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            mouse frame = new mouse();
            frame.setVisible(true);
        });
    }
}
