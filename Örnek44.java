package ornekler2;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Örnek44 extends JFrame {
//Her butona basıldığında 50 üstü sol tarafa atan, 50 altı sağ tarafa atan, 50'de ise mesaj gösteren program
//Sayı rastgele 100'e kadar atılıyor.
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Örnek44 frame = new Örnek44();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Örnek44() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		List list = new List();
		contentPane.add(list, BorderLayout.WEST);
		
		List list_1 = new List();
		contentPane.add(list_1, BorderLayout.EAST);
		
		JButton btnSayYaz = new JButton("Sayı Yaz");
		btnSayYaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rast = new Random();
				int a = rast.nextInt(100);
				if(a<50)
				{
					list_1.add(Integer.toString(a));
				}
				else if(a>50)
				{
					list.add(Integer.toString(a));
				}
				else if (a==50)
				{
					JOptionPane.showMessageDialog(null, "Sayı 50");
				}
			}
		});
		contentPane.add(btnSayYaz, BorderLayout.NORTH);
		
	}
}
