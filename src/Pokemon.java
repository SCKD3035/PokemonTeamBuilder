import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.io.IOException;


public class Pokemon {
	private String Name;
	private ArrayList<PKMNTYPE> typeList = new ArrayList<PKMNTYPE>();
	private PKMNTYPE typeA;
	private PKMNTYPE typeB;
	private int totalStats;
	private int HP;
	private int Attack;
	private int Defense;
	private int SPAttack;
	private int SPDefense;
	private int Speed;
	private int [] stats = new int [6];
	private Matchup matchups = new Matchup();
	public final static String PATH_PREFIX = "GalarDex/";
	private Image Image;
	private String imgName;
	
	
	public Pokemon(String n, PKMNTYPE a, PKMNTYPE b, int h, int aT, int dE, int sA, int sD, int sP) {
		Name = n;
		typeA = a;
		typeB = b;
		typeList.add(a);
		typeList.add(b);
		HP = h;
		Attack = aT;
		Defense = dE;
		SPAttack = sA;
		SPDefense = sD;
		Speed = sP;
		totalStats = HP + Attack + Defense + SPAttack + SPDefense + Speed;
		stats[0] = HP;
		stats[1] = Attack;
		stats[2] = Defense;
		stats[3] = SPAttack;
		stats[4] = SPDefense;
		stats[5] = Speed;
		
		
		Image = getImage(n);
		imgName = PATH_PREFIX+n+".png";
		
	}
	
	
	protected  Image getImage(String fn) {
		Image img = null;
		fn = PATH_PREFIX+fn+".png";
		try {
			
			img = ImageIO.read(this.getClass().getResource(fn));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	}
	
	public void draw(Graphics g, int x, int y, int width, int height) {
		
		g.drawImage(Image, x, y, width, height, null);
	}
	
	public Image returnImage() {
		return Image;
	}
	
	public String returnImgName() {
		return imgName;
	}
	
	public String getName() {
		return Name;
	}
	
	public int getHP() {
		return HP;
	}
	
	public int getAttack() {
		return Attack;
	}
	
	public int getDefense() {
		return Defense;
	}
	
	public int getSpecialAttack() {
		return SPAttack;
	}
	
	public int getSpecialDefense() {
		return SPDefense;
	}
	
	public int getSpeed() {
		return Speed;
	}
	
	public int getTotalStats() {
		return totalStats;
	}
	
	public List<PKMNTYPE> getType(){
		return typeList;
	}
	
	public List<PKMNTYPE> weaknesses(){
		return matchups.weakAgainst(typeA, typeB);
	}
	
	public List<PKMNTYPE> resistances(){
		return matchups.resistantAgainst(typeA, typeB);
	}
	
	public List<PKMNTYPE> immunities(){
		return matchups.immuneAgainst(typeA, typeB);
	}


	@Override
	public String toString() {
		if(typeB != null) {
			return Name + " (" + typeA + " / " + typeB + ") ";
		}
		return Name + " (" + typeA + ") ";
		
	}
	
		
	
	
	
	
	
	
	
}
