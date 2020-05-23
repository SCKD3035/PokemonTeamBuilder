import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Team {

	private List<Pokemon> team = new ArrayList<Pokemon>();
	private Pokedex pokedex;
	private Pokemon first; 
	private int[] teamStats = new int[6];
	private List<Integer> teamHP = new ArrayList<Integer>();
	private List<Integer> teamAttack = new ArrayList<Integer>();
	private List<Integer> teamDefense = new ArrayList<Integer>();
	private List<Integer> teamSpAttack = new ArrayList<Integer>();
	private List<Integer> teamSpDefense = new ArrayList<Integer>();
	private List<Integer> teamSpeed = new ArrayList<Integer>();
	private List<PKMNTYPE> teamWeaknesses = new ArrayList<PKMNTYPE>();
	private List<PKMNTYPE> teamResistances = new ArrayList<PKMNTYPE>();
	private List<PKMNTYPE> teamImmunities = new ArrayList<PKMNTYPE>();
	
	public Team(String n) {
		pokedex = new Pokedex();
		first = pokedex.getPokemon(n);
		team.add(first);
		teamHP.add(first.getHP());
		teamAttack.add(first.getAttack());
		teamDefense.add(first.getDefense());
		teamSpAttack.add(first.getSpecialAttack());
		teamSpDefense.add(first.getSpecialDefense());
		teamSpeed.add(first.getSpeed());
		teamStats[0] = first.getHP();
		teamStats[1] = first.getAttack();
		teamStats[2] = first.getDefense();
		teamStats[3] = first.getSpecialAttack();
		teamStats[4] = first.getSpecialDefense();
		teamStats[5] = first.getSpeed();
		teamWeaknesses.addAll(first.weaknesses());
		teamResistances.addAll(first.resistances());
		teamImmunities.addAll(first.immunities());
	}
	
	public static void main(String args[]) {
		Team t = new Team("Duraludon");
		System.out.println(t.weakTable());
	}
	
	public List<Pokemon> getTeam(){
		return team;
	}
	
	public int size() {
		return team.size();
	}
		
	public int[] getTeamStats() {
		return teamStats;
	}
	
	public List<Integer> getTeamHP(){
		return teamHP;
	}
	
	public List<Integer> getTeamAttack(){
		return teamAttack;
	}
			
	public List<Integer> getTeamDefense(){
		return teamDefense;
	}
	
	public List<Integer> getTeamSpAttack(){
		return teamSpAttack;
	}
	
	public List<Integer> getTeamSpDefense(){
		return teamSpDefense;
	}
	
	public List<Integer> getTeamSpeed(){
		return teamSpeed;
	}
	
	public int totalHP() {
		int num = 0;
		List<Integer> hp = this.getTeamHP();
		for (int i = 0; i < hp.size(); i++) {
			num += hp.get(i);
		}
		return num;
	}
	
	public int totalAtt() {
		int num = 0;
		List<Integer> hp = this.getTeamAttack();
		for (int i = 0; i < hp.size(); i++) {
			num += hp.get(i);
		}
		return num;
	}
	
	public int totalDef() {
		int num = 0;
		List<Integer> hp = this.getTeamDefense();
		for (int i = 0; i < hp.size(); i++) {
			num += hp.get(i);
		}
		return num;
	}
	
	public int totalSpAtt() {
		int num = 0;
		List<Integer> hp = this.getTeamSpAttack();
		for (int i = 0; i < hp.size(); i++) {
			num += hp.get(i);
		}
		return num;
	}
	
	public int totalSpDef() {
		int num = 0;
		List<Integer> hp = this.getTeamSpDefense();
		for (int i = 0; i < hp.size(); i++) {
			num += hp.get(i);
		}
		return num;
	}
	
	public int totalSpeed() {
		int num = 0;
		List<Integer> hp = this.getTeamSpeed();
		for (int i = 0; i < hp.size(); i++) {
			num += hp.get(i);
		}
		return num;
	}
	
	public float avgHP() {
		float num = 0;
		List<Integer> hp = this.getTeamHP();
		for (int i = 0; i < hp.size(); i++) {
			num += hp.get(i);
		}
		float avg = (num / this.size());
		return avg;
	}
	
	public float avgAtt() {
		float num = 0;
		List<Integer> att = this.getTeamAttack();
		for (int i = 0; i < att.size(); i++) {
			num += att.get(i);
		}
		float avg = (num / this.size());
		return avg;
	}
	
	public float avgDef() {
		float num = 0;
		List<Integer> def = this.getTeamDefense();
		for (int i = 0; i < def.size(); i++) {
			num += def.get(i);
		}
		float avg = (num / this.size());
		return avg;
	}
	
	public float avgSPAtt() {
		float num = 0;
		List<Integer> spatt = this.getTeamSpAttack();
		for (int i = 0; i < spatt.size(); i++) {
			num += spatt.get(i);
		}
		float avg = (num / this.size());
		return avg;
	}
	
	public float avgSPDef() {
		float num = 0;
		List<Integer> spdef = this.getTeamSpDefense();
		for (int i = 0; i < spdef.size(); i++) {
			num += spdef.get(i);
		}
		float avg = (num / this.size());
		return avg;
	}
	
	public float avgSpeed() {
		float num = 0;
		List<Integer> speed = this.getTeamSpeed();
		for (int i = 0; i < speed.size(); i++) {
			num += speed.get(i);
		}
		float avg =  (num / this.size());
		return avg;
	}
	
	public List<PKMNTYPE> getTeamWeaknesses(){
		return teamWeaknesses;
	}
	
	public List<PKMNTYPE> getTeamResistances(){
		return teamResistances;
	}
	
	public List<PKMNTYPE> getTeamImmunities(){
		return teamImmunities;
	}
	
	public void addPokemon(String n) {
		if(team.size() == 6) {
			System.out.println("You can't fit anymore Pokemon on your team!");
		}
		else {
			Pokemon p = pokedex.getPokemon(n);
			team.add(p);
			teamHP.add(p.getHP());
			teamAttack.add(p.getAttack());
			teamDefense.add(p.getDefense());
			teamSpAttack.add(p.getSpecialAttack());
			teamSpDefense.add(p.getSpecialDefense());
			teamSpeed.add(p.getSpeed());
			teamStats[0] += p.getHP();
			teamStats[1] += p.getAttack();
			teamStats[2] += p.getDefense();
			teamStats[3] += p.getSpecialAttack();
			teamStats[4] += p.getSpecialDefense();
			teamStats[5] += p.getSpeed();
			addWeaknesses(p);
			addResistances(p);
			addImmunities(p);
		//	teamWeaknesses.addAll(p.weaknesses());
		//	teamResistances.addAll(p.resistances());
		//	teamImmunities.addAll(p.immunities());
		}
		

	}
	
	public void addPokemon(int n) {
		if(team.size() == 6) {
			System.out.println("You can't fit anymore Pokemon on your team!");
		}
		else {
			Pokemon p = pokedex.getPokemon(n);
			team.add(p);
			teamHP.add(p.getHP());
			teamAttack.add(p.getAttack());
			teamDefense.add(p.getDefense());
			teamSpAttack.add(p.getSpecialAttack());
			teamSpDefense.add(p.getSpecialDefense());
			teamSpeed.add(p.getSpeed());
			teamStats[0] += p.getHP();
			teamStats[1] += p.getAttack();
			teamStats[2] += p.getDefense();
			teamStats[3] += p.getSpecialAttack();
			teamStats[4] += p.getSpecialDefense();
			teamStats[5] += p.getSpeed();
			addWeaknesses(p);
			addResistances(p);
			addImmunities(p);
		//	teamWeaknesses.addAll(p.weaknesses());
		//	teamResistances.addAll(p.resistances());
		//	teamImmunities.addAll(p.immunities());

		}
		
	}
	
	public void addWeaknesses(Pokemon p) {
		List<PKMNTYPE> weakList = p.weaknesses();
		for(PKMNTYPE weakness : weakList) {
			if(!teamWeaknesses.contains(weakness)) {
				teamWeaknesses.add(weakness);
			}
		}
	}
	
	public void addResistances(Pokemon p) {
		List<PKMNTYPE> rList = p.resistances();
		for(PKMNTYPE r : rList) {
			if(!teamResistances.contains(r)) {
				teamResistances.add(r);
			}
		}
	}
	
	public void addImmunities(Pokemon p) {
		List<PKMNTYPE> iList = p.immunities();
		for(PKMNTYPE i : iList) {
			if(!teamImmunities.contains(i)) {
				teamImmunities.add(i);
			}
		}
	}
	
	
	public Map<PKMNTYPE, Integer> weakTable(){
		Map<PKMNTYPE, Integer> table = new HashMap<PKMNTYPE, Integer>();
		for(PKMNTYPE type : PKMNTYPE.values()) {
			int i = howManyWeakTo(type);
			table.put(type, i);
		}
		
		return table;
	}
	
	public Map<PKMNTYPE, Integer> resistanceTable(){
		Map<PKMNTYPE, Integer> table = new HashMap<PKMNTYPE, Integer>();
		for(PKMNTYPE type : PKMNTYPE.values()) {
			int i = howManyResistantTo(type);
			table.put(type, i);
		}
		
		return table;
	}
	
	public Map<PKMNTYPE, Integer> immunityTable(){
		Map<PKMNTYPE, Integer> table = new HashMap<PKMNTYPE, Integer>();
		for(PKMNTYPE type : PKMNTYPE.values()) {
			int i = howManyImmuneTo(type);
			table.put(type, i);
		}
		
		return table;
	}
	


	
		
		public int howManyWeakTo(PKMNTYPE t) {
			int count = 0;
			for(Pokemon p : team) {
				if(p.weaknesses().contains(t)) {
					count ++;
				}
			}
			return count;
		}
		
		public List<Pokemon> pokemonWeakTo(PKMNTYPE t){
			List <Pokemon> list = new ArrayList<Pokemon>();
			for(Pokemon p : team) {
				if(p.weaknesses().contains(t)) {
					list.add(p);
				}
			}
			return list;
		}
		
		
		public int howManyResistantTo(PKMNTYPE t) {
			int count = 0;
			for(Pokemon p : team) {
				if(p.resistances().contains(t)) {
					count ++;
				}
			}
			return count;
		}
		
		public List<Pokemon> pokemonResistantTo(PKMNTYPE t){
			List <Pokemon> list = new ArrayList<Pokemon>();
			for(Pokemon p : team) {
				if(p.resistances().contains(t)) {
					list.add(p);
				}
			}
			return list;
		}
		
		public int howManyImmuneTo(PKMNTYPE t) {
			int count = 0;
			for(Pokemon p : team) {
				if(p.immunities().contains(t)) {
					count ++;
				}
			}
			return count;
		}
		
		public List<Pokemon> pokemonImmuneTo(PKMNTYPE t){
			List <Pokemon> list = new ArrayList<Pokemon>();
			for(Pokemon p : team) {
				if(p.immunities().contains(t)) {
					list.add(p);
				}
			}
			return list;
		}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
