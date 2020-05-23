import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.synth.SynthSeparatorUI;


public class Builder {
		private Team team;
		private Pokedex pokedex = new Pokedex();
		private List<Pokemon> pokedexlist = pokedex.getPokedex();
		private String[] teamStyles = {"Balanced", "Offensive", "Defensive"};
		private String teamStyle;
		private Pokemon firstPokemon;
		
		
		public static void main(String args[]) {
			new Builder().start();
		}
		
		private void start() {
			JFrame welcome = new JFrame("Welcome to the Pokemon Team Builder!");
			welcome.setBounds(0,0,700,400);
			welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			welcome.getContentPane().setLayout(null);
			JLabel mess = new JLabel("Are you ready to become the very best like no one ever was?");
			mess.setBounds(0,10, 600, 20);
			welcome.getContentPane().add(mess);
			JLabel mess1 = new JLabel("This program will help you build a team for competitive Pokemon battling!");
			JLabel mess2 = new JLabel("First, you will select which style of team you want.");
			JLabel mess3 = new JLabel("An offensive team style will give preference to Pokemon with higher Attack, Special Attack, and Speed Stats.");
			JLabel mess4 = new JLabel("A defensive style will give preference to Pokemon with higher Defense, Special Defense, and HP Stats.");
			JLabel mess5 = new JLabel(" A balanced style will give equal preference to all Stats.");
			JLabel mess6 = new JLabel("After choosing your style, you will choose your first Pokemon.");
			JLabel mess7 = new JLabel("After that, this program will recommend Pokemon to add your team based on the style you");
			JLabel mess8 = new JLabel("chose and how well the Pokemon's typing complements your team.");
			JLabel mess9 = new JLabel("Fill out your team and have fun!");
			mess2.setBounds(0,30, 700, 20);
			mess3.setBounds(0,50, 700, 20);
			mess4.setBounds(0,70, 700, 20);
			mess5.setBounds(0,90, 700, 20);
			mess6.setBounds(0,110, 700, 20);
			mess7.setBounds(0,130, 700, 20);
			mess8.setBounds(0,150, 700, 20);
			mess9.setBounds(0,170, 700, 20);
			welcome.getContentPane().add(mess1);
			welcome.getContentPane().add(mess2);
			welcome.getContentPane().add(mess3);
			welcome.getContentPane().add(mess4);
			welcome.getContentPane().add(mess5);
			welcome.getContentPane().add(mess6);
			welcome.getContentPane().add(mess7);
			welcome.getContentPane().add(mess8);
			welcome.getContentPane().add(mess9);


			JButton begin = new JButton("Begin!");
			begin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					welcome.dispose();
					JFrame frame1 = new JFrame("Which Style Team Would You Like?");
					frame1.setBounds(0, 0, 400, 200);
					frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame1.getContentPane().setLayout(null);
					
			//		panel = new JPanel();
			//		panel.setPreferredSize(new Dimension(800,600));
					JComboBox styleList = new JComboBox(teamStyles);
					styleList.setBounds(100, 50, 200, 50);
					
					JButton button1 = new JButton("Ok!");
					button1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							teamStyle = (String) styleList.getSelectedItem();
							System.out.println(teamStyle);
							frame1.dispose();
							firstPokemon();
						}
					});
					button1.setBounds(150, 150, 50, 25);
			//		frame1.add(panel);
					frame1.getContentPane().add(styleList);
					frame1.getContentPane().add(button1);
				//	frame1.pack();
					frame1.setVisible(true);	
				}
			});
			begin.setBounds(275, 350, 100, 25);
			welcome.getContentPane().add(begin);
			welcome.setVisible(true);
		}
		
		public void firstPokemon() {
			List<Pokemon> PokemonList = pokedex.getPokedex();
			Object[] list2 = PokemonList.toArray();
			JFrame frame2 = new JFrame("Pick Your First Pokemon!");
			frame2.setBounds(0, 0, 800, 600);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.getContentPane().setLayout(null);
			
			JComboBox styleList = new JComboBox(list2);
			styleList.setBounds(200, 50, 400, 50);
			
			JButton button1 = new JButton("Ok!");
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					firstPokemon = (Pokemon) styleList.getSelectedItem();
					System.out.println(firstPokemon.getName());
					team = new Team(firstPokemon.getName());
					pokedexlist.remove(firstPokemon);
					System.out.println(team.getTeam());
					frame2.dispose();
				//	System.out.println(fitGraph());
				//	System.out.println(totalFit());
				//	System.out.println(statsGraph());
				//	System.out.println(statsFit());
					secondPokemon();
					}
			});
			button1.setBounds(375, 125, 50, 25);
			
			//Labels
			JLabel label = new JLabel("(" + teamStyle +") " + "Your Team:");
			label.setBounds(325, 160, 150, 25);
			frame2.getContentPane().add(label);
			JLabel a = new JLabel("n/a");
			a.setBounds(0, 185, 266, 35);
			frame2.getContentPane().add(a);
			JLabel b = new JLabel("n/a");
			b.setBounds(266, 185, 266, 35);
			frame2.getContentPane().add(b);
			JLabel c = new JLabel("n/a");
			c.setBounds(532, 185, 266, 35);
			frame2.getContentPane().add(c);
			JLabel d = new JLabel("n/a");
			d.setBounds(0, 395, 266, 30);
			frame2.getContentPane().add(d);
			JLabel e = new JLabel("n/a");
			e.setBounds(266, 395, 266, 30);
			frame2.getContentPane().add(e);
			JLabel f = new JLabel("n/a");
			f.setBounds(532, 395, 266, 30);
			frame2.getContentPane().add(f);	
			
			Rectangle r1 = new Rectangle(0,220, 266, 175);
			Rectangle r2 = new Rectangle(266,220, 266, 175);
			Rectangle r3 = new Rectangle(532,220, 266, 175);
			Rectangle r4 = new Rectangle(0,425, 266, 175);
			Rectangle r5 = new Rectangle(266,425, 266, 175);
			Rectangle r6 = new Rectangle(532,425, 266, 175);
			
			frame2.getContentPane().add(styleList);
			frame2.getContentPane().add(button1);
			frame2.getContentPane().add(label);
			frame2.setVisible(true);
			
		}
		
		public void secondPokemon() {
			Object[] recommended = totalFit().toArray();
			
			JFrame frame2 = new JFrame("Pick Your Second Pokemon!");
			frame2.setBounds(0, 0, 800, 600);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.getContentPane().setLayout(null);
			
			JComboBox styleList = new JComboBox(recommended);
			styleList.setBounds(200, 50, 400, 50);
			
			JButton button1 = new JButton("Ok!");
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					firstPokemon = (Pokemon) styleList.getSelectedItem();
					team.addPokemon(firstPokemon.getName());
					pokedexlist.remove(firstPokemon);
					System.out.println(team.getTeam());
					frame2.dispose();
				//	System.out.println(fitGraph());
				//	System.out.println(totalFit());
				//	System.out.println(statsGraph());
				//	System.out.println(statsFit());
					thirdPokemon();
					}
			});
			button1.setBounds(375, 125, 50, 25);
			
			//Labels
			JLabel label = new JLabel("(" + teamStyle + ") " + "Your Team:");
			label.setBounds(325, 160, 150, 25);
			frame2.getContentPane().add(label);
			JLabel a = new JLabel(team.getTeam().get(0).toString());
			a.setBounds(0, 185, 266, 35);
			frame2.getContentPane().add(a);
			JLabel b = new JLabel("n/a");
			b.setBounds(266, 185, 266, 35);
			frame2.getContentPane().add(b);
			JLabel c = new JLabel("n/a");
			c.setBounds(532, 185, 266, 35);
			frame2.getContentPane().add(c);
			JLabel d = new JLabel("n/a");
			d.setBounds(0, 395, 266, 30);
			frame2.getContentPane().add(d);
			JLabel e = new JLabel("n/a");
			e.setBounds(266, 395, 266, 30);
			frame2.getContentPane().add(e);
			JLabel f = new JLabel("n/a");
			f.setBounds(532, 395, 266, 30);
			frame2.getContentPane().add(f);	
			
			Rectangle r1 = new Rectangle(0,220, 266, 175);
			Rectangle r2 = new Rectangle(266,220, 266, 175);
			Rectangle r3 = new Rectangle(532,220, 266, 175);
			Rectangle r4 = new Rectangle(0,425, 266, 175);
			Rectangle r5 = new Rectangle(266,425, 266, 175);
			Rectangle r6 = new Rectangle(532,425, 266, 175);
			System.out.println(team.getTeam().get(0).returnImgName());
			JLabel img1 = new JLabel(new ImageIcon(team.getTeam().get(0).returnImage()));
			img1.setBounds(r1);
			frame2.getContentPane().add(img1);
			
			frame2.getContentPane().add(styleList);
			frame2.getContentPane().add(button1);
			frame2.getContentPane().add(label);
			
			frame2.setVisible(true);
			
		}
	
		public void thirdPokemon() {
			Object[] recommended = totalFit().toArray();
			
			JFrame frame2 = new JFrame("Pick Your Third Pokemon!");
			frame2.setBounds(0, 0, 800, 600);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.getContentPane().setLayout(null);
			
			JComboBox styleList = new JComboBox(recommended);
			styleList.setBounds(200, 50, 400, 50);
			
			JButton button1 = new JButton("Ok!");
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					firstPokemon = (Pokemon) styleList.getSelectedItem();
					team.addPokemon(firstPokemon.getName());
					pokedexlist.remove(firstPokemon);
					System.out.println(team.getTeam());
					frame2.dispose();
				//	System.out.println(fitGraph());
				//	System.out.println(totalFit());
				//	System.out.println(statsGraph());
				//	System.out.println(statsFit());
					fourthPokemon();
					}
			});
			button1.setBounds(375, 125, 50, 25);
			
			//Labels
			JLabel label = new JLabel("(" + teamStyle + ") " + "Your Team:");
			label.setBounds(325, 160, 150, 25);
			frame2.getContentPane().add(label);
			JLabel a = new JLabel(team.getTeam().get(0).toString());
			a.setBounds(0, 185, 266, 35);
			frame2.getContentPane().add(a);
			JLabel b = new JLabel(team.getTeam().get(1).toString());
			b.setBounds(266, 185, 266, 35);
			frame2.getContentPane().add(b);
			JLabel c = new JLabel("n/a");
			c.setBounds(532, 185, 266, 35);
			frame2.getContentPane().add(c);
			JLabel d = new JLabel("n/a");
			d.setBounds(0, 395, 266, 30);
			frame2.getContentPane().add(d);
			JLabel e = new JLabel("n/a");
			e.setBounds(266, 395, 266, 30);
			frame2.getContentPane().add(e);
			JLabel f = new JLabel("n/a");
			f.setBounds(532, 395, 266, 30);
			frame2.getContentPane().add(f);	
			
			Rectangle r1 = new Rectangle(0,220, 266, 175);
			Rectangle r2 = new Rectangle(266,220, 266, 175);
			Rectangle r3 = new Rectangle(532,220, 266, 175);
			Rectangle r4 = new Rectangle(0,425, 266, 175);
			Rectangle r5 = new Rectangle(266,425, 266, 175);
			Rectangle r6 = new Rectangle(532,425, 266, 175);
			System.out.println(team.getTeam().get(0).returnImgName());
			JLabel img1 = new JLabel(new ImageIcon(team.getTeam().get(0).returnImage()));
			img1.setBounds(r1);
			frame2.getContentPane().add(img1);
			JLabel img2 = new JLabel(new ImageIcon(team.getTeam().get(1).returnImage()));
			img2.setBounds(r2);
			frame2.getContentPane().add(img2);
			
			frame2.getContentPane().add(styleList);
			frame2.getContentPane().add(button1);
			frame2.getContentPane().add(label);
			
			frame2.setVisible(true);
			
		}
	
		public void fourthPokemon() {
			Object[] recommended = totalFit().toArray();
			
			JFrame frame2 = new JFrame("Pick Your Fourth Pokemon!");
			frame2.setBounds(0, 0, 800, 600);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.getContentPane().setLayout(null);
			
			JComboBox styleList = new JComboBox(recommended);
			styleList.setBounds(200, 50, 400, 50);
			
			JButton button1 = new JButton("Ok!");
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					firstPokemon = (Pokemon) styleList.getSelectedItem();
					team.addPokemon(firstPokemon.getName());
					pokedexlist.remove(firstPokemon);
					System.out.println(team.getTeam());
					frame2.dispose();
				//	System.out.println(fitGraph());
				//	System.out.println(totalFit());
				//	System.out.println(statsGraph());
				//	System.out.println(statsFit());
					fifthPokemon();
					}
			});
			button1.setBounds(375, 125, 50, 25);
			
			//Labels
			JLabel label = new JLabel("(" + teamStyle + ") " + "Your Team:");
			label.setBounds(325, 160, 150, 25);
			frame2.getContentPane().add(label);
			JLabel a = new JLabel(team.getTeam().get(0).toString());
			a.setBounds(0, 185, 266, 35);
			frame2.getContentPane().add(a);
			JLabel b = new JLabel(team.getTeam().get(1).toString());
			b.setBounds(266, 185, 266, 35);
			frame2.getContentPane().add(b);
			JLabel c = new JLabel(team.getTeam().get(2).toString());
			c.setBounds(532, 185, 266, 35);
			frame2.getContentPane().add(c);
			JLabel d = new JLabel("n/a");
			d.setBounds(0, 395, 266, 30);
			frame2.getContentPane().add(d);
			JLabel e = new JLabel("n/a");
			e.setBounds(266, 395, 266, 30);
			frame2.getContentPane().add(e);
			JLabel f = new JLabel("n/a");
			f.setBounds(532, 395, 266, 30);
			frame2.getContentPane().add(f);	
			
			Rectangle r1 = new Rectangle(0,220, 266, 175);
			Rectangle r2 = new Rectangle(266,220, 266, 175);
			Rectangle r3 = new Rectangle(532,220, 266, 175);
			Rectangle r4 = new Rectangle(0,425, 266, 175);
			Rectangle r5 = new Rectangle(266,425, 266, 175);
			Rectangle r6 = new Rectangle(532,425, 266, 175);
			System.out.println(team.getTeam().get(0).returnImgName());
			JLabel img1 = new JLabel(new ImageIcon(team.getTeam().get(0).returnImage()));
			img1.setBounds(r1);
			frame2.getContentPane().add(img1);
			JLabel img2 = new JLabel(new ImageIcon(team.getTeam().get(1).returnImage()));
			img2.setBounds(r2);
			frame2.getContentPane().add(img2);
			JLabel img3 = new JLabel(new ImageIcon(team.getTeam().get(2).returnImage()));
			img3.setBounds(r3);
			frame2.getContentPane().add(img3);
			
			frame2.getContentPane().add(styleList);
			frame2.getContentPane().add(button1);
			frame2.getContentPane().add(label);
			
			frame2.setVisible(true);
			
		}
		
		public void fifthPokemon() {
			Object[] recommended = totalFit().toArray();
			
			JFrame frame2 = new JFrame("Pick Your Fifth Pokemon!");
			frame2.setBounds(0, 0, 800, 600);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.getContentPane().setLayout(null);
			
			JComboBox styleList = new JComboBox(recommended);
			styleList.setBounds(200, 50, 400, 50);
			
			JButton button1 = new JButton("Ok!");
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					firstPokemon = (Pokemon) styleList.getSelectedItem();
					team.addPokemon(firstPokemon.getName());
					pokedexlist.remove(firstPokemon);
					System.out.println(team.getTeam());
					frame2.dispose();
				//	System.out.println(fitGraph());
				//	System.out.println(totalFit());
				//	System.out.println(statsGraph());
				//	System.out.println(statsFit());
					sixthPokemon();
					}
			});
			button1.setBounds(375, 125, 50, 25);
			
			//Labels
			JLabel label = new JLabel("(" + teamStyle + ") " + "Your Team:");
			label.setBounds(325, 160, 150, 25);
			frame2.getContentPane().add(label);
			JLabel a = new JLabel(team.getTeam().get(0).toString());
			a.setBounds(0, 185, 266, 35);
			frame2.getContentPane().add(a);
			JLabel b = new JLabel(team.getTeam().get(1).toString());
			b.setBounds(266, 185, 266, 35);
			frame2.getContentPane().add(b);
			JLabel c = new JLabel(team.getTeam().get(2).toString());
			c.setBounds(532, 185, 266, 35);
			frame2.getContentPane().add(c);
			JLabel d = new JLabel(team.getTeam().get(3).toString());
			d.setBounds(0, 395, 266, 30);
			frame2.getContentPane().add(d);
			JLabel e = new JLabel("n/a");
			e.setBounds(266, 395, 266, 30);
			frame2.getContentPane().add(e);
			JLabel f = new JLabel("n/a");
			f.setBounds(532, 395, 266, 30);
			frame2.getContentPane().add(f);	
			
			Rectangle r1 = new Rectangle(0,220, 266, 175);
			Rectangle r2 = new Rectangle(266,220, 266, 175);
			Rectangle r3 = new Rectangle(532,220, 266, 175);
			Rectangle r4 = new Rectangle(0,425, 266, 175);
			Rectangle r5 = new Rectangle(266,425, 266, 175);
			Rectangle r6 = new Rectangle(532,425, 266, 175);
			System.out.println(team.getTeam().get(0).returnImgName());
			JLabel img1 = new JLabel(new ImageIcon(team.getTeam().get(0).returnImage()));
			img1.setBounds(r1);
			frame2.getContentPane().add(img1);
			JLabel img2 = new JLabel(new ImageIcon(team.getTeam().get(1).returnImage()));
			img2.setBounds(r2);
			frame2.getContentPane().add(img2);
			JLabel img3 = new JLabel(new ImageIcon(team.getTeam().get(2).returnImage()));
			img3.setBounds(r3);
			frame2.getContentPane().add(img3);
			JLabel img4 = new JLabel(new ImageIcon(team.getTeam().get(3).returnImage()));
			img4.setBounds(r4);
			frame2.getContentPane().add(img4);
			
			frame2.getContentPane().add(styleList);
			frame2.getContentPane().add(button1);
			frame2.getContentPane().add(label);
			
			frame2.setVisible(true);
			
		}
		public void sixthPokemon() {
			Object[] recommended = totalFit().toArray();
			
			JFrame frame2 = new JFrame("Pick Your Sixth Pokemon!");
			frame2.setBounds(0, 0, 800, 600);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.getContentPane().setLayout(null);
			
			JComboBox styleList = new JComboBox(recommended);
			styleList.setBounds(200, 50, 400, 50);
			
			JButton button1 = new JButton("Ok!");
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					firstPokemon = (Pokemon) styleList.getSelectedItem();
					team.addPokemon(firstPokemon.getName());
					pokedexlist.remove(firstPokemon);
					System.out.println(team.getTeam());
					frame2.dispose();
				//	System.out.println(fitGraph());
				//	System.out.println(totalFit());
				//	System.out.println(statsGraph());
				//	System.out.println(statsFit());
					finalTeam();
					}
			});
			button1.setBounds(375, 125, 50, 25);
			
			//Labels
			JLabel label = new JLabel("(" + teamStyle + ") " + "Your Team:");
			label.setBounds(325, 160, 150, 25);
			frame2.getContentPane().add(label);
			JLabel a = new JLabel(team.getTeam().get(0).toString());
			a.setBounds(0, 185, 266, 35);
			frame2.getContentPane().add(a);
			JLabel b = new JLabel(team.getTeam().get(1).toString());
			b.setBounds(266, 185, 266, 35);
			frame2.getContentPane().add(b);
			JLabel c = new JLabel(team.getTeam().get(2).toString());
			c.setBounds(532, 185, 266, 35);
			frame2.getContentPane().add(c);
			JLabel d = new JLabel(team.getTeam().get(3).toString());
			d.setBounds(0, 395, 266, 30);
			frame2.getContentPane().add(d);
			JLabel e = new JLabel(team.getTeam().get(4).toString());
			e.setBounds(266, 395, 266, 30);
			frame2.getContentPane().add(e);
			JLabel f = new JLabel("n/a");
			f.setBounds(532, 395, 266, 30);
			frame2.getContentPane().add(f);	
			
			Rectangle r1 = new Rectangle(0,220, 266, 175);
			Rectangle r2 = new Rectangle(266,220, 266, 175);
			Rectangle r3 = new Rectangle(532,220, 266, 175);
			Rectangle r4 = new Rectangle(0,425, 266, 175);
			Rectangle r5 = new Rectangle(266,425, 266, 175);
			Rectangle r6 = new Rectangle(532,425, 266, 175);
			System.out.println(team.getTeam().get(0).returnImgName());
			JLabel img1 = new JLabel(new ImageIcon(team.getTeam().get(0).returnImage()));
			img1.setBounds(r1);
			frame2.getContentPane().add(img1);
			JLabel img2 = new JLabel(new ImageIcon(team.getTeam().get(1).returnImage()));
			img2.setBounds(r2);
			frame2.getContentPane().add(img2);
			JLabel img3 = new JLabel(new ImageIcon(team.getTeam().get(2).returnImage()));
			img3.setBounds(r3);
			frame2.getContentPane().add(img3);
			JLabel img4 = new JLabel(new ImageIcon(team.getTeam().get(3).returnImage()));
			img4.setBounds(r4);
			frame2.getContentPane().add(img4);
			JLabel img5 = new JLabel(new ImageIcon(team.getTeam().get(4).returnImage()));
			img5.setBounds(r5);
			frame2.getContentPane().add(img5);
			
			frame2.getContentPane().add(styleList);
			frame2.getContentPane().add(button1);
			frame2.getContentPane().add(label);
			
			frame2.setVisible(true);
			
		}
		
	
		public void finalTeam() {
			JFrame frame2 = new JFrame("Your Final Team!");
			frame2.setBounds(0, 0, 1700, 800);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.getContentPane().setLayout(null);
			System.out.println("Weaknesses: " + team.weakTable());
			System.out.println("Resistances: " + team.resistanceTable());
			System.out.println("Immunities: " + team.immunityTable());
	//		JLabel label = new JLabel("Your Team:");
	//		label.setBounds(360, 160, 80, 25);
	//		frame2.getContentPane().add(label);
			JLabel a = new JLabel(team.getTeam().get(0).toString());
			a.setBounds(0, 0, 266, 35);
			frame2.getContentPane().add(a);
			JLabel b = new JLabel(team.getTeam().get(1).toString());
			b.setBounds(266, 0, 266, 35);
			frame2.getContentPane().add(b);
			JLabel c = new JLabel(team.getTeam().get(2).toString());
			c.setBounds(532, 0, 266, 35);
			frame2.getContentPane().add(c);
			JLabel d = new JLabel(team.getTeam().get(3).toString());
			d.setBounds(0, 210, 266, 30);
			frame2.getContentPane().add(d);
			JLabel e = new JLabel(team.getTeam().get(4).toString());
			e.setBounds(266, 210, 266, 30);
			frame2.getContentPane().add(e);
			JLabel f = new JLabel(team.getTeam().get(5).toString());
			f.setBounds(532, 210, 266, 30);
			frame2.getContentPane().add(f);	
			
			Rectangle r1 = new Rectangle(0,35, 266, 175);
			Rectangle r2 = new Rectangle(266,35, 266, 175);
			Rectangle r3 = new Rectangle(532,35, 266, 175);
			Rectangle r4 = new Rectangle(0,240, 266, 175);
			Rectangle r5 = new Rectangle(266,240, 266, 175);
			Rectangle r6 = new Rectangle(532,240, 266, 175);
			System.out.println(team.getTeam().get(0).returnImgName());
			JLabel img1 = new JLabel(new ImageIcon(team.getTeam().get(0).returnImage()));
			img1.setBounds(r1);
			frame2.getContentPane().add(img1);
			JLabel img2 = new JLabel(new ImageIcon(team.getTeam().get(1).returnImage()));
			img2.setBounds(r2);
			frame2.getContentPane().add(img2);
			JLabel img3 = new JLabel(new ImageIcon(team.getTeam().get(2).returnImage()));
			img3.setBounds(r3);
			frame2.getContentPane().add(img3);
			JLabel img4 = new JLabel(new ImageIcon(team.getTeam().get(3).returnImage()));
			img4.setBounds(r4);
			frame2.getContentPane().add(img4);
			JLabel img5 = new JLabel(new ImageIcon(team.getTeam().get(4).returnImage()));
			img5.setBounds(r5);
			frame2.getContentPane().add(img5);
			JLabel img6 = new JLabel(new ImageIcon(team.getTeam().get(5).returnImage()));
			img6.setBounds(r6);
			;
			frame2.getContentPane().add(img6);
			
			JLabel weaknesses = new JLabel("Weaknesses: ");
			JLabel wList = new JLabel(team.weakTable().toString());
			weaknesses.setBounds(0, 410, 500, 25);
			wList.setBounds(0, 435, 1700, 25);
			JLabel res = new JLabel("Resistances: ");
			JLabel rList = new JLabel(team.resistanceTable().toString());
			res.setBounds(0, 460, 500, 25);
			rList.setBounds(0, 485, 1700, 25);
			JLabel imu = new JLabel("Immuniites ");
			JLabel iList = new JLabel(team.immunityTable().toString());
			imu.setBounds(0, 510, 500, 25);
			iList.setBounds(0, 535, 1700, 25);
			frame2.getContentPane().add(weaknesses);
			frame2.getContentPane().add(wList);
			frame2.getContentPane().add(res);
			frame2.getContentPane().add(rList);
			frame2.getContentPane().add(imu);
			frame2.getContentPane().add(iList);
			
			frame2.setVisible(true);
		}
		
		
		
		// these are the methods for stats
		public float statScore(Team t, Pokemon p) {
			float result;
			
			float[] x = new float[6];
				x[0] = ((float ) (t.totalHP() + p.getHP())) / ((float) (t.size() + 1));
				x[1] = ((float) (t.totalAtt() + p.getAttack())) / ((float) (t.size() + 1));
				x[2] = ((float) (t.totalDef() + p.getDefense())) / ((float)(t.size() + 1));
				x[3] = ((float) (t.totalSpAtt() + p.getSpecialAttack())) / ((float) (t.size() +1));
				x[4] = ((float) (t.totalSpDef() + p.getSpecialDefense())) / ((float) (t.size() +1));
				x[5] = ((float) (t.totalSpeed() + p.getSpeed())) / ((float) (t.size() + 1));
			
			float[] y = new float[6];
				y[0] = pokedex.avgPokedexHP();
				y[1] = pokedex.avgPokedexAtt();
				y[2] = pokedex.avgPokedexDef();
				y[3] = pokedex.avgPokedexSpAtt();
				y[4] = pokedex.avgPokedexSpDef();
				y[5] = pokedex.avgPokedexSpeed();
				
			float[] z = new float[6];
			switch(teamStyle) {
			case "Balanced":
//				System.out.println("does this work?");
				z[0] = ((float)1)/((float)(6));
				z[1] = ((float)1)/((float)(6));
				z[2] = ((float)1)/((float)(6));
				z[3] = ((float)1)/((float)(6));
				z[4] = ((float)1)/((float)(6));
				z[5] = ((float)1)/((float)(6));

				break;
			case "Offensive":
//				System.out.println("does this work?");
				z[0] = ((float)1)/((float)30);
				z[1] = ((float) 9)/((float) 30);
				z[2] = ((float)1)/((float)30);
				z[3] = ((float) 9)/((float) 30);
				z[4] = ((float)1)/((float)30);
				z[5] = ((float) 9)/((float) 30);

				break;
			case "Defensive":
//				System.out.println("does this work?");
				z[0] = ((float) 9)/((float) 30);
				z[1] = ((float)1)/((float)30);
				z[2] = ((float) 9)/((float) 30);
				z[3] = ((float)1)/((float)30);
				z[4] = ((float) 9)/((float) 30);
				z[5] = ((float)1)/((float)30);

				break;
			}
			
			float[] a = new float[6];
				a[0] = (x[0] - y[0]);
				a[1] = (x[1] - y[1]);
				a[2] = (x[2] - y[2]);
				a[3] = (x[3] - y[3]);
				a[4] = (x[4] - y[4]);
				a[5] = (x[5] - y[5]);
				
			float[] b = new float[6];
				b[0] = (a[0] * z[0]);
				b[1] = (a[1] * z[1]);
				b[2] = (a[2] * z[2]);
				b[3] = (a[3] * z[3]);
				b[4] = (a[4] * z[4]);
				b[5] = (a[5] * z[5]);
			
			result = b[0] + b[1] + b[2] + b[3] + b[4] + b[5];
								
			return result;
			
		}
		
		public Map<Pokemon,Float> statsGraph(){
			Map<Pokemon,Float> result = new HashMap<Pokemon,Float>();
			
			for(Pokemon p : pokedexlist) {
					float score = statScore(team, p);
					result.put(p, score);
				
			}
			return result;
		}
		
		public List<Pokemon> statsFit() {
			Map<Pokemon,Float> graph = statsGraph();
			List<Pokemon> fitList = new ArrayList<Pokemon>();
			
			for(int i = 0; i < 11; i++) {
				Pokemon bestFit = null;
				float compare = 0;
				for(Pokemon p: graph.keySet()) {
					if(graph.get(p) > compare) {
						compare = graph.get(p);
						bestFit = p;
					}
				}
				fitList.add(bestFit);
				graph.remove(bestFit);
			}
			
			return fitList;
		}
		
		
		//these are the methods for types
		
		public float typeScore(Team t, Pokemon p) {
			float result;
			
			//This is T(t)
			float[] a = new float[18]; //T(t)
			float[] b = new float[18]; //T(t,p)
			float[] c = new float[18]; //bias vector
			int i = 0;
			for(PKMNTYPE y : PKMNTYPE.values()) {
			/*	float a1 = (float) t.howManyWeakTo(y);
				float aW = a1 * ((float)-1);
				float a2 = (float) t.howManyResistantTo(y);
				float aR = a2 * ((float)1);
				float a3 = (float) t.howManyImmuneTo(y);
				float aI = a3 * ((float)2);
				a[i] = aW + aR + aI;*/
		
				//
				float b1 = (float) t.howManyWeakTo(y);
				if(p.weaknesses().contains(y)) {
					b1 = b1 + ((float) 1);
				}
				float bW = b1 * ((float)-1);
				float b2 = (float) t.howManyResistantTo(y);
				if(p.resistances().contains(y)) {
					b2 = b2 + ((float)1);
				}
				float bR = b2 * ((float)1);
				float b3 = (float) t.howManyImmuneTo(y);
				if(p.immunities().contains(y)) {
					b3 = b3 +((float)1);
				}
				float bI = b3 * ((float)2);
				b[i] = bW + bR + bI;
				
				//YOU NEED TO INCLUDE THE ADDED POKEMON
				if(b1 == 1) {
					c[i] = (float) 15;
				}
				else if(b1 == 1 && b2 == 0) {
					c[i] = (float) 40;
				}
				else if(b1 >= 2) {
					c[i] = (float) 50;
				}
				else if(b1 == 1 && p.resistances().contains(y)) {
					c[i] = (float) .5;
				}
				else {
					c[i] = (float) 1;
				}
		
				i++;

			}
			
			//This is T(t,P) - T(t)
			float[] x = new float[18];
			for(int k = 0; k < 18; k++) {
				x[k] = b[k] - a[k];
			}
			
			//This is the bias vector
			
			
			float sum = (float) 0;
			//This is the resulting vector
			float[] d = new float[18];
			for(int m = 0; m < 18; m++) {
				d[m] = b[m] * c[m];
				sum += d[m];
			}
			
			result = sum;
			
			return result;
		}
		
		public Map<Pokemon, Float> typeGraph(){
			Map<Pokemon, Float> result = new HashMap<Pokemon, Float>();
			for(Pokemon p : pokedexlist) {
				float score = typeScore(team, p);
				result.put(p, score);
			}
			return result;
		}
		
		public List<Pokemon> typeFit(){
			Map<Pokemon,Float> graph = typeGraph();
			List<Pokemon> fitList = new ArrayList<Pokemon>();
			
			for(int i = 0; i < 11; i++) {
				Pokemon bestFit = null;
				float compare = (float) -200;
				for(Pokemon p: graph.keySet()) {
					if(graph.get(p) > compare) {
						compare = graph.get(p);
						bestFit = p;
					}
				}
				fitList.add(bestFit);
				graph.remove(bestFit);
			}
			
			return fitList;
		}	
		
		public float fitScore(Team t, Pokemon p) {
			float result = (float) ((1.64)*typeScore(t,p)) + statScore(t,p);
			return result;
		}
		
		public Map<Pokemon, Float> fitGraph(){
			Map<Pokemon, Float> result = new HashMap<Pokemon, Float>();
			for(Pokemon p : pokedexlist) {
				float score = fitScore(team, p);
				result.put(p, score);
			}
			return result;
		}
		
		public List<Pokemon> totalFit(){
			Map<Pokemon, Float> graph = fitGraph();
			List<Pokemon> list = new ArrayList<Pokemon>();
			
			for(int i = 0; i < 7; i ++) {
				Pokemon bestFit = null;
				float compare = (float) -100;
				for(Pokemon  p : graph.keySet()) {
					if(graph.get(p) > compare) {
						compare = graph.get(p);
						bestFit = p;
					}
				}
				list.add(bestFit);
				graph.remove(bestFit);
			}
			
			return list;
		}
		
		
	/*	
	public void sixthPokemon() {
		Object[] list2 = totalFit().toArray();
		JFrame frame2 = new JFrame("Pick Your Sixth Pokemon!");
		frame2.setBounds(0, 0, 600, 400);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
//		panel = new JPanel();
//		panel.setPreferredSize(new Dimension(800,600));
		JComboBox styleList = new JComboBox(list2);
		styleList.setBounds(200, 50, 200, 50);
		
		JButton button1 = new JButton("Ok!");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pokemon secondPokemon = (Pokemon) styleList.getSelectedItem();
				System.out.println(secondPokemon.getName());
				team.addPokemon(secondPokemon.getName());
				pokedexlist.remove(secondPokemon);
				System.out.println(team.getTeam());
				System.out.println("Weaknesses: " + team.weakTable());
				System.out.println("Resistances: " + team.resistanceTable());
				System.out.println("Immunities: " + team.immunityTable());
				frame2.dispose();
				JOptionPane.showMessageDialog(null, "Your Pokemon Team is: " + team.getTeam());
			//	System.out.println(typeGraph());
			//	System.out.println(typeFit());
			}
		});
		button1.setBounds(350, 150, 50, 25);
		//Labels
		JLabel label = new JLabel("Your Team:");
		label.setBounds(360, 160, 80, 25);
		frame2.getContentPane().add(label);
		JLabel a = new JLabel(team.getTeam().get(0).getName());
		a.setBounds(0, 185, 266, 35);
		frame2.getContentPane().add(a);
		JLabel b = new JLabel(team.getTeam().get(1).getName());
		b.setBounds(266, 185, 266, 35);
		frame2.getContentPane().add(b);
		JLabel c = new JLabel(team.getTeam().get(2).getName());
		c.setBounds(532, 185, 266, 35);
		frame2.getContentPane().add(c);
		JLabel d = new JLabel(team.getTeam().get(3).getName());
		d.setBounds(0, 395, 266, 30);
		frame2.getContentPane().add(d);
		JLabel e = new JLabel(team.getTeam().get(4).getName());
		e.setBounds(266, 395, 266, 30);
		frame2.getContentPane().add(e);
		JLabel f = new JLabel("n/a");
		f.setBounds(532, 395, 266, 30);
		frame2.getContentPane().add(f);
		
		//Rectangles
		Rectangle r1 = new Rectangle(0,220, 266, 175);
		Rectangle r2 = new Rectangle(266,220, 266, 175);
		Rectangle r3 = new Rectangle(532,220, 266, 175);
		Rectangle r4 = new Rectangle(0,425, 266, 175);
		Rectangle r5 = new Rectangle(266,425, 266, 175);
		Rectangle r6 = new Rectangle(532,425, 266, 175);
//		frame1.add(panel);
		frame2.getContentPane().add(styleList);
		frame2.getContentPane().add(button1);
		
	//	frame1.pack();
		frame2.setVisible(true);
	}
*/

		
	}



