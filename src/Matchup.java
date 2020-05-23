import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Matchup {
	
	private static Map<PKMNTYPE, Map<PKMNTYPE, Float>> matchupTable = new HashMap<PKMNTYPE, Map<PKMNTYPE, Float>>();
	
	public Matchup() {
		init();

	}
	
	public static void main(String args []) {
		new Matchup();
		
	}

	
	private void init() {
		// use weakness, go down the vertical column
		Map<PKMNTYPE, Float> normalRow = new HashMap<PKMNTYPE, Float>();
			normalRow.put(PKMNTYPE.FIGHTING, 2f);
			normalRow.put(PKMNTYPE.GHOST, 0f);
		matchupTable.put(PKMNTYPE.NORMAL, normalRow);
		
		Map<PKMNTYPE, Float> fireRow = new HashMap<PKMNTYPE, Float>();
			fireRow.put(PKMNTYPE.FIRE, 0.5f);
			fireRow.put(PKMNTYPE.WATER, 2f);
			fireRow.put(PKMNTYPE.GRASS, 0.5f);
			fireRow.put(PKMNTYPE.ICE, 0.5f);
			fireRow.put(PKMNTYPE.GROUND, 2f);
			fireRow.put(PKMNTYPE.BUG, 0.5f);
			fireRow.put(PKMNTYPE.ROCK, 2f);
			fireRow.put(PKMNTYPE.STEEL, 0.5f);
			fireRow.put(PKMNTYPE.FAIRY, 0.5f);
		matchupTable.put(PKMNTYPE.FIRE, fireRow);
		
		Map<PKMNTYPE, Float> waterRow = new HashMap<PKMNTYPE, Float>();
			waterRow.put(PKMNTYPE.FIRE, 0.5f);
			waterRow.put(PKMNTYPE.WATER, 0.5f);
			waterRow.put(PKMNTYPE.GRASS, 2f);
			waterRow.put(PKMNTYPE.ELECTRIC, 2f);
			waterRow.put(PKMNTYPE.ICE, 0.5f);
			waterRow.put(PKMNTYPE.STEEL, 0.5f);
		matchupTable.put(PKMNTYPE.WATER, waterRow);
		
		Map<PKMNTYPE, Float> grassRow = new HashMap<PKMNTYPE, Float>();
			grassRow.put(PKMNTYPE.FIRE, 2f);
			grassRow.put(PKMNTYPE.WATER, 0.5f);
			grassRow.put(PKMNTYPE.GRASS, 0.5f);
			grassRow.put(PKMNTYPE.ELECTRIC, 0.5f);
			grassRow.put(PKMNTYPE.ICE, 2f);
			grassRow.put(PKMNTYPE.POISON, 2f);
			grassRow.put(PKMNTYPE.GROUND, 0.5f);
			grassRow.put(PKMNTYPE.FLYING, 2f);
			grassRow.put(PKMNTYPE.BUG, 2f);
		matchupTable.put(PKMNTYPE.GRASS, grassRow);
		
		Map<PKMNTYPE, Float> electricRow = new HashMap<PKMNTYPE, Float>();
			electricRow.put(PKMNTYPE.ELECTRIC, 0.5f);
			electricRow.put(PKMNTYPE.GROUND, 2f);
			electricRow.put(PKMNTYPE.FLYING, 0.5f);
			electricRow.put(PKMNTYPE.STEEL, 0.5f);
		matchupTable.put(PKMNTYPE.ELECTRIC, electricRow);
		
		Map<PKMNTYPE, Float> iceRow = new HashMap<PKMNTYPE, Float>();
			iceRow.put(PKMNTYPE.FIRE, 2f);
			iceRow.put(PKMNTYPE.ICE, 0.5f);
			iceRow.put(PKMNTYPE.FIGHTING, 2f);
			iceRow.put(PKMNTYPE.ROCK, 2f);
			iceRow.put(PKMNTYPE.STEEL, 2f);
		matchupTable.put(PKMNTYPE.ICE, iceRow);
		
		Map<PKMNTYPE, Float> fightingRow = new HashMap<PKMNTYPE, Float>();
			fightingRow.put(PKMNTYPE.FLYING, 2f);
			fightingRow.put(PKMNTYPE.PSYCHIC, 2f);
			fightingRow.put(PKMNTYPE.BUG, 0.5f);
			fightingRow.put(PKMNTYPE.ROCK, 0.5f);
			fightingRow.put(PKMNTYPE.DARK, 0.5f);
			fightingRow.put(PKMNTYPE.FAIRY, 2f);
		matchupTable.put(PKMNTYPE.FIGHTING, fightingRow);
		
		Map<PKMNTYPE, Float> poisonRow = new HashMap<PKMNTYPE, Float>();
			poisonRow.put(PKMNTYPE.GRASS, 0.5f);
			poisonRow.put(PKMNTYPE.FIGHTING, 0.5f);
			poisonRow.put(PKMNTYPE.POISON, 0.5f);
			poisonRow.put(PKMNTYPE.GROUND, 2f);
			poisonRow.put(PKMNTYPE.PSYCHIC, 2f);
			poisonRow.put(PKMNTYPE.BUG, 0.5f);
			poisonRow.put(PKMNTYPE.FAIRY, 0.5f);
		matchupTable.put(PKMNTYPE.POISON, poisonRow);
		
		Map<PKMNTYPE, Float> groundRow = new HashMap<PKMNTYPE, Float>();
			groundRow.put(PKMNTYPE.WATER, 2f);
			groundRow.put(PKMNTYPE.GRASS, 2f);
			groundRow.put(PKMNTYPE.ELECTRIC, 0f);
			groundRow.put(PKMNTYPE.ICE, 2f);
			groundRow.put(PKMNTYPE.POISON, 0.5f);
			groundRow.put(PKMNTYPE.ROCK, 0.5f);
		matchupTable.put(PKMNTYPE.GROUND, groundRow);
		
		Map<PKMNTYPE, Float> flyingRow = new HashMap<PKMNTYPE, Float>();
			flyingRow.put(PKMNTYPE.GRASS, 0.5f);
			flyingRow.put(PKMNTYPE.ELECTRIC, 2f);
			flyingRow.put(PKMNTYPE.ICE, 2f);
			flyingRow.put(PKMNTYPE.FIGHTING, 0.5f);
			flyingRow.put(PKMNTYPE.GROUND, 0f);
			flyingRow.put(PKMNTYPE.BUG, 0.5f);
			flyingRow.put(PKMNTYPE.ROCK, 2f);
		matchupTable.put(PKMNTYPE.FLYING, flyingRow);
		
		Map<PKMNTYPE, Float> psychicRow = new HashMap<PKMNTYPE, Float>();
			psychicRow.put(PKMNTYPE.FIGHTING, 0.5f);
			psychicRow.put(PKMNTYPE.PSYCHIC, 0.5f);
			psychicRow.put(PKMNTYPE.BUG, 2f);
			psychicRow.put(PKMNTYPE.GHOST, 2f);
			psychicRow.put(PKMNTYPE.DARK, 2f);
		matchupTable.put(PKMNTYPE.PSYCHIC, psychicRow);
		
		Map<PKMNTYPE, Float> bugRow = new HashMap<PKMNTYPE, Float>();
			bugRow.put(PKMNTYPE.FIRE, 2f);
			bugRow.put(PKMNTYPE.GRASS, 0.5f);
			bugRow.put(PKMNTYPE.FIGHTING, 0.5f);
			bugRow.put(PKMNTYPE.GROUND, 0.5f);
			bugRow.put(PKMNTYPE.FLYING, 2f);
			bugRow.put(PKMNTYPE.ROCK, 2f);
		matchupTable.put(PKMNTYPE.BUG, bugRow);
		
		Map<PKMNTYPE, Float> rockRow = new HashMap<PKMNTYPE, Float>();
			rockRow.put(PKMNTYPE.NORMAL, 0.5f);
			rockRow.put(PKMNTYPE.FIRE, 0.5f);
			rockRow.put(PKMNTYPE.WATER, 2f);
			rockRow.put(PKMNTYPE.GRASS, 2f);
			rockRow.put(PKMNTYPE.FIGHTING, 2f);
			rockRow.put(PKMNTYPE.POISON, 0.5f);
			rockRow.put(PKMNTYPE.GROUND, 2f);
			rockRow.put(PKMNTYPE.FLYING, 0.5f);
			rockRow.put(PKMNTYPE.STEEL, 2f);
		matchupTable.put(PKMNTYPE.ROCK, rockRow);
		
		Map<PKMNTYPE, Float> ghostRow = new HashMap<PKMNTYPE, Float>();
			ghostRow.put(PKMNTYPE.NORMAL, 0f);
			ghostRow.put(PKMNTYPE.FIGHTING, 0f);
			ghostRow.put(PKMNTYPE.POISON, 0.5f);
			ghostRow.put(PKMNTYPE.BUG, 0.5f);
			ghostRow.put(PKMNTYPE.GHOST, 2f);
			ghostRow.put(PKMNTYPE.DARK, 2f);
		matchupTable.put(PKMNTYPE.GHOST, ghostRow);
		
		Map<PKMNTYPE, Float> dragonRow = new HashMap<PKMNTYPE, Float>();
			dragonRow.put(PKMNTYPE.FIRE, 0.5f);
			dragonRow.put(PKMNTYPE.WATER, 0.5f);
			dragonRow.put(PKMNTYPE.GRASS, 0.5f);
			dragonRow.put(PKMNTYPE.ELECTRIC, 0.5f);
			dragonRow.put(PKMNTYPE.ICE, 2f);
			dragonRow.put(PKMNTYPE.DRAGON, 2f);
			dragonRow.put(PKMNTYPE.FAIRY, 2f);
		matchupTable.put(PKMNTYPE.DRAGON, dragonRow);
		
		Map<PKMNTYPE, Float> darkRow = new HashMap<PKMNTYPE, Float>();
			darkRow.put(PKMNTYPE.FIGHTING, 2f);
			darkRow.put(PKMNTYPE.PSYCHIC, 0f);
			darkRow.put(PKMNTYPE.BUG, 2f);
			darkRow.put(PKMNTYPE.GHOST, 0.5f);
			darkRow.put(PKMNTYPE.DARK, 0.5f);
			darkRow.put(PKMNTYPE.FAIRY, 2f);
		matchupTable.put(PKMNTYPE.DARK, darkRow);
		
		Map<PKMNTYPE, Float> steelRow = new HashMap<PKMNTYPE, Float>();
			steelRow.put(PKMNTYPE.NORMAL, 0.5f);
			steelRow.put(PKMNTYPE.FIRE, 2f);
			steelRow.put(PKMNTYPE.GRASS, 0.5f);
			steelRow.put(PKMNTYPE.ICE, 0.5f);
			steelRow.put(PKMNTYPE.FIGHTING, 2f);
			steelRow.put(PKMNTYPE.POISON, 0f);
			steelRow.put(PKMNTYPE.GROUND, 2f);
			steelRow.put(PKMNTYPE.FLYING, 0.5f);
			steelRow.put(PKMNTYPE.PSYCHIC, 0.5f);
			steelRow.put(PKMNTYPE.BUG, 0.5f);
			steelRow.put(PKMNTYPE.ROCK, 0.5f);
			steelRow.put(PKMNTYPE.DRAGON, 0.5f);
			steelRow.put(PKMNTYPE.STEEL, 0.5f);
			steelRow.put(PKMNTYPE.FAIRY, 0.5f);
		matchupTable.put(PKMNTYPE.STEEL, steelRow);
		
		Map<PKMNTYPE, Float> fairyRow = new HashMap<PKMNTYPE, Float>();
			fairyRow.put(PKMNTYPE.FIGHTING, 0.5f);
			fairyRow.put(PKMNTYPE.POISON, 2f);
			fairyRow.put(PKMNTYPE.BUG, 0.5f);
			fairyRow.put(PKMNTYPE.DRAGON, 0f);
			fairyRow.put(PKMNTYPE.DARK, 0.5f);
			fairyRow.put(PKMNTYPE.STEEL, 2f);
		matchupTable.put(PKMNTYPE.FAIRY, fairyRow);
			
			
	}
	
	public List<PKMNTYPE> weakAgainst(PKMNTYPE t1, PKMNTYPE t2){
		List<PKMNTYPE> weakList = new ArrayList<PKMNTYPE>();

		if(t2 == null) {
			Map<PKMNTYPE, Float> innerMap = matchupTable.get(t1);
			
			for(PKMNTYPE y : innerMap.keySet()) {
				if(innerMap.get(y) > 1) {
					weakList.add(y);
				}
			}
			
			return weakList;
		}
		else {
			Map<PKMNTYPE, Float> innerMap1 = matchupTable.get(t1);
			Map<PKMNTYPE, Float> innerMap2 = matchupTable.get(t2);
//			int s1 = innerMap1.size();
//			int s2 = innerMap2.size();
			
			for(PKMNTYPE y : innerMap1.keySet()) {
					if(innerMap2.containsKey(y)) {
						Float amount = innerMap1.get(y) * innerMap2.get(y);
						if(amount > 1) {
							weakList.add(y);
						}
					}
					else {
						if(innerMap1.get(y) > 1) {
							weakList.add(y);
						}
					}
				}
				for (PKMNTYPE y : innerMap2.keySet()) {
					if(!innerMap1.containsKey(y)) {
						if(innerMap2.get(y) >1) {
							if(!weakList.contains(y)) {
								weakList.add(y);
							}
						}
					}	
				}	
			/*else {
				for(PKMNTYPE y : innerMap2.keySet()) {
					if(innerMap1.containsKey(y)) {
						Float amount = innerMap2.get(y) * innerMap1.get(y);
						if(amount > 1) {
							weakList.add(y);
						}
					}
					else {
						if(innerMap)
					}
				}
			}*/	
		}
		return weakList;		
	}
	
	
	public List<PKMNTYPE> resistantAgainst(PKMNTYPE t1 , PKMNTYPE t2){
		List<PKMNTYPE> rList = new ArrayList<PKMNTYPE>();
		if(t2 == null) {
			Map<PKMNTYPE, Float> innerMap = matchupTable.get(t1);
			for(PKMNTYPE y : innerMap.keySet()) {
				if(innerMap.get(y) > 0 && innerMap.get(y) < 1) {
					rList.add(y);
				}
			}
		}
		else {
			Map<PKMNTYPE, Float> innerMap1 = matchupTable.get(t1);
			Map<PKMNTYPE, Float> innerMap2 = matchupTable.get(t2);
	//		int s1 = innerMap1.size();
	//		int s2 = innerMap2.size();
			
			for(PKMNTYPE y : innerMap1.keySet()) {
					if(innerMap2.containsKey(y)) {
						Float amount = innerMap1.get(y) * innerMap2.get(y);
						if(amount > 0 && amount < 1) {
							rList.add(y);
						}
					}
					else {
						if(innerMap1.get(y) > 0 && innerMap1.get(y) < 1) {
							rList.add(y);
						}
					}
				}
				for (PKMNTYPE y : innerMap2.keySet()) {
					if(!innerMap1.containsKey(y)) {
						if(innerMap2.get(y) > 0 && innerMap2.get(y) < 1) {
							if(!rList.contains(y)) {
								rList.add(y);
							}
						}
					}	
				}	
		}
		
		
		return rList;
	}
	
	public List<PKMNTYPE> immuneAgainst(PKMNTYPE t1, PKMNTYPE t2){
		List<PKMNTYPE> iList = new ArrayList<PKMNTYPE>();
		Map<PKMNTYPE, Float> innerMap = matchupTable.get(t1);
		Map<PKMNTYPE, Float> innerMap2 = matchupTable.get(t2);
		for(PKMNTYPE y : innerMap.keySet()) {
			if(innerMap.get(y) == 0) {
				iList.add(y);
			}
		}
		if(t2 != null) {
			for(PKMNTYPE y : innerMap2.keySet()) {
				if(!iList.contains(y)) {
					if(innerMap2.get(y) == 0) {
						iList.add(y);
					}
				}
			}
		}
		
		return iList;
	}
	
	
	
	
}
