import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
public class GiaoDien extends JFrame {
    private static final long serialVersionUID=1L;
    public GiaoDien(String title)
    {
        setTitle(title);
        JPanel a=new JPanel();
        a.setLayout(new FlowLayout());
        a.setBackground(Color.red);
        JButton b1=new JButton("lên");
        JButton b2=new JButton("xuống");
        JButton b3=new JButton("trái");
        JButton b4=new JButton("phải");
        a.add(b1);
        a.add(b2);
        a.add(b3);
        a.add(b4);
        Container c=getContentPane();
        c.add(a);
    }

    public static void main(String[] args) {
        GiaoDien a=new GiaoDien("demo giao diện");
        a.setSize(400,600);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setLocationRelativeTo(null);
        a.setVisible(true);
    }
}
