import java.io.*;
import java.awt.*;
import javax.swing.*;
public class FileCopyingProgressDemo extends JFrame {
    File file;
    FileInputStream source;
    FileOutputStream target;
    JLabel lbMessage;
    JProgressBar fileCopyingProgress;
    public FileCopyingProgressDemo() throws FileNotFoundException {
        super();
        this.setTitle("File Copying Progress Demo");
        this.setLayout(null);
        this.file = new File("source.txt");
        this.source = new FileInputStream(file);
        this.target = new FileOutputStream("target.txt");
        this.fileCopyingProgress = new JProgressBar();
        this.fileCopyingProgress.setValue(0);
        this.fileCopyingProgress.setMinimum(0);
        this.fileCopyingProgress.setMaximum((int)file.length());
        this.fileCopyingProgress.setStringPainted(true);
        this.fileCopyingProgress.setBounds(10, 30, 265, 30);
        this.add(this.fileCopyingProgress);
        this.lbMessage = new JLabel("Copying the content" +  " of source file to target file.", JLabel.CENTER);
        this.lbMessage.setBounds(5, 70, 280, 20);
        this.add(this.lbMessage);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 170);
        this.setVisible(true);
    }
    void copying() {
        try {
            int i = this.fileCopyingProgress.getMinimum(), ch;
            while(i <= this.fileCopyingProgress.getMaximum()) {
                ch = source.read();
                target.write(ch);
                this.fileCopyingProgress.setString("Just start");
                i = i + 1;
                if(i % 20 == 0) {
                    this.fileCopyingProgress.setValue(i);
                }
                Thread.sleep(1);
            }
            this.fileCopyingProgress.setValue(i);
            this.fileCopyingProgress.setString("Finish");
            this.lbMessage.setText("File copying completed.");
        }
        catch(Exception e) { }
    }
    public static void main(String args[]) throws FileNotFoundException {
        (new FileCopyingProgressDemo()).copying();
    }
}
