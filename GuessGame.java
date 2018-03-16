package ornekler2;
import javax.swing.JFrame;
public class GuessGame {
    public static void main(String args[]) throws Exception {
        Go SayiTahmin = new Go();
        SayiTahmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SayiTahmin.setSize(500, 150);
        SayiTahmin.setVisible(true);
    }
}
