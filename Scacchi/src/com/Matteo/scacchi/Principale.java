package com.Matteo.scacchi;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

public class Principale {

	private JFrame display;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principale window = new Principale();
					window.display.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principale() {
		initialize();
	}

	private void initialize() {
		display = new JFrame();
		display.getContentPane().setBackground(new Color(75, 0, 0));
		display.setTitle("Scacchi");
		display.setBounds(100, 100, 1250, 650);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.getContentPane().setLayout(null);
		display.setLocationRelativeTo(null);

		Action a = new Action();
		Move m = new Move();

// *°*°*°*°*°*°*°*°*°*°*° PANNELLI NUMERO 1 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*
		JPanel panel_1A = new JPanel();
		panel_1A.setBounds(49, 43, 70, 70);
		panel_1A.setBorder(new MatteBorder(4, 4, 0, 0, new Color(150, 212, 212)));

		JLabel lbl_1A = new JLabel("");
		a.colorLabel1(lbl_1A, panel_1A);

		JPanel panel_1B = new JPanel();
		panel_1B.setBounds(119, 43, 70, 70);
		panel_1B.setBorder(new MatteBorder(4, 0, 0, 0, new Color(150, 212, 212)));

		JLabel lbl_1B = new JLabel("");
		a.colorLabel2(lbl_1B, panel_1B);

		JPanel panel_1C = new JPanel();
		panel_1C.setBounds(189, 43, 70, 70);
		panel_1C.setBorder(new MatteBorder(4, 0, 0, 0, new Color(150, 212, 212)));

		JLabel lbl_1C = new JLabel("");
		a.colorLabel1(lbl_1C, panel_1C);

		JPanel panel_1D = new JPanel();
		panel_1D.setBounds(259, 43, 70, 70);
		panel_1D.setBorder(new MatteBorder(4, 0, 0, 0, new Color(150, 212, 212)));

		JLabel lbl_1D = new JLabel("");
		a.colorLabel2(lbl_1D, panel_1D);

		JPanel panel_1E = new JPanel();
		panel_1E.setBounds(329, 43, 70, 70);
		panel_1E.setBorder(new MatteBorder(4, 0, 0, 0, new Color(150, 212, 212)));

		JLabel lbl_1E = new JLabel("");
		a.colorLabel1(lbl_1E, panel_1E);

		JPanel panel_1F = new JPanel();
		panel_1F.setBounds(399, 43, 70, 70);
		panel_1F.setBorder(new MatteBorder(4, 0, 0, 0, new Color(150, 212, 212)));

		JLabel lbl_1F = new JLabel("");
		a.colorLabel2(lbl_1F, panel_1F);

		JPanel panel_1G = new JPanel();
		panel_1G.setBounds(469, 43, 70, 70);
		panel_1G.setBorder(new MatteBorder(4, 0, 0, 0, new Color(150, 212, 212)));

		JLabel lbl_1G = new JLabel("");
		a.colorLabel1(lbl_1G, panel_1G);

		JPanel panel_1H = new JPanel();
		panel_1H.setBounds(539, 43, 70, 70);
		panel_1H.setBorder(new MatteBorder(4, 0, 0, 4, new Color(150, 212, 212)));

		JLabel lbl_1H = new JLabel("");
		a.colorLabel2(lbl_1H, panel_1H);
// *°*°*°*°*°*°*°*°*°*°*° FINE PANNELLI NUMERO 1 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*

// *°*°*°*°*°*°*°*°*°*°*° PANNELLI NUMERO 2 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°
		JPanel panel_2A = new JPanel();
		panel_2A.setBounds(49, 113, 70, 70);
		panel_2A.setBorder(new MatteBorder(0, 4, 0, 0, new Color(150, 212, 212)));

		JLabel lbl_2A = new JLabel("");
		a.colorLabel2(lbl_2A, panel_2A);

		JPanel panel_2B = new JPanel();
		panel_2B.setBounds(119, 113, 70, 70);

		JLabel lbl_2B = new JLabel("");
		a.colorLabel1(lbl_2B, panel_2B);

		JPanel panel_2C = new JPanel();
		panel_2C.setBounds(189, 113, 70, 70);

		JLabel lbl_2C = new JLabel("");
		a.colorLabel2(lbl_2C, panel_2C);

		JPanel panel_2D = new JPanel();
		panel_2D.setBounds(259, 113, 70, 70);

		JLabel lbl_2D = new JLabel("");
		a.colorLabel1(lbl_2D, panel_2D);

		JPanel panel_2E = new JPanel();
		panel_2E.setBounds(329, 113, 70, 70);

		JLabel lbl_2E = new JLabel("");
		a.colorLabel2(lbl_2E, panel_2E);

		JPanel panel_2F = new JPanel();
		panel_2F.setBounds(399, 113, 70, 70);

		JLabel lbl_2F = new JLabel("");
		a.colorLabel1(lbl_2F, panel_2F);

		JPanel panel_2G = new JPanel();
		panel_2G.setBounds(469, 113, 70, 70);

		JLabel lbl_2G = new JLabel("");
		a.colorLabel2(lbl_2G, panel_2G);

		JPanel panel_2H = new JPanel();
		panel_2H.setBounds(539, 113, 70, 70);
		panel_2H.setBorder(new MatteBorder(0, 0, 0, 4, new Color(150, 212, 212)));

		JLabel lbl_2H = new JLabel("");
		a.colorLabel1(lbl_2H, panel_2H);
// *°*°*°*°*°*°*°*°*°*°*° FINE PANNELLI NUMERO 2 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*

// *°*°*°*°*°*°*°*°*°*°*° PANNELLI NUMERO 3 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°
		JPanel panel_3A = new JPanel();
		panel_3A.setBounds(49, 183, 70, 70);
		panel_3A.setBorder(new MatteBorder(0, 4, 0, 0, new Color(150, 212, 212)));

		JLabel lbl_3A = new JLabel("");
		a.colorLabel1(lbl_3A, panel_3A);

		JPanel panel_3B = new JPanel();
		panel_3B.setBounds(119, 183, 70, 70);

		JLabel lbl_3B = new JLabel("");
		a.colorLabel2(lbl_3B, panel_3B);

		JPanel panel_3C = new JPanel();
		panel_3C.setBounds(189, 183, 70, 70);

		JLabel lbl_3C = new JLabel("");
		a.colorLabel1(lbl_3C, panel_3C);

		JPanel panel_3D = new JPanel();
		panel_3D.setBounds(259, 183, 70, 70);

		JLabel lbl_3D = new JLabel("");
		a.colorLabel2(lbl_3D, panel_3D);

		JPanel panel_3E = new JPanel();
		panel_3E.setBounds(329, 183, 70, 70);

		JLabel lbl_3E = new JLabel("");
		a.colorLabel1(lbl_3E, panel_3E);

		JPanel panel_3F = new JPanel();
		panel_3F.setBounds(399, 183, 70, 70);

		JLabel lbl_3F = new JLabel("");
		a.colorLabel2(lbl_3F, panel_3F);

		JPanel panel_3G = new JPanel();
		panel_3G.setBounds(469, 183, 70, 70);

		JLabel lbl_3G = new JLabel("");
		a.colorLabel1(lbl_3G, panel_3G);

		JPanel panel_3H = new JPanel();
		panel_3H.setBounds(539, 183, 70, 70);
		panel_3H.setBorder(new MatteBorder(0, 0, 0, 4, new Color(150, 212, 212)));

		JLabel lbl_3H = new JLabel("");
		a.colorLabel2(lbl_3H, panel_3H);
// *°*°*°*°*°*°*°*°*°*°*° FINE PANNELLI NUMERO 3 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*

// *°*°*°*°*°*°*°*°*°*°*° PANNELLI NUMERO 4 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°
		JPanel panel_4A = new JPanel();
		panel_4A.setBounds(49, 253, 70, 70);
		panel_4A.setBorder(new MatteBorder(0, 4, 0, 0, new Color(150, 212, 212)));

		JLabel lbl_4A = new JLabel("");
		a.colorLabel2(lbl_4A, panel_4A);

		JPanel panel_4B = new JPanel();
		panel_4B.setBounds(119, 253, 70, 70);

		JLabel lbl_4B = new JLabel("");
		a.colorLabel1(lbl_4B, panel_4B);

		JPanel panel_4C = new JPanel();
		panel_4C.setBounds(189, 253, 70, 70);

		JLabel lbl_4C = new JLabel("");
		a.colorLabel2(lbl_4C, panel_4C);

		JPanel panel_4D = new JPanel();
		panel_4D.setBounds(259, 253, 70, 70);

		JLabel lbl_4D = new JLabel("");
		a.colorLabel1(lbl_4D, panel_4D);

		JPanel panel_4E = new JPanel();
		panel_4E.setBounds(329, 253, 70, 70);

		JLabel lbl_4E = new JLabel("");
		a.colorLabel2(lbl_4E, panel_4E);

		JPanel panel_4F = new JPanel();
		panel_4F.setBounds(399, 253, 70, 70);

		JLabel lbl_4F = new JLabel("");
		a.colorLabel1(lbl_4F, panel_4F);

		JPanel panel_4G = new JPanel();
		panel_4G.setBounds(469, 253, 70, 70);

		JLabel lbl_4G = new JLabel("");
		a.colorLabel2(lbl_4G, panel_4G);

		JPanel panel_4H = new JPanel();
		panel_4H.setBounds(539, 253, 70, 70);
		panel_4H.setBorder(new MatteBorder(0, 0, 0, 4, new Color(150, 212, 212)));

		JLabel lbl_4H = new JLabel("");
		a.colorLabel1(lbl_4H, panel_4H);
// *°*°*°*°*°*°*°*°*°*°*° FINE PANNELLI NUMERO 4 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*

// *°*°*°*°*°*°*°*°*°*°*° PANNELLI NUMERO 5 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°
		JPanel panel_5A = new JPanel();
		panel_5A.setBounds(49, 323, 70, 70);
		panel_5A.setBorder(new MatteBorder(0, 4, 0, 0, new Color(150, 212, 212)));

		JLabel lbl_5A = new JLabel("");
		a.colorLabel1(lbl_5A, panel_5A);

		JPanel panel_5B = new JPanel();
		panel_5B.setBounds(119, 323, 70, 70);

		JLabel lbl_5B = new JLabel("");
		a.colorLabel2(lbl_5B, panel_5B);

		JPanel panel_5C = new JPanel();
		panel_5C.setBounds(189, 323, 70, 70);

		JLabel lbl_5C = new JLabel("");
		a.colorLabel1(lbl_5C, panel_5C);

		JPanel panel_5D = new JPanel();
		panel_5D.setBounds(259, 323, 70, 70);

		JLabel lbl_5D = new JLabel("");
		a.colorLabel2(lbl_5D, panel_5D);

		JPanel panel_5E = new JPanel();
		panel_5E.setBounds(329, 323, 70, 70);

		JLabel lbl_5E = new JLabel("");
		a.colorLabel1(lbl_5E, panel_5E);

		JPanel panel_5F = new JPanel();
		panel_5F.setBounds(399, 323, 70, 70);

		JLabel lbl_5F = new JLabel("");
		a.colorLabel2(lbl_5F, panel_5F);

		JPanel panel_5G = new JPanel();
		panel_5G.setBounds(469, 323, 70, 70);

		JLabel lbl_5G = new JLabel("");
		a.colorLabel1(lbl_5G, panel_5G);

		JPanel panel_5H = new JPanel();
		panel_5H.setBounds(539, 323, 70, 70);
		panel_5H.setBorder(new MatteBorder(0, 0, 0, 4, new Color(150, 212, 212)));

		JLabel lbl_5H = new JLabel("");
		a.colorLabel2(lbl_5H, panel_5H);
// *°*°*°*°*°*°*°*°*°*°*° FINE PANNELLI NUMERO 5 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*

// *°*°*°*°*°*°*°*°*°*°*° PANNELLI NUMERO 6 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°
		JPanel panel_6A = new JPanel();
		panel_6A.setBounds(49, 393, 70, 70);
		panel_6A.setBorder(new MatteBorder(0, 4, 0, 0, new Color(150, 212, 212)));

		JLabel lbl_6A = new JLabel("");
		a.colorLabel2(lbl_6A, panel_6A);

		JPanel panel_6B = new JPanel();
		panel_6B.setBounds(119, 393, 70, 70);

		JLabel lbl_6B = new JLabel("");
		a.colorLabel1(lbl_6B, panel_6B);

		JPanel panel_6C = new JPanel();
		panel_6C.setBounds(189, 393, 70, 70);

		JLabel lbl_6C = new JLabel("");
		a.colorLabel2(lbl_6C, panel_6C);

		JPanel panel_6D = new JPanel();
		panel_6D.setBounds(259, 393, 70, 70);

		JLabel lbl_6D = new JLabel("");
		a.colorLabel1(lbl_6D, panel_6D);

		JPanel panel_6E = new JPanel();
		panel_6E.setBounds(329, 393, 70, 70);

		JLabel lbl_6E = new JLabel("");
		a.colorLabel2(lbl_6E, panel_6E);

		JPanel panel_6F = new JPanel();
		panel_6F.setBounds(399, 393, 70, 70);

		JLabel lbl_6F = new JLabel("");
		a.colorLabel1(lbl_6F, panel_6F);

		JPanel panel_6G = new JPanel();
		panel_6G.setBounds(469, 393, 70, 70);

		JLabel lbl_6G = new JLabel("");
		a.colorLabel2(lbl_6G, panel_6G);

		JPanel panel_6H = new JPanel();
		panel_6H.setBounds(539, 393, 70, 70);
		panel_6H.setBorder(new MatteBorder(0, 0, 0, 4, new Color(150, 212, 212)));

		JLabel lbl_6H = new JLabel("");
		a.colorLabel1(lbl_6H, panel_6H);
// *°*°*°*°*°*°*°*°*°*°*° FINE PANNELLI NUMERO 6 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*

// *°*°*°*°*°*°*°*°*°*°*° PANNELLI NUMERO 7 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°
		JPanel panel_7A = new JPanel();
		panel_7A.setBounds(49, 463, 70, 70);
		panel_7A.setBorder(new MatteBorder(0, 4, 0, 0, new Color(150, 212, 212)));

		JLabel lbl_7A = new JLabel("");
		a.colorLabel1(lbl_7A, panel_7A);

		JPanel panel_7B = new JPanel();
		panel_7B.setBounds(119, 463, 70, 70);

		JLabel lbl_7B = new JLabel("");
		a.colorLabel2(lbl_7B, panel_7B);

		JPanel panel_7C = new JPanel();
		panel_7C.setBounds(189, 463, 70, 70);

		JLabel lbl_7C = new JLabel("");
		a.colorLabel1(lbl_7C, panel_7C);

		JPanel panel_7D = new JPanel();
		panel_7D.setBounds(259, 463, 70, 70);

		JLabel lbl_7D = new JLabel("");
		a.colorLabel2(lbl_7D, panel_7D);

		JPanel panel_7E = new JPanel();
		panel_7E.setBounds(329, 463, 70, 70);

		JLabel lbl_7E = new JLabel("");
		a.colorLabel1(lbl_7E, panel_7E);

		JPanel panel_7F = new JPanel();
		panel_7F.setBounds(399, 463, 70, 70);

		JLabel lbl_7F = new JLabel("");
		a.colorLabel2(lbl_7F, panel_7F);

		JPanel panel_7G = new JPanel();
		panel_7G.setBounds(469, 463, 70, 70);

		JLabel lbl_7G = new JLabel("");
		a.colorLabel1(lbl_7G, panel_7G);

		JPanel panel_7H = new JPanel();
		panel_7H.setBounds(539, 463, 70, 70);
		panel_7H.setBorder(new MatteBorder(0, 0, 0, 4, new Color(150, 212, 212)));

		JLabel lbl_7H = new JLabel("");
		a.colorLabel2(lbl_7H, panel_7H);
// *°*°*°*°*°*°*°*°*°*°*° FINE PANNELLI NUMERO 7 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*

// *°*°*°*°*°*°*°*°*°*°*° PANNELLI NUMERO 8 *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°		
		JPanel panel_8A = new JPanel();
		panel_8A.setBounds(49, 533, 70, 70);
		panel_8A.setBorder(new MatteBorder(0, 4, 4, 0, new Color(150, 212, 212)));

		JLabel lbl_8A = new JLabel("");
		a.colorLabel2(lbl_8A, panel_8A);

		JPanel panel_8B = new JPanel();
		panel_8B.setBounds(119, 533, 70, 70);
		panel_8B.setBorder(new MatteBorder(0, 0, 4, 0, new Color(150, 212, 212)));

		JLabel lbl_8B = new JLabel("");
		a.colorLabel1(lbl_8B, panel_8B);

		JPanel panel_8C = new JPanel();
		panel_8C.setBounds(189, 533, 70, 70);
		panel_8C.setBorder(new MatteBorder(0, 0, 4, 0, new Color(150, 212, 212)));

		JLabel lbl_8C = new JLabel("");
		a.colorLabel2(lbl_8C, panel_8C);

		JPanel panel_8D = new JPanel();
		panel_8D.setBounds(259, 533, 70, 70);
		panel_8D.setBorder(new MatteBorder(0, 0, 4, 0, new Color(150, 212, 212)));

		JLabel lbl_8D = new JLabel("");
		a.colorLabel1(lbl_8D, panel_8D);

		JPanel panel_8E = new JPanel();
		panel_8E.setBounds(329, 533, 70, 70);
		panel_8E.setBorder(new MatteBorder(0, 0, 4, 0, new Color(150, 212, 212)));

		JLabel lbl_8E = new JLabel("");
		a.colorLabel2(lbl_8E, panel_8E);

		JPanel panel_8F = new JPanel();
		panel_8F.setBounds(399, 533, 70, 70);
		panel_8F.setBorder(new MatteBorder(0, 0, 4, 0, new Color(150, 212, 212)));

		JLabel lbl_8F = new JLabel("");
		a.colorLabel1(lbl_8F, panel_8F);

		JPanel panel_8G = new JPanel();
		panel_8G.setBounds(469, 533, 70, 70);
		panel_8G.setBorder(new MatteBorder(0, 0, 4, 0, new Color(150, 212, 212)));

		JLabel lbl_8G = new JLabel("");
		a.colorLabel2(lbl_8G, panel_8G);

		JPanel panel_8H = new JPanel();
		panel_8H.setBounds(539, 533, 70, 70);
		panel_8H.setBorder(new MatteBorder(0, 0, 4, 4, new Color(150, 212, 212)));

		JLabel lbl_8H = new JLabel("");
		a.colorLabel1(lbl_8H, panel_8H);
// *°*°*°*°*°*°*°*°*°*°*°* FINE LABEL PANNELLI *°*°*°*°*°*°*°*°*°*°*°*°*

// *°*°*°*°*°*°*°*°*°*°* AZIONI PANNELLI *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*
		a.mouse1(panel_1A, display);
		a.mouse2(panel_1B, display);
		a.mouse1(panel_1C, display);
		a.mouse2(panel_1D, display);
		a.mouse1(panel_1E, display);
		a.mouse2(panel_1F, display);
		a.mouse1(panel_1G, display);
		a.mouse2(panel_1H, display);

		a.mouse2(panel_2A, display);
		a.mouse1(panel_2B, display);
		a.mouse2(panel_2C, display);
		a.mouse1(panel_2D, display);
		a.mouse2(panel_2E, display);
		a.mouse1(panel_2F, display);
		a.mouse2(panel_2G, display);
		a.mouse1(panel_2H, display);

		a.mouse1(panel_3A, display);
		a.mouse2(panel_3B, display);
		a.mouse1(panel_3C, display);
		a.mouse2(panel_3D, display);
		a.mouse1(panel_3E, display);
		a.mouse2(panel_3F, display);
		a.mouse1(panel_3G, display);
		a.mouse2(panel_3H, display);

		a.mouse2(panel_4A, display);
		a.mouse1(panel_4B, display);
		a.mouse2(panel_4C, display);
		a.mouse1(panel_4D, display);
		a.mouse2(panel_4E, display);
		a.mouse1(panel_4F, display);
		a.mouse2(panel_4G, display);
		a.mouse1(panel_4H, display);

		a.mouse1(panel_5A, display);
		a.mouse2(panel_5B, display);
		a.mouse1(panel_5C, display);
		a.mouse2(panel_5D, display);
		a.mouse1(panel_5E, display);
		a.mouse2(panel_5F, display);
		a.mouse1(panel_5G, display);
		a.mouse2(panel_5H, display);

		a.mouse2(panel_6A, display);
		a.mouse1(panel_6B, display);
		a.mouse2(panel_6C, display);
		a.mouse1(panel_6D, display);
		a.mouse2(panel_6E, display);
		a.mouse1(panel_6F, display);
		a.mouse2(panel_6G, display);
		a.mouse1(panel_6H, display);

		a.mouse1(panel_7A, display);
		a.mouse2(panel_7B, display);
		a.mouse1(panel_7C, display);
		a.mouse2(panel_7D, display);
		a.mouse1(panel_7E, display);
		a.mouse2(panel_7F, display);
		a.mouse1(panel_7G, display);
		a.mouse2(panel_7H, display);

		a.mouse2(panel_8A, display);
		a.mouse1(panel_8B, display);
		a.mouse2(panel_8C, display);
		a.mouse1(panel_8D, display);
		a.mouse2(panel_8E, display);
		a.mouse1(panel_8F, display);
		a.mouse2(panel_8G, display);
		a.mouse1(panel_8H, display);
// *°*°*°*°*°*°*°*°*°*°* FINE AZIONI PANNELLI *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*

// *°*°*°*°*°*°*°*°*°*°*°*° INIZIO MANGIATI *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*
		JPanel mangiati_1_B = new JPanel();
		a.bodyMangiati(display, mangiati_1_B);
		mangiati_1_B.setBounds(645, 78, 70, 70);

		JLabel lbl_Mangiati_1_B = new JLabel("");
		a.labelMangiati(mangiati_1_B, lbl_Mangiati_1_B);

		JPanel mangiati_2_B = new JPanel();
		a.bodyMangiati(display, mangiati_2_B);
		mangiati_2_B.setBounds(720, 78, 70, 70);

		JLabel lbl_Mangiati_2_B = new JLabel("");
		a.labelMangiati(mangiati_2_B, lbl_Mangiati_2_B);

		JPanel mangiati_3_B = new JPanel();
		a.bodyMangiati(display, mangiati_3_B);
		mangiati_3_B.setBounds(795, 78, 70, 70);

		JLabel lbl_Mangiati_3_B = new JLabel("");
		a.labelMangiati(mangiati_3_B, lbl_Mangiati_3_B);

		JPanel mangiati_4_B = new JPanel();
		a.bodyMangiati(display, mangiati_4_B);
		mangiati_4_B.setBounds(870, 78, 70, 70);

		JLabel lbl_Mangiati_4_B = new JLabel("");
		a.labelMangiati(mangiati_4_B, lbl_Mangiati_4_B);

		JPanel mangiati_5_B = new JPanel();
		a.bodyMangiati(display, mangiati_5_B);
		mangiati_5_B.setBounds(945, 78, 70, 70);

		JLabel lbl_Mangiati_5_B = new JLabel("");
		a.labelMangiati(mangiati_5_B, lbl_Mangiati_5_B);

		JPanel mangiati_6_B = new JPanel();
		a.bodyMangiati(display, mangiati_6_B);
		mangiati_6_B.setBounds(1020, 78, 70, 70);

		JLabel lbl_Mangiati_6_B = new JLabel("");
		a.labelMangiati(mangiati_6_B, lbl_Mangiati_6_B);

		JPanel mangiati_7_B = new JPanel();
		a.bodyMangiati(display, mangiati_7_B);
		mangiati_7_B.setBounds(1095, 78, 70, 70);

		JLabel lbl_Mangiati_7_B = new JLabel("");
		a.labelMangiati(mangiati_7_B, lbl_Mangiati_7_B);

		JPanel mangiati_8_B = new JPanel();
		a.bodyMangiati(display, mangiati_8_B);
		mangiati_8_B.setBounds(1170, 78, 70, 70);

		JLabel lbl_Mangiati_8_B = new JLabel("");
		a.labelMangiati(mangiati_8_B, lbl_Mangiati_8_B);

		JPanel mangiati_9_B = new JPanel();
		a.bodyMangiati(display, mangiati_9_B);
		mangiati_9_B.setBounds(645, 153, 70, 70);

		JLabel lbl_Mangiati_9_B = new JLabel("");
		a.labelMangiati(mangiati_9_B, lbl_Mangiati_9_B);

		JPanel mangiati_10_B = new JPanel();
		a.bodyMangiati(display, mangiati_10_B);
		mangiati_10_B.setBounds(720, 153, 70, 70);

		JLabel lbl_Mangiati_10_B = new JLabel("");
		a.labelMangiati(mangiati_10_B, lbl_Mangiati_10_B);

		JPanel mangiati_11_B = new JPanel();
		a.bodyMangiati(display, mangiati_11_B);
		mangiati_11_B.setBounds(795, 153, 70, 70);

		JLabel lbl_Mangiati_11_B = new JLabel("");
		a.labelMangiati(mangiati_11_B, lbl_Mangiati_11_B);

		JPanel mangiati_12_B = new JPanel();
		a.bodyMangiati(display, mangiati_12_B);
		mangiati_12_B.setBounds(870, 153, 70, 70);

		JLabel lbl_Mangiati_12_B = new JLabel("");
		a.labelMangiati(mangiati_12_B, lbl_Mangiati_12_B);

		JPanel mangiati_13_B = new JPanel();
		a.bodyMangiati(display, mangiati_13_B);
		mangiati_13_B.setBounds(945, 153, 70, 70);

		JLabel lbl_Mangiati_13_B = new JLabel("");
		a.labelMangiati(mangiati_13_B, lbl_Mangiati_13_B);

		JPanel mangiati_14_B = new JPanel();
		a.bodyMangiati(display, mangiati_14_B);
		mangiati_14_B.setBounds(1020, 153, 70, 70);

		JLabel lbl_Mangiati_14_B = new JLabel("");
		a.labelMangiati(mangiati_14_B, lbl_Mangiati_14_B);

		JPanel mangiati_15_B = new JPanel();
		a.bodyMangiati(display, mangiati_15_B);
		mangiati_15_B.setBounds(1095, 153, 70, 70);

		JLabel lbl_Mangiati_15_B = new JLabel("");
		a.labelMangiati(mangiati_15_B, lbl_Mangiati_15_B);

		JPanel mangiati_16_B = new JPanel();
		a.bodyMangiati(display, mangiati_16_B);
		mangiati_16_B.setBounds(1170, 153, 70, 70);

		JLabel lbl_Mangiati_16_B = new JLabel("");
		a.labelMangiati(mangiati_16_B, lbl_Mangiati_16_B);

		JPanel mangiati_1_R = new JPanel();
		a.bodyMangiati(display, mangiati_1_R);
		mangiati_1_R.setBounds(645, 458, 70, 70);

		JLabel lbl_Mangiati_1_R = new JLabel("");
		a.labelMangiati(mangiati_1_R, lbl_Mangiati_1_R);

		JPanel mangiati_2_R = new JPanel();
		a.bodyMangiati(display, mangiati_2_R);
		mangiati_2_R.setBounds(720, 458, 70, 70);

		JLabel lbl_Mangiati_2_R = new JLabel("");
		a.labelMangiati(mangiati_2_R, lbl_Mangiati_2_R);

		JPanel mangiati_3_R = new JPanel();
		a.bodyMangiati(display, mangiati_3_R);
		mangiati_3_R.setBounds(795, 458, 70, 70);

		JLabel lbl_Mangiati_3_R = new JLabel("");
		a.labelMangiati(mangiati_3_R, lbl_Mangiati_3_R);

		JPanel mangiati_4_R = new JPanel();
		a.bodyMangiati(display, mangiati_4_R);
		mangiati_4_R.setBounds(870, 458, 70, 70);

		JLabel lbl_Mangiati_4_R = new JLabel("");
		a.labelMangiati(mangiati_4_R, lbl_Mangiati_4_R);

		JPanel mangiati_5_R = new JPanel();
		a.bodyMangiati(display, mangiati_5_R);
		mangiati_5_R.setBounds(945, 458, 70, 70);

		JLabel lbl_Mangiati_5_R = new JLabel("");
		a.labelMangiati(mangiati_5_R, lbl_Mangiati_5_R);

		JPanel mangiati_6_R = new JPanel();
		a.bodyMangiati(display, mangiati_6_R);
		mangiati_6_R.setBounds(1020, 458, 70, 70);

		JLabel lbl_Mangiati_6_R = new JLabel("");
		a.labelMangiati(mangiati_6_R, lbl_Mangiati_6_R);

		JPanel mangiati_7_R = new JPanel();
		a.bodyMangiati(display, mangiati_7_R);
		mangiati_7_R.setBounds(1095, 458, 70, 70);

		JLabel lbl_Mangiati_7_R = new JLabel("");
		a.labelMangiati(mangiati_7_R, lbl_Mangiati_7_R);

		JPanel mangiati_8_R = new JPanel();
		a.bodyMangiati(display, mangiati_8_R);
		mangiati_8_R.setBounds(1170, 458, 70, 70);

		JLabel lbl_Mangiati_8_R = new JLabel("");
		a.labelMangiati(mangiati_8_R, lbl_Mangiati_8_R);

		JPanel mangiati_9_R = new JPanel();
		a.bodyMangiati(display, mangiati_9_R);
		mangiati_9_R.setBounds(645, 533, 70, 70);

		JLabel lbl_Mangiati_9_R = new JLabel("");
		a.labelMangiati(mangiati_9_R, lbl_Mangiati_9_R);

		JPanel mangiati_10_R = new JPanel();
		a.bodyMangiati(display, mangiati_10_R);
		mangiati_10_R.setBounds(720, 533, 70, 70);

		JLabel lbl_Mangiati_10_R = new JLabel("");
		a.labelMangiati(mangiati_10_R, lbl_Mangiati_10_R);

		JPanel mangiati_11_R = new JPanel();
		a.bodyMangiati(display, mangiati_11_R);
		mangiati_11_R.setBounds(795, 533, 70, 70);

		JLabel lbl_Mangiati_11_R = new JLabel("");
		a.labelMangiati(mangiati_11_R, lbl_Mangiati_11_R);

		JPanel mangiati_12_R = new JPanel();
		a.bodyMangiati(display, mangiati_12_R);
		mangiati_12_R.setBounds(870, 533, 70, 70);

		JLabel lbl_Mangiati_12_R = new JLabel("");
		a.labelMangiati(mangiati_12_R, lbl_Mangiati_12_R);

		JPanel mangiati_13_R = new JPanel();
		a.bodyMangiati(display, mangiati_13_R);
		mangiati_13_R.setBounds(945, 533, 70, 70);

		JLabel lbl_Mangiati_13_R = new JLabel("");
		a.labelMangiati(mangiati_13_R, lbl_Mangiati_13_R);

		JPanel mangiati_14_R = new JPanel();
		a.bodyMangiati(display, mangiati_14_R);
		mangiati_14_R.setBounds(1020, 533, 70, 70);

		JLabel lbl_Mangiati_14_R = new JLabel("");
		a.labelMangiati(mangiati_14_R, lbl_Mangiati_14_R);

		JPanel mangiati_15_R = new JPanel();
		a.bodyMangiati(display, mangiati_15_R);
		mangiati_15_R.setBounds(1095, 533, 70, 70);

		JLabel lbl_Mangiati_15_R = new JLabel("");
		a.labelMangiati(mangiati_15_R, lbl_Mangiati_15_R);

		JPanel mangiati_16_R = new JPanel();
		a.bodyMangiati(display, mangiati_16_R);
		mangiati_16_R.setBounds(1170, 533, 70, 70);

		JLabel lbl_Mangiati_16_R = new JLabel("");
		a.labelMangiati(mangiati_16_R, lbl_Mangiati_16_R);
		
		JLabel lblTitolo = new JLabel("Gioco degli scacchi");
		a.bodyTitle(lblTitolo, display);
		
// *°*°*°*°*°*°*°*°*°*°*°*° FINE MANGIATI *°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*

		m.selectionMove(display, lbl_1A, panel_1A, 
				lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, 
				lbl_Mangiati_9_B, lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, 
				lbl_Mangiati_13_B, lbl_Mangiati_14_B, lbl_Mangiati_15_B, lbl_Mangiati_16_B, 
				lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R, lbl_Mangiati_4_R, 
				lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, 
				lbl_Mangiati_13_R, lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_1B, panel_1B, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R,
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_1C, panel_1C, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_1D, panel_1D, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_1E, panel_1E, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_1F, panel_1F, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_1G, panel_1G, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_1H, panel_1H, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);

		m.selectionMove(display, lbl_2A, panel_2A, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_2B, panel_2B, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_2C, panel_2C, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_2D, panel_2D, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_2E, panel_2E, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_2F, panel_2F, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_2G, panel_2G, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_2H, panel_2H, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);

		m.selectionMove(display, lbl_3A, panel_3A, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_3B, panel_3B, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_3C, panel_3C, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_3D, panel_3D, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_3E, panel_3E, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_3F, panel_3F, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_3G, panel_3G, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_3H, panel_3H, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);

		m.selectionMove(display, lbl_4A, panel_4A, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_4B, panel_4B, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_4C, panel_4C, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_4D, panel_4D, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_4E, panel_4E, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_4F, panel_4F, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_4G, panel_4G, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_4H, panel_4H, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);

		m.selectionMove(display, lbl_5A, panel_5A, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_5B, panel_5B, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_5C, panel_5C, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_5D, panel_5D, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_5E, panel_5E, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_5F, panel_5F, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_5G, panel_5G, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_5H, panel_5H, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);

		m.selectionMove(display, lbl_6A, panel_6A, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_6B, panel_6B, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_6C, panel_6C, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_6D, panel_6D, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_6E, panel_6E, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_6F, panel_6F, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_6G, panel_6G, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_6H, panel_6H, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);

		m.selectionMove(display, lbl_7A, panel_7A, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_7B, panel_7B, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_7C, panel_7C, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_7D, panel_7D, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_7E, panel_7E, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_7F, panel_7F, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_7G, panel_7G, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_7H, panel_7H, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);

		m.selectionMove(display, lbl_8A, panel_8A, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_8B, panel_8B, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_8C, panel_8C, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_8D, panel_8D, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_8E, panel_8E, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_8F, panel_8F, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_8G, panel_8G, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);
		m.selectionMove(display, lbl_8H, panel_8H, lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B,
				lbl_Mangiati_5_B, lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B,
				lbl_Mangiati_10_B, lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B,
				lbl_Mangiati_15_B, lbl_Mangiati_16_B, lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R,
				lbl_Mangiati_4_R, lbl_Mangiati_5_R, lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R,
				lbl_Mangiati_9_R, lbl_Mangiati_10_R, lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R,
				lbl_Mangiati_14_R, lbl_Mangiati_15_R, lbl_Mangiati_16_R, 
				lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H,
				lbl_2A, lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H,
				lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G, lbl_3H,
				lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H,
				lbl_5A, lbl_5B, lbl_5C, lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H,
				lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H,
				lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F, lbl_8G, lbl_8H, lblTitolo);

		// ELEMENTI VARI NON IMPORTANTI *************************************
		JLabel lblA = new JLabel("A");
		lblA.setBounds(49, 15, 70, 25);
		a.bodyLabel(display, lblA);

		JLabel lblB = new JLabel("B");
		lblB.setBounds(119, 15, 70, 25);
		a.bodyLabel(display, lblB);

		JLabel lblC = new JLabel("C");
		lblC.setBounds(189, 15, 70, 25);
		a.bodyLabel(display, lblC);

		JLabel lblD = new JLabel("D");
		lblD.setBounds(259, 15, 70, 25);
		a.bodyLabel(display, lblD);

		JLabel lblE = new JLabel("E");
		lblE.setBounds(329, 15, 70, 25);
		a.bodyLabel(display, lblE);

		JLabel lblF = new JLabel("F");
		lblF.setBounds(399, 15, 70, 25);
		a.bodyLabel(display, lblF);

		JLabel lblG = new JLabel("G");
		lblG.setBounds(469, 15, 70, 25);
		a.bodyLabel(display, lblG);

		JLabel lblH = new JLabel("H");
		lblH.setBounds(539, 15, 70, 25);
		a.bodyLabel(display, lblH);

		JLabel lbl1 = new JLabel("1");
		lbl1.setBounds(12, 43, 37, 70);
		a.bodyLabel(display, lbl1);

		JLabel lbl2 = new JLabel("2");
		lbl2.setBounds(12, 113, 37, 70);
		a.bodyLabel(display, lbl2);

		JLabel lbl3 = new JLabel("3");
		lbl3.setBounds(12, 183, 37, 70);
		a.bodyLabel(display, lbl3);

		JLabel lbl4 = new JLabel("4");
		lbl4.setBounds(12, 253, 37, 70);
		a.bodyLabel(display, lbl4);

		JLabel lbl5 = new JLabel("5");
		lbl5.setBounds(12, 323, 37, 70);
		a.bodyLabel(display, lbl5);

		JLabel lbl6 = new JLabel("6");
		lbl6.setBounds(12, 393, 37, 70);
		a.bodyLabel(display, lbl6);

		JLabel lbl7 = new JLabel("7");
		lbl7.setBounds(12, 463, 37, 70);
		a.bodyLabel(display, lbl7);

		JLabel lbl8 = new JLabel("8");
		lbl8.setBounds(12, 533, 37, 70);
		a.bodyLabel(display, lbl8);

		JLabel lblNewGame = new JLabel("New Game");
		a.bodyNewGame(lblNewGame, display, lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H, lbl_2A,
				lbl_2B, lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H, lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F,
				lbl_3G, lbl_3H, lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H, lbl_5A, lbl_5B, lbl_5C,
				lbl_5D, lbl_5E, lbl_5F, lbl_5G, lbl_5H, lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H,
				lbl_7A, lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H, lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E,
				lbl_8F, lbl_8G, lbl_8H,

				lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B, lbl_Mangiati_5_B,
				lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B, lbl_Mangiati_10_B,
				lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B, lbl_Mangiati_15_B,
				lbl_Mangiati_16_B,

				lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R, lbl_Mangiati_4_R, lbl_Mangiati_5_R,
				lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R, lbl_Mangiati_9_R, lbl_Mangiati_10_R,
				lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R, lbl_Mangiati_14_R, lbl_Mangiati_15_R,
				lbl_Mangiati_16_R, lblTitolo);

		JLabel lblCancel = new JLabel("Cancel");
		a.bodyCancel(lblCancel, display, lbl_1A, lbl_1B, lbl_1C, lbl_1D, lbl_1E, lbl_1F, lbl_1G, lbl_1H, lbl_2A, lbl_2B,
				lbl_2C, lbl_2D, lbl_2E, lbl_2F, lbl_2G, lbl_2H, lbl_3A, lbl_3B, lbl_3C, lbl_3D, lbl_3E, lbl_3F, lbl_3G,
				lbl_3H, lbl_4A, lbl_4B, lbl_4C, lbl_4D, lbl_4E, lbl_4F, lbl_4G, lbl_4H, lbl_5A, lbl_5B, lbl_5C, lbl_5D,
				lbl_5E, lbl_5F, lbl_5G, lbl_5H, lbl_6A, lbl_6B, lbl_6C, lbl_6D, lbl_6E, lbl_6F, lbl_6G, lbl_6H, lbl_7A,
				lbl_7B, lbl_7C, lbl_7D, lbl_7E, lbl_7F, lbl_7G, lbl_7H, lbl_8A, lbl_8B, lbl_8C, lbl_8D, lbl_8E, lbl_8F,
				lbl_8G, lbl_8H,

				lbl_Mangiati_1_B, lbl_Mangiati_2_B, lbl_Mangiati_3_B, lbl_Mangiati_4_B, lbl_Mangiati_5_B,
				lbl_Mangiati_6_B, lbl_Mangiati_7_B, lbl_Mangiati_8_B, lbl_Mangiati_9_B, lbl_Mangiati_10_B,
				lbl_Mangiati_11_B, lbl_Mangiati_12_B, lbl_Mangiati_13_B, lbl_Mangiati_14_B, lbl_Mangiati_15_B,
				lbl_Mangiati_16_B,

				lbl_Mangiati_1_R, lbl_Mangiati_2_R, lbl_Mangiati_3_R, lbl_Mangiati_4_R, lbl_Mangiati_5_R,
				lbl_Mangiati_6_R, lbl_Mangiati_7_R, lbl_Mangiati_8_R, lbl_Mangiati_9_R, lbl_Mangiati_10_R,
				lbl_Mangiati_11_R, lbl_Mangiati_12_R, lbl_Mangiati_13_R, lbl_Mangiati_14_R, lbl_Mangiati_15_R,
				lbl_Mangiati_16_R);
		

	}
	
}
