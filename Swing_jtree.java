import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Swing_jtree extends JFrame {
    public JLabel jLabel;

    public Swing_jtree() {
        JFrame jFrame = new JFrame();

        jLabel = new JLabel(" Path ");
        jLabel.setBounds(20, 330, 370, 30);
        jFrame.add(jLabel);



        DefaultMutableTreeNode rootnode = new DefaultMutableTreeNode("Hard Disk");

        DefaultMutableTreeNode A = new DefaultMutableTreeNode("C Drive");
        DefaultMutableTreeNode B = new DefaultMutableTreeNode("D Drive");
        DefaultMutableTreeNode C = new DefaultMutableTreeNode("E Drive");

        DefaultMutableTreeNode A1 = new DefaultMutableTreeNode("xammp");
        DefaultMutableTreeNode A2 = new DefaultMutableTreeNode("Oracle");
        DefaultMutableTreeNode A3 = new DefaultMutableTreeNode(" Vs Code");
        DefaultMutableTreeNode A4 = new DefaultMutableTreeNode("Net beans");
        DefaultMutableTreeNode A5 = new DefaultMutableTreeNode("Intellij idea");
        DefaultMutableTreeNode A6 = new DefaultMutableTreeNode("Pycharm");

        DefaultMutableTreeNode B1 = new DefaultMutableTreeNode("JavaProgramming");
        DefaultMutableTreeNode B2 = new DefaultMutableTreeNode("Python programng");

        DefaultMutableTreeNode C1 = new DefaultMutableTreeNode("Vidos");
        DefaultMutableTreeNode C2 = new DefaultMutableTreeNode("Photo");

        DefaultMutableTreeNode C3 = new DefaultMutableTreeNode("Aayan Photo");
        DefaultMutableTreeNode C4 = new DefaultMutableTreeNode("Sharad Photo");


        A.add(A1);
        A.add(A2);
        A.add(A3);
        A.add(A4);
        A.add(A5);
        A.add(A6);

        B.add(B1);
        B.add(B2);

        C.add(C1);
        C.add(C2);

        C2.add(C3);
        C2.add(C4);

        rootnode.add(A);
        rootnode.add(B);
        rootnode.add(C);

        JTree tree = new JTree(rootnode);
        jFrame.add(tree);


        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                TreePath selectedpath = e.getNewLeadSelectionPath();
                if (selectedpath != null);{
                    StringBuilder pathText = new StringBuilder("Selected Node Path");
                    for (Object node : selectedpath.getPath()){
                        pathText.append(node.toString()).append(":/");
                    }
                    pathText.delete(pathText.length() -3, pathText.length());
                    jLabel.setText(pathText.toString());
                }

            }

        });


        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
   Swing_jtree obh = new Swing_jtree();



    }
}