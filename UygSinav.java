package uygulamalar;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class UygSinav extends JFrame {
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
	ArrayList<Double> sayilar = new ArrayList<>();
	ArrayList<Double> asallar = new ArrayList<>();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 150, 100);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	JTextField tf = new JTextField();
	contentPane.add(tf, BorderLayout.NORTH);
	JButton btnSayYaz = new JButton("Sayý Yaz");
	btnSayYaz.addActionListener(new ActionListener() {
	int top = 0;
	int a = 0;
	public void actionPerformed(ActionEvent arg0) {
		sayilar.add((double)Integer.parseInt(tf.getText()));
		tf.setText(null);
		a++;
		if (a==10) {
			JOptionPane.showMessageDialog(null, ("10 adet sayý alýndý."));
			Collections.sort(sayilar);
			for(Double i: sayilar)
				top += i;
				JOptionPane.showMessageDialog(null, "Sýralanmýþ hali:" + sayilar);
				JOptionPane.showMessageDialog(null, "Minimum sayý: " + Collections.min(sayilar));
				JOptionPane.showMessageDialog(null, "Maksimum sayý: " + Collections.max(sayilar));
				JOptionPane.showMessageDialog(null, "Ortalama: " + (top/10));
				for(double n: sayilar) {
					for(double d=2; d<=n; d++) {
					if(n%d==0) {
						break;
						}
					asallar.add(n);
					break;
					}
				}
				JOptionPane.showMessageDialog(null, "Asallar: " + asallar);
				}
			}
		
		});
		contentPane.add(btnSayYaz, BorderLayout.SOUTH);	
		}
}