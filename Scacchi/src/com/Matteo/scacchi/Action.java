package com.Matteo.scacchi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Action {

	public void mouse1(JPanel panel, JFrame display) {
		panel.setBackground(Color.BLACK);
		display.getContentPane().add(panel);
		panel.setLayout(null);
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(new java.awt.Color(70, 70, 70));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(Color.BLACK);
			}
		});
	}

	public void mouse2(JPanel panel, JFrame display) {
		panel.setBackground(Color.WHITE);
		display.getContentPane().add(panel);
		panel.setLayout(null);
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(new java.awt.Color(200, 200, 200));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(Color.WHITE);
			}
		});
	}

	public void bodyLabel(JFrame display, JLabel label) {
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		display.getContentPane().add(label);
	}

	public void colorLabel1(JLabel label, JPanel panel) {
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(6, 6, 58, 58);
		panel.add(label);
		panel.setLayout(null);

		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(new java.awt.Color(70, 70, 70));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(Color.BLACK);
			}
		});
	}

	public void colorLabel2(JLabel label, JPanel panel) {
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(6, 6, 58, 58);
		panel.add(label);
		panel.setLayout(null);

		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(new java.awt.Color(200, 200, 200));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(Color.WHITE);
			}
		});
	}

	public void bodyTitle(JLabel label, JFrame display) {
		label.setBounds(640, 290, 600, 100);
		label.setFont(new Font("Quillain", Font.PLAIN, 85));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		display.getContentPane().add(label);
	}

	public void bodyMangiati(JFrame display, JPanel panel) {
		display.getContentPane().add(panel);
		panel.setLayout(null);
	}

	public void labelMangiati(JPanel panel, JLabel label) {
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(6, 4, 58, 61);
		panel.add(label);
	}

	public void bodyNewGame(JLabel label, JFrame display, JLabel A1, JLabel B1, JLabel C1, JLabel D1, JLabel E1,
			JLabel F1, JLabel G1, JLabel H1, JLabel A2, JLabel B2, JLabel C2, JLabel D2, JLabel E2, JLabel F2,
			JLabel G2, JLabel H2, JLabel A3, JLabel B3, JLabel C3, JLabel D3, JLabel E3, JLabel F3, JLabel G3,
			JLabel H3, JLabel A4, JLabel B4, JLabel C4, JLabel D4, JLabel E4, JLabel F4, JLabel G4, JLabel H4,
			JLabel A5, JLabel B5, JLabel C5, JLabel D5, JLabel E5, JLabel F5, JLabel G5, JLabel H5, JLabel A6,
			JLabel B6, JLabel C6, JLabel D6, JLabel E6, JLabel F6, JLabel G6, JLabel H6, JLabel A7, JLabel B7,
			JLabel C7, JLabel D7, JLabel E7, JLabel F7, JLabel G7, JLabel H7, JLabel A8, JLabel B8, JLabel C8,
			JLabel D8, JLabel E8, JLabel F8, JLabel G8, JLabel H8, JLabel b1, JLabel b2, JLabel b3, JLabel b4,
			JLabel b5, JLabel b6, JLabel b7, JLabel b8, JLabel b9, JLabel b10, JLabel b11, JLabel b12, JLabel b13,
			JLabel b14, JLabel b15, JLabel b16, JLabel r1, JLabel r2, JLabel r3, JLabel r4, JLabel r5, JLabel r6,
			JLabel r7, JLabel r8, JLabel r9, JLabel r10, JLabel r11, JLabel r12, JLabel r13, JLabel r14, JLabel r15,
			JLabel r16, JLabel titolo) {
		label.setBounds(640, 23, 120, 36);
		label.setFont(new Font("Quillain", Font.PLAIN, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		display.getContentPane().add(label);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setForeground(Color.GREEN);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label.setForeground(Color.WHITE);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				LoadImage l = new LoadImage();
				A1.setIcon(l.torreBlu);
				B1.setIcon(l.cavalloBlu);
				C1.setIcon(l.alfiereBlu);
				D1.setIcon(l.reginaBlu);
				E1.setIcon(l.reBlu);
				F1.setIcon(l.alfiereBlu);
				G1.setIcon(l.cavalloBlu);
				H1.setIcon(l.torreBlu);
				A2.setIcon(l.pedoneBlu);
				B2.setIcon(l.pedoneBlu);
				C2.setIcon(l.pedoneBlu);
				D2.setIcon(l.pedoneBlu);
				E2.setIcon(l.pedoneBlu);
				F2.setIcon(l.pedoneBlu);
				G2.setIcon(l.pedoneBlu);
				H2.setIcon(l.pedoneBlu);
				A3.setIcon(null);
				B3.setIcon(null);
				C3.setIcon(null);
				D3.setIcon(null);
				E3.setIcon(null);
				F3.setIcon(null);
				G3.setIcon(null);
				H3.setIcon(null);
				A4.setIcon(null);
				B4.setIcon(null);
				C4.setIcon(null);
				D4.setIcon(null);
				E4.setIcon(null);
				F4.setIcon(null);
				G4.setIcon(null);
				H4.setIcon(null);
				A5.setIcon(null);
				B5.setIcon(null);
				C5.setIcon(null);
				D5.setIcon(null);
				E5.setIcon(null);
				F5.setIcon(null);
				G5.setIcon(null);
				H5.setIcon(null);
				A6.setIcon(null);
				B6.setIcon(null);
				C6.setIcon(null);
				D6.setIcon(null);
				E6.setIcon(null);
				F6.setIcon(null);
				G6.setIcon(null);
				H6.setIcon(null);
				A7.setIcon(l.pedoneRosso);
				B7.setIcon(l.pedoneRosso);
				C7.setIcon(l.pedoneRosso);
				D7.setIcon(l.pedoneRosso);
				E7.setIcon(l.pedoneRosso);
				F7.setIcon(l.pedoneRosso);
				G7.setIcon(l.pedoneRosso);
				H7.setIcon(l.pedoneRosso);
				A8.setIcon(l.torreRosso);
				B8.setIcon(l.cavalloRosso);
				C8.setIcon(l.alfiereRosso);
				D8.setIcon(l.reRosso);
				E8.setIcon(l.reginaRosso);
				F8.setIcon(l.alfiereRosso);
				G8.setIcon(l.cavalloRosso);
				H8.setIcon(l.torreRosso);
				b1.setIcon(null);
				b2.setIcon(null);
				b3.setIcon(null);
				b4.setIcon(null);
				b5.setIcon(null);
				b6.setIcon(null);
				b7.setIcon(null);
				b8.setIcon(null);
				b9.setIcon(null);
				b10.setIcon(null);
				b11.setIcon(null);
				b12.setIcon(null);
				b13.setIcon(null);
				b14.setIcon(null);
				b15.setIcon(null);
				b16.setIcon(null);
				r1.setIcon(null);
				r2.setIcon(null);
				r3.setIcon(null);
				r4.setIcon(null);
				r5.setIcon(null);
				r6.setIcon(null);
				r7.setIcon(null);
				r8.setIcon(null);
				r9.setIcon(null);
				r10.setIcon(null);
				r11.setIcon(null);
				r12.setIcon(null);
				r13.setIcon(null);
				r14.setIcon(null);
				r15.setIcon(null);
				r16.setIcon(null);
				titolo.setText("Gioco degli scacchi");
			}
		});
	}

	public void bodyCancel(JLabel label, JFrame display,

			JLabel A1, JLabel B1, JLabel C1, JLabel D1, JLabel E1, JLabel F1, JLabel G1, JLabel H1, JLabel A2,
			JLabel B2, JLabel C2, JLabel D2, JLabel E2, JLabel F2, JLabel G2, JLabel H2, JLabel A3, JLabel B3,
			JLabel C3, JLabel D3, JLabel E3, JLabel F3, JLabel G3, JLabel H3, JLabel A4, JLabel B4, JLabel C4,
			JLabel D4, JLabel E4, JLabel F4, JLabel G4, JLabel H4, JLabel A5, JLabel B5, JLabel C5, JLabel D5,
			JLabel E5, JLabel F5, JLabel G5, JLabel H5, JLabel A6, JLabel B6, JLabel C6, JLabel D6, JLabel E6,
			JLabel F6, JLabel G6, JLabel H6, JLabel A7, JLabel B7, JLabel C7, JLabel D7, JLabel E7, JLabel F7,
			JLabel G7, JLabel H7, JLabel A8, JLabel B8, JLabel C8, JLabel D8, JLabel E8, JLabel F8, JLabel G8,
			JLabel H8,

			JLabel b1, JLabel b2, JLabel b3, JLabel b4, JLabel b5, JLabel b6, JLabel b7, JLabel b8, JLabel b9,
			JLabel b10, JLabel b11, JLabel b12, JLabel b13, JLabel b14, JLabel b15, JLabel b16,

			JLabel r1, JLabel r2, JLabel r3, JLabel r4, JLabel r5, JLabel r6, JLabel r7, JLabel r8, JLabel r9,
			JLabel r10, JLabel r11, JLabel r12, JLabel r13, JLabel r14, JLabel r15, JLabel r16)

	{
		label.setBounds(1142, 23, 120, 36);
		label.setFont(new Font("Quillain", Font.PLAIN, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		display.getContentPane().add(label);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setForeground(Color.GREEN);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label.setForeground(Color.WHITE);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				A1.setIcon(null);
				B1.setIcon(null);
				C1.setIcon(null);
				D1.setIcon(null);
				E1.setIcon(null);
				F1.setIcon(null);
				G1.setIcon(null);
				H1.setIcon(null);
				A2.setIcon(null);
				B2.setIcon(null);
				C2.setIcon(null);
				D2.setIcon(null);
				E2.setIcon(null);
				F2.setIcon(null);
				G2.setIcon(null);
				H2.setIcon(null);
				A3.setIcon(null);
				B3.setIcon(null);
				C3.setIcon(null);
				D3.setIcon(null);
				E3.setIcon(null);
				F3.setIcon(null);
				G3.setIcon(null);
				H3.setIcon(null);
				A4.setIcon(null);
				B4.setIcon(null);
				C4.setIcon(null);
				D4.setIcon(null);
				E4.setIcon(null);
				F4.setIcon(null);
				G4.setIcon(null);
				H4.setIcon(null);
				A5.setIcon(null);
				B5.setIcon(null);
				C5.setIcon(null);
				D5.setIcon(null);
				E5.setIcon(null);
				F5.setIcon(null);
				G5.setIcon(null);
				H5.setIcon(null);
				A6.setIcon(null);
				B6.setIcon(null);
				C6.setIcon(null);
				D6.setIcon(null);
				E6.setIcon(null);
				F6.setIcon(null);
				G6.setIcon(null);
				H6.setIcon(null);
				A7.setIcon(null);
				B7.setIcon(null);
				C7.setIcon(null);
				D7.setIcon(null);
				E7.setIcon(null);
				F7.setIcon(null);
				G7.setIcon(null);
				H7.setIcon(null);
				A8.setIcon(null);
				B8.setIcon(null);
				C8.setIcon(null);
				D8.setIcon(null);
				E8.setIcon(null);
				F8.setIcon(null);
				G8.setIcon(null);
				H8.setIcon(null);
				b1.setIcon(null);
				b2.setIcon(null);
				b3.setIcon(null);
				b4.setIcon(null);
				b5.setIcon(null);
				b6.setIcon(null);
				b7.setIcon(null);
				b8.setIcon(null);
				b9.setIcon(null);
				b10.setIcon(null);
				b11.setIcon(null);
				b12.setIcon(null);
				b13.setIcon(null);
				b14.setIcon(null);
				b15.setIcon(null);
				b16.setIcon(null);
				r1.setIcon(null);
				r2.setIcon(null);
				r3.setIcon(null);
				r4.setIcon(null);
				r5.setIcon(null);
				r6.setIcon(null);
				r7.setIcon(null);
				r8.setIcon(null);
				r9.setIcon(null);
				r10.setIcon(null);
				r11.setIcon(null);
				r12.setIcon(null);
				r13.setIcon(null);
				r14.setIcon(null);
				r15.setIcon(null);
				r16.setIcon(null);
			}
		});
	}

	public void finePartita(JLabel A1, JLabel B1, JLabel C1, JLabel D1, JLabel E1, JLabel F1, JLabel G1, JLabel H1,
			JLabel A2, JLabel B2, JLabel C2, JLabel D2, JLabel E2, JLabel F2, JLabel G2, JLabel H2, JLabel A3,
			JLabel B3, JLabel C3, JLabel D3, JLabel E3, JLabel F3, JLabel G3, JLabel H3, JLabel A4, JLabel B4,
			JLabel C4, JLabel D4, JLabel E4, JLabel F4, JLabel G4, JLabel H4, JLabel A5, JLabel B5, JLabel C5,
			JLabel D5, JLabel E5, JLabel F5, JLabel G5, JLabel H5, JLabel A6, JLabel B6, JLabel C6, JLabel D6,
			JLabel E6, JLabel F6, JLabel G6, JLabel H6, JLabel A7, JLabel B7, JLabel C7, JLabel D7, JLabel E7,
			JLabel F7, JLabel G7, JLabel H7, JLabel A8, JLabel B8, JLabel C8, JLabel D8, JLabel E8, JLabel F8,
			JLabel G8, JLabel H8,

			JLabel b1, JLabel b2, JLabel b3, JLabel b4, JLabel b5, JLabel b6, JLabel b7, JLabel b8, JLabel b9,
			JLabel b10, JLabel b11, JLabel b12, JLabel b13, JLabel b14, JLabel b15, JLabel b16,

			JLabel r1, JLabel r2, JLabel r3, JLabel r4, JLabel r5, JLabel r6, JLabel r7, JLabel r8, JLabel r9,
			JLabel r10, JLabel r11, JLabel r12, JLabel r13, JLabel r14, JLabel r15, JLabel r16) {

		A1.setIcon(null);
		B1.setIcon(null);
		C1.setIcon(null);
		D1.setIcon(null);
		E1.setIcon(null);
		F1.setIcon(null);
		G1.setIcon(null);
		H1.setIcon(null);
		A2.setIcon(null);
		B2.setIcon(null);
		C2.setIcon(null);
		D2.setIcon(null);
		E2.setIcon(null);
		F2.setIcon(null);
		G2.setIcon(null);
		H2.setIcon(null);
		A3.setIcon(null);
		B3.setIcon(null);
		C3.setIcon(null);
		D3.setIcon(null);
		E3.setIcon(null);
		F3.setIcon(null);
		G3.setIcon(null);
		H3.setIcon(null);
		A4.setIcon(null);
		B4.setIcon(null);
		C4.setIcon(null);
		D4.setIcon(null);
		E4.setIcon(null);
		F4.setIcon(null);
		G4.setIcon(null);
		H4.setIcon(null);
		A5.setIcon(null);
		B5.setIcon(null);
		C5.setIcon(null);
		D5.setIcon(null);
		E5.setIcon(null);
		F5.setIcon(null);
		G5.setIcon(null);
		H5.setIcon(null);
		A6.setIcon(null);
		B6.setIcon(null);
		C6.setIcon(null);
		D6.setIcon(null);
		E6.setIcon(null);
		F6.setIcon(null);
		G6.setIcon(null);
		H6.setIcon(null);
		A7.setIcon(null);
		B7.setIcon(null);
		C7.setIcon(null);
		D7.setIcon(null);
		E7.setIcon(null);
		F7.setIcon(null);
		G7.setIcon(null);
		H7.setIcon(null);
		A8.setIcon(null);
		B8.setIcon(null);
		C8.setIcon(null);
		D8.setIcon(null);
		E8.setIcon(null);
		F8.setIcon(null);
		G8.setIcon(null);
		H8.setIcon(null);
		b1.setIcon(null);
		b2.setIcon(null);
		b3.setIcon(null);
		b4.setIcon(null);
		b5.setIcon(null);
		b6.setIcon(null);
		b7.setIcon(null);
		b8.setIcon(null);
		b9.setIcon(null);
		b10.setIcon(null);
		b11.setIcon(null);
		b12.setIcon(null);
		b13.setIcon(null);
		b14.setIcon(null);
		b15.setIcon(null);
		b16.setIcon(null);
		r1.setIcon(null);
		r2.setIcon(null);
		r3.setIcon(null);
		r4.setIcon(null);
		r5.setIcon(null);
		r6.setIcon(null);
		r7.setIcon(null);
		r8.setIcon(null);
		r9.setIcon(null);
		r10.setIcon(null);
		r11.setIcon(null);
		r12.setIcon(null);
		r13.setIcon(null);
		r14.setIcon(null);
		r15.setIcon(null);
		r16.setIcon(null);

	}
}