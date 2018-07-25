package uygulamalar;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class UygSinav extends JFrame {
	//Girilen 10 adet sayının sıralanmış halini, en küçük ve en büyük sayısını, 
	//ortalamasını ve asallarını gösteren program.
	private JPanel contentPane;
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	public void run() {
	try {
		UygSinav frame = new UygSinav();
		frame.setVisible(true);
			}
	catch (Exception e) {
		e.printStackTrace();
		System.exit(1);
		}
	}
	});
	}
	public UygSinav() {
	ArrayList<Integer> sayilar = new ArrayList<>();
	ArrayList<Integer> asallar = new ArrayList<>();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 150, 100);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	JTextField tf = new JTextField();
	contentPane.add(tf, BorderLayout.NORTH);
	JButton btnSayYaz = new JButton("Sayı Yaz");
	btnSayYaz.addActionListener(new ActionListener() {
	int top = 0;
	int a = 0;
	public void actionPerformed(ActionEvent arg0) {
		sayilar.add(Integer.parseInt(tf.getText()));
		tf.setText(null);
		a++;
		if (a==10) {
			JOptionPane.showMessageDialog(null, ("10 adet sayı alındı."));
			Collections.sort(sayilar);
			for(int i: sayilar)
				top += i;
				JOptionPane.showMessageDialog(null, "Sıralanmış hali:" + sayilar);
				JOptionPane.showMessageDialog(null, "Minimum sayı: " + Collections.min(sayilar));
				JOptionPane.showMessageDialog(null, "Maksimum sayı: " + Collections.max(sayilar));
				JOptionPane.showMessageDialog(null, "Ortalama: " + (top/10));
				for(int n=0; n<=9; n++) {
					int sayac=0;
					for(int j=2; j<sayilar.get(n); j++) {
						if(sayilar.get(n)%j==0)
							sayac++;
						}
					if(sayac==0)
						asallar.add(sayilar.get(n));
				}
				if(asallar.isEmpty())
					JOptionPane.showMessageDialog(null, "Asal sayı yok.");
				else
					JOptionPane.showMessageDialog(null, "Asallar: " + asallar);
				}
			}
		});
		contentPane.add(btnSayYaz, BorderLayout.SOUTH);	
		}
}
