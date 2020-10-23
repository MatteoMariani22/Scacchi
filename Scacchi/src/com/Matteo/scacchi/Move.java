package com.Matteo.scacchi;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Move {

	JLabel labelSelezionata;
	Icon icona;
	String iconaSelezionata;
	boolean click = false;
	boolean finePartita = false;
	boolean blu = false;
	boolean rosso = false;

	String alfiereBlu = "/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Scacchi/images/alfiere_Blu.png";
	String alfiereRosso = "/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Scacchi/images/alfiere_Rosso.png";
	String cavalloBlu = "/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Scacchi/images/cavallo_Blu.png";
	String cavalloRosso = "/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Scacchi/images/cavallo_Rosso.png";
	String pedoneBlu = "/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Scacchi/images/pedone_Blu.png";
	String pedoneRosso = "/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Scacchi/images/pedone_Rosso.png";
	String reBlu = "/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Scacchi/images/re_Blu.png";
	String reRosso = "/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Scacchi/images/re_Rosso.png";
	String reginaBlu = "/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Scacchi/images/regina_Blu.png";
	String reginaRosso = "/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Scacchi/images/regina_Rosso.png";
	String torreBlu = "/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Scacchi/images/torre_Blu.png";
	String torreRosso = "/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Scacchi/images/torre_Rosso.png";

	public void selectionMove(JFrame display, JLabel principal, JPanel panel, JLabel label1R, JLabel label2R,
			JLabel label3R, JLabel label4R, JLabel label5R, JLabel label6R, JLabel label7R, JLabel label8R,
			JLabel label9R, JLabel label10R, JLabel label11R, JLabel label12R, JLabel label13R, JLabel label14R,
			JLabel label15R, JLabel label16R,

			JLabel label1B, JLabel label2B, JLabel label3B, JLabel label4B, JLabel label5B, JLabel label6B,
			JLabel label7B, JLabel label8B, JLabel label9B, JLabel label10B, JLabel label11B, JLabel label12B,
			JLabel label13B, JLabel label14B, JLabel label15B, JLabel label16B,

			JLabel A1, JLabel B1, JLabel C1, JLabel D1, JLabel E1, JLabel F1, JLabel G1, JLabel H1, JLabel A2,
			JLabel B2, JLabel C2, JLabel D2, JLabel E2, JLabel F2, JLabel G2, JLabel H2, JLabel A3, JLabel B3,
			JLabel C3, JLabel D3, JLabel E3, JLabel F3, JLabel G3, JLabel H3, JLabel A4, JLabel B4, JLabel C4,
			JLabel D4, JLabel E4, JLabel F4, JLabel G4, JLabel H4, JLabel A5, JLabel B5, JLabel C5, JLabel D5,
			JLabel E5, JLabel F5, JLabel G5, JLabel H5, JLabel A6, JLabel B6, JLabel C6, JLabel D6, JLabel E6,
			JLabel F6, JLabel G6, JLabel H6, JLabel A7, JLabel B7, JLabel C7, JLabel D7, JLabel E7, JLabel F7,
			JLabel G7, JLabel H7, JLabel A8, JLabel B8, JLabel C8, JLabel D8, JLabel E8, JLabel F8, JLabel G8,
			JLabel H8, JLabel txt) {

		principal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (principal.getIcon() != null && click == true) {

					click = false;

					if (principal == labelSelezionata) {

					} else {

						if (labelSelezionata != null) {

							if (labelSelezionata.getIcon() != null) {
								String cercaPedina = "";
								if (principal.getIcon() != null) {
									cercaPedina = principal.getIcon().toString();
									icona = principal.getIcon();
								}
								principal.setIcon(labelSelezionata.getIcon());

								if (cercaPedina.equals(alfiereRosso) || cercaPedina.equals(cavalloRosso)
										|| cercaPedina.equals(pedoneRosso) || cercaPedina.equals(reginaRosso)
										|| cercaPedina.equals(reRosso) || cercaPedina.equals(torreRosso)
										|| cercaPedina.equals(alfiereBlu) || cercaPedina.equals(cavalloBlu)
										|| cercaPedina.equals(pedoneBlu) || cercaPedina.equals(reginaBlu)
										|| cercaPedina.equals(reBlu) || cercaPedina.equals(torreBlu)) {
									principal.setIcon(labelSelezionata.getIcon());

									if (labelSelezionata.getIcon().toString().equals(alfiereRosso)
											|| labelSelezionata.getIcon().toString().equals(cavalloRosso)
											|| labelSelezionata.getIcon().toString().equals(pedoneRosso)
											|| labelSelezionata.getIcon().toString().equals(reginaRosso)
											|| labelSelezionata.getIcon().toString().equals(reRosso)
											|| labelSelezionata.getIcon().toString().equals(torreRosso)) {

										if (label1B.getIcon() == null) {
											label1B.setIcon(icona);
										} else if (label2B.getIcon() == null) {
											label2B.setIcon(icona);
										} else if (label3B.getIcon() == null) {
											label3B.setIcon(icona);
										} else if (label4B.getIcon() == null) {
											label4B.setIcon(icona);
										} else if (label5B.getIcon() == null) {
											label5B.setIcon(icona);
										} else if (label6B.getIcon() == null) {
											label6B.setIcon(icona);
										} else if (label7B.getIcon() == null) {
											label7B.setIcon(icona);
										} else if (label8B.getIcon() == null) {
											label8B.setIcon(icona);
										} else if (label9B.getIcon() == null) {
											label9B.setIcon(icona);
										} else if (label10B.getIcon() == null) {
											label10B.setIcon(icona);
										} else if (label11B.getIcon() == null) {
											label11B.setIcon(icona);
										} else if (label12B.getIcon() == null) {
											label12B.setIcon(icona);
										} else if (label13B.getIcon() == null) {
											label13B.setIcon(icona);
										} else if (label14B.getIcon() == null) {
											label14B.setIcon(icona);
										} else if (label15B.getIcon() == null) {
											label15B.setIcon(icona);
										} else {
											label16B.setIcon(icona);
										}
										if (icona.toString().equals(reBlu)) {
											finePartita = true;
											rosso = true;
										} else if (icona.toString().equals(reRosso)) {
											finePartita = true;
											blu = true;
										}
										labelSelezionata.setIcon(null);
									} else if (labelSelezionata.getIcon().toString().equals(alfiereBlu)
											|| labelSelezionata.getIcon().toString().equals(cavalloBlu)
											|| labelSelezionata.getIcon().toString().equals(pedoneBlu)
											|| labelSelezionata.getIcon().toString().equals(reginaBlu)
											|| labelSelezionata.getIcon().toString().equals(reBlu)
											|| labelSelezionata.getIcon().toString().equals(torreBlu)) {

										if (label1R.getIcon() == null) {
											label1R.setIcon(icona);
										} else if (label2R.getIcon() == null) {
											label2R.setIcon(icona);
										} else if (label3R.getIcon() == null) {
											label3R.setIcon(icona);
										} else if (label4R.getIcon() == null) {
											label4R.setIcon(icona);
										} else if (label5R.getIcon() == null) {
											label5R.setIcon(icona);
										} else if (label6R.getIcon() == null) {
											label6R.setIcon(icona);
										} else if (label7R.getIcon() == null) {
											label7R.setIcon(icona);
										} else if (label8R.getIcon() == null) {
											label8R.setIcon(icona);
										} else if (label9R.getIcon() == null) {
											label9R.setIcon(icona);
										} else if (label10R.getIcon() == null) {
											label10R.setIcon(icona);
										} else if (label11R.getIcon() == null) {
											label11R.setIcon(icona);
										} else if (label12R.getIcon() == null) {
											label12R.setIcon(icona);
										} else if (label13R.getIcon() == null) {
											label13R.setIcon(icona);
										} else if (label14R.getIcon() == null) {
											label14R.setIcon(icona);
										} else if (label15R.getIcon() == null) {
											label15R.setIcon(icona);
										} else {
											label16R.setIcon(icona);
										}
										if (icona.toString().equals(reBlu)) {
											finePartita = true;
											rosso = true;
										} else if (icona.toString().equals(reRosso)) {
											finePartita = true;
											blu = true;
										}
										labelSelezionata.setIcon(null);
									}

								} else if (!cercaPedina.equals(alfiereRosso) || !cercaPedina.equals(cavalloRosso)
										|| !cercaPedina.equals(pedoneRosso) || !cercaPedina.equals(reginaRosso)
										|| !cercaPedina.equals(reRosso) || !cercaPedina.equals(torreRosso)
										|| !cercaPedina.equals(alfiereBlu) || !cercaPedina.equals(cavalloBlu)
										|| !cercaPedina.equals(pedoneBlu) || !cercaPedina.equals(reginaBlu)
										|| !cercaPedina.equals(reBlu) || !cercaPedina.equals(torreBlu)) {
									principal.setIcon(labelSelezionata.getIcon());
									labelSelezionata.setIcon(null);
								}
							}
						}
					}
				} else if (principal.getIcon() != null) {

					panel.setBackground(new Color(204, 255, 198));
					labelSelezionata = principal;
					if (labelSelezionata.getIcon() != null) {
						iconaSelezionata = labelSelezionata.getIcon().toString();
					}
					click = true;

				} else if (principal.getIcon() == null || click == true) {

					click = false;

					if (principal == labelSelezionata) {

					} else {

						if (labelSelezionata != null) {

							if (labelSelezionata.getIcon() != null) {
								String cercaPedina = "";
								if (principal.getIcon() != null) {
									cercaPedina = principal.getIcon().toString();
									icona = principal.getIcon();
								}
								principal.setIcon(labelSelezionata.getIcon());

								if (cercaPedina.equals(alfiereRosso) || cercaPedina.equals(cavalloRosso)
										|| cercaPedina.equals(pedoneRosso) || cercaPedina.equals(reginaRosso)
										|| cercaPedina.equals(reRosso) || cercaPedina.equals(torreRosso)
										|| cercaPedina.equals(alfiereBlu) || cercaPedina.equals(cavalloBlu)
										|| cercaPedina.equals(pedoneBlu) || cercaPedina.equals(reginaBlu)
										|| cercaPedina.equals(reBlu) || cercaPedina.equals(torreBlu)) {
									principal.setIcon(labelSelezionata.getIcon());

									if (labelSelezionata.getIcon().toString().equals(alfiereRosso)
											|| labelSelezionata.getIcon().toString().equals(cavalloRosso)
											|| labelSelezionata.getIcon().toString().equals(pedoneRosso)
											|| labelSelezionata.getIcon().toString().equals(reginaRosso)
											|| labelSelezionata.getIcon().toString().equals(reRosso)
											|| labelSelezionata.getIcon().toString().equals(torreRosso)) {

										if (label1B.getIcon() == null) {
											label1B.setIcon(icona);
										} else if (label2B.getIcon() == null) {
											label2B.setIcon(icona);
										} else if (label3B.getIcon() == null) {
											label3B.setIcon(icona);
										} else if (label4B.getIcon() == null) {
											label4B.setIcon(icona);
										} else if (label5B.getIcon() == null) {
											label5B.setIcon(icona);
										} else if (label6B.getIcon() == null) {
											label6B.setIcon(icona);
										} else if (label7B.getIcon() == null) {
											label7B.setIcon(icona);
										} else if (label8B.getIcon() == null) {
											label8B.setIcon(icona);
										} else if (label9B.getIcon() == null) {
											label9B.setIcon(icona);
										} else if (label10B.getIcon() == null) {
											label10B.setIcon(icona);
										} else if (label11B.getIcon() == null) {
											label11B.setIcon(icona);
										} else if (label12B.getIcon() == null) {
											label12B.setIcon(icona);
										} else if (label13B.getIcon() == null) {
											label13B.setIcon(icona);
										} else if (label14B.getIcon() == null) {
											label14B.setIcon(icona);
										} else if (label15B.getIcon() == null) {
											label15B.setIcon(icona);
										} else {
											label16B.setIcon(icona);
										}
										if (icona.toString().equals(reBlu)) {
											finePartita = true;
											rosso = true;
										} else if (icona.toString().equals(reRosso)) {
											finePartita = true;
											blu = true;
										}
										labelSelezionata.setIcon(null);
									} else if (labelSelezionata.getIcon().toString().equals(alfiereBlu)
											|| labelSelezionata.getIcon().toString().equals(cavalloBlu)
											|| labelSelezionata.getIcon().toString().equals(pedoneBlu)
											|| labelSelezionata.getIcon().toString().equals(reginaBlu)
											|| labelSelezionata.getIcon().toString().equals(reBlu)
											|| labelSelezionata.getIcon().toString().equals(torreBlu)) {

										if (label1R.getIcon() == null) {
											label1R.setIcon(icona);
										} else if (label2R.getIcon() == null) {
											label2R.setIcon(icona);
										} else if (label3R.getIcon() == null) {
											label3R.setIcon(icona);
										} else if (label4R.getIcon() == null) {
											label4R.setIcon(icona);
										} else if (label5R.getIcon() == null) {
											label5R.setIcon(icona);
										} else if (label6R.getIcon() == null) {
											label6R.setIcon(icona);
										} else if (label7R.getIcon() == null) {
											label7R.setIcon(icona);
										} else if (label8R.getIcon() == null) {
											label8R.setIcon(icona);
										} else if (label9R.getIcon() == null) {
											label9R.setIcon(icona);
										} else if (label10R.getIcon() == null) {
											label10R.setIcon(icona);
										} else if (label11R.getIcon() == null) {
											label11R.setIcon(icona);
										} else if (label12R.getIcon() == null) {
											label12R.setIcon(icona);
										} else if (label13R.getIcon() == null) {
											label13R.setIcon(icona);
										} else if (label14R.getIcon() == null) {
											label14R.setIcon(icona);
										} else if (label15R.getIcon() == null) {
											label15R.setIcon(icona);
										} else {
											label16R.setIcon(icona);
										}
										if (icona.toString().equals(reBlu)) {
											finePartita = true;
											rosso = true;
										} else if (icona.toString().equals(reRosso)) {
											finePartita = true;
											blu = true;
										}
										labelSelezionata.setIcon(null);
									}

								} else if (!cercaPedina.equals(alfiereRosso) || !cercaPedina.equals(cavalloRosso)
										|| !cercaPedina.equals(pedoneRosso) || !cercaPedina.equals(reginaRosso)
										|| !cercaPedina.equals(reRosso) || !cercaPedina.equals(torreRosso)
										|| !cercaPedina.equals(alfiereBlu) || !cercaPedina.equals(cavalloBlu)
										|| !cercaPedina.equals(pedoneBlu) || !cercaPedina.equals(reginaBlu)
										|| !cercaPedina.equals(reBlu) || !cercaPedina.equals(torreBlu)) {
									principal.setIcon(labelSelezionata.getIcon());
									labelSelezionata.setIcon(null);
								}
							}
						}
					}
				}
				if (finePartita == true && blu == true) {
					JOptionPane.showMessageDialog(display, "Scacco Matto!\n" + "Squadra Blu Vince!");
					txt.setText("Vince la squadra Blu");
					Action a = new Action();
					a.finePartita(A1, B1, C1, D1, E1, F1, G1, H1, A2, B2, C2, D2, E2, F2, G2, H2, A3, B3, C3, D3, E3,
							F3, G3, H3, A4, B4, C4, D4, E4, F4, G4, H4, A5, B5, C5, D5, E5, F5, G5, H5, A6, B6, C6, D6,
							E6, F6, G6, H6, A7, B7, C7, D7, E7, F7, G7, H7, A8, B8, C8, D8, E8, F8, G8, H8, label1R,
							label2R, label3R, label4R, label5R, label6R, label7R, label8R, label9R, label10R, label11R,
							label12R, label13R, label14R, label15R, label16R, label1B, label2B, label3B, label4B,
							label5B, label6B, label7B, label8B, label9B, label10B, label11B, label12B, label13B,
							label14B, label15B, label16B);
					finePartita = false;
					blu = false;
				} else if (finePartita == true && rosso == true) {
					JOptionPane.showMessageDialog(display, "Scacco Matto!\n" + "Squadra Rossa Vince!");
					txt.setText("Vince la squadra Rossa");
					Action a = new Action();
					a.finePartita(A1, B1, C1, D1, E1, F1, G1, H1, A2, B2, C2, D2, E2, F2, G2, H2, A3, B3, C3, D3, E3,
							F3, G3, H3, A4, B4, C4, D4, E4, F4, G4, H4, A5, B5, C5, D5, E5, F5, G5, H5, A6, B6, C6, D6,
							E6, F6, G6, H6, A7, B7, C7, D7, E7, F7, G7, H7, A8, B8, C8, D8, E8, F8, G8, H8, label1R,
							label2R, label3R, label4R, label5R, label6R, label7R, label8R, label9R, label10R, label11R,
							label12R, label13R, label14R, label15R, label16R, label1B, label2B, label3B, label4B,
							label5B, label6B, label7B, label8B, label9B, label10B, label11B, label12B, label13B,
							label14B, label15B, label16B);
					finePartita = false;
					rosso = false;
				}
			}
		});
	}
}