	import java.util.ArrayList;
	import java.util.List;
	
	public class Pokedex {
		private List<Pokemon> pokedex = new ArrayList<Pokemon>();
		//still maybe need to add the different Rotom forms and the Silvally types
		private Pokemon Rillaboom = new Pokemon("Rillaboom", PKMNTYPE.GRASS, null, 100, 125, 90, 60, 70, 85);  //1
		private Pokemon Cinderace = new Pokemon("Cinderace", PKMNTYPE.FIRE, null, 80, 116, 75, 65, 75, 119);//2
		private Pokemon Inteleon = new Pokemon("Inteleon", PKMNTYPE.WATER, null, 70, 85, 65, 125, 65, 120);//3
		private Pokemon Orbeetle = new Pokemon("Orbeetle", PKMNTYPE.BUG, PKMNTYPE.PSYCHIC, 60, 45, 110, 80, 120, 90);//4
		private Pokemon Butterfree = new Pokemon("Butterfree", PKMNTYPE.BUG, PKMNTYPE.FLYING, 60, 45, 50, 90, 80, 70);//5
		private Pokemon Vikavolt = new Pokemon("Vikavolt", PKMNTYPE.BUG, PKMNTYPE.ELECTRIC, 77, 70, 90, 145, 75, 43);//6
		private Pokemon Noctowl = new Pokemon("Noctowl", PKMNTYPE.NORMAL, PKMNTYPE.FLYING, 100, 50, 50, 86, 96, 70);//7
		private Pokemon Corviknight = new Pokemon("Corviknight", PKMNTYPE.FLYING, PKMNTYPE.STEEL, 98, 87, 105, 53, 85, 67);//8
		private Pokemon Greedent = new Pokemon("Greedent", PKMNTYPE.NORMAL, null, 120, 95, 95, 55, 75, 20);//9
		private Pokemon Unfezant = new Pokemon("Unfezant", PKMNTYPE.NORMAL, PKMNTYPE.FLYING, 80, 115, 80, 65, 55, 93);//10
		private Pokemon Thievul = new Pokemon("Thievul", PKMNTYPE.DARK, null, 70, 58, 58, 87, 92, 90);//11
		private Pokemon Obstagoon = new Pokemon("Obstagoon", PKMNTYPE.DARK, PKMNTYPE.NORMAL, 93, 90, 101, 60, 81, 95);//12
		private Pokemon Dubwool = new Pokemon("Dubwool", PKMNTYPE.NORMAL, null, 72, 80, 100, 60, 90, 88);//13
		private Pokemon Ludicolo = new Pokemon("Ludicolo", PKMNTYPE.WATER, PKMNTYPE.GRASS, 80, 70, 70, 90, 100, 70);//14
		private Pokemon Shiftry = new Pokemon("Shiftry", PKMNTYPE.GRASS, PKMNTYPE.DARK, 90, 100, 60, 90, 60, 80);//15
		private Pokemon Drednaw = new Pokemon("Drednaw", PKMNTYPE.WATER, PKMNTYPE.ROCK, 90, 115, 90, 48, 68, 74);//16
		private Pokemon Liepard = new Pokemon("Liepard", PKMNTYPE.DARK, null, 64, 88, 50, 88, 50, 106);//17
		private Pokemon Boltund = new Pokemon("Boltund", PKMNTYPE.ELECTRIC, null, 69, 90, 60, 90, 60, 121);//18
		private Pokemon Diggersby = new Pokemon("Diggersby", PKMNTYPE.NORMAL, PKMNTYPE.GROUND, 85, 56, 77, 50, 77, 78);//19
		private Pokemon Ciccino = new Pokemon("Ciccino", PKMNTYPE.NORMAL, null, 75, 95, 60, 65, 60, 115);//20
		private Pokemon Tsareena = new Pokemon("Tsareena", PKMNTYPE.GRASS, null, 72, 120, 98, 50, 98, 72);//21
		private Pokemon Vileplume = new Pokemon("Vileplume", PKMNTYPE.GRASS, PKMNTYPE.POISON, 75, 80, 85, 110, 90, 50);//22
		private Pokemon Bellossom = new Pokemon("Bellossom", PKMNTYPE.GRASS, null, 75, 80, 95, 90, 100, 50);//23
		private Pokemon Roserade = new Pokemon("Roserade", PKMNTYPE.GRASS, PKMNTYPE.POISON, 60, 70, 65, 125, 105, 90);//24
		private Pokemon Pelipper = new Pokemon("Pelipper", PKMNTYPE.WATER, PKMNTYPE.FLYING, 60, 50, 100, 95, 70, 65);//25
		private Pokemon Galvantula = new Pokemon("Galvantula", PKMNTYPE.BUG, PKMNTYPE.ELECTRIC, 70, 77, 60, 97, 60, 108);//26
		private Pokemon Manectric = new Pokemon("Manectric", PKMNTYPE.ELECTRIC, null, 70, 75, 60, 105, 60, 105);//27
		private Pokemon Ninetales = new Pokemon("Ninetales", PKMNTYPE.FIRE, null, 73, 76, 75, 81, 100, 100);//28
		private Pokemon Arcanine = new Pokemon("Arcanine", PKMNTYPE.FIRE, null, 90, 110, 80, 100, 80, 95);//29
		private Pokemon Vanilluxe = new Pokemon("Vanilluxe", PKMNTYPE.ICE, null, 71, 95, 85, 110, 95, 79);//30
		private Pokemon Mamoswine = new Pokemon("Mamoswine", PKMNTYPE.ICE, PKMNTYPE.GROUND, 110, 130, 80, 70, 60, 80);//31
		private Pokemon Delibird = new Pokemon("Delibird", PKMNTYPE.ICE, PKMNTYPE.FLYING, 45, 55, 45, 65, 45, 75);//32
		private Pokemon Glailie = new Pokemon("Glailie", PKMNTYPE.ICE, null, 80, 80, 80, 80, 80, 80);//33
		private Pokemon Froslass = new Pokemon("Froslass", PKMNTYPE.ICE, PKMNTYPE.GHOST, 70, 80, 70, 80, 70, 110);//34
		private Pokemon Claydol = new Pokemon("Claydol", PKMNTYPE.GROUND, PKMNTYPE.PSYCHIC, 60, 70, 105, 70, 120, 75);//35
		private Pokemon Mudsdale = new Pokemon("Mudsdale", PKMNTYPE.GROUND, null, 100, 125, 100,55, 85,	35);//36
		private Pokemon Crustle = new Pokemon("Crustle", PKMNTYPE.BUG, PKMNTYPE.ROCK, 70, 105, 125,	65,	75,	45);//37
		private Pokemon Golurk = new Pokemon("Golurk", PKMNTYPE.GROUND, PKMNTYPE.GHOST, 89,	124, 80, 55, 80, 55);//38
		private Pokemon Musharna = new Pokemon("Musharna", PKMNTYPE.PSYCHIC, null, 116,	55,	85,	107, 95, 29);//39
		private Pokemon Xatu = new Pokemon("Xatu", PKMNTYPE.PSYCHIC, PKMNTYPE.FLYING, 65,75	, 70, 95, 70, 95);//40
		private Pokemon Bewear = new Pokemon("Bewear", PKMNTYPE.NORMAL, PKMNTYPE.FIGHTING, 120,	125, 80, 55, 60, 60);//41
		private Pokemon Abomasnow = new Pokemon("Abomasnow", PKMNTYPE.GRASS, PKMNTYPE.ICE, 90,	92,	75,	92,	85,	60);//42
		private Pokemon Kingler = new Pokemon("Kingler", PKMNTYPE.WATER, null, 55,	130,	115,	50,	50,	75);//43
		private Pokemon Quagsire = new Pokemon("Quagsire", PKMNTYPE.WATER, PKMNTYPE.GROUND, 95,	85,	85,	65,	65,	35);//44
		private Pokemon Crawdaunt = new Pokemon("Crawdaunt", PKMNTYPE.WATER, PKMNTYPE.DARK, 63,	120,	85,	90,	55,	55);//45
		private Pokemon Ninjask = new Pokemon("Ninjask", PKMNTYPE.BUG, PKMNTYPE.FLYING, 61,	90,	45,	50,	50,	160);//46
		private Pokemon Shedinja = new Pokemon("Shedinja", PKMNTYPE.BUG, PKMNTYPE.GHOST, 1,	90,	45,	30,	30,	40);//47
		private Pokemon Hitmonlee = new Pokemon("Hitmonlee", PKMNTYPE.FIGHTING, null, 50,	120,	53,	35,	110,	87);//48
		private Pokemon Hitmonchan = new Pokemon("Hitmonchan", PKMNTYPE.FIGHTING, null, 50,	105,	79,	35,	110,	76);//49
		private Pokemon Hitmontop = new Pokemon("Hitmontop", PKMNTYPE.FIGHTING, null, 50,	95,	95,	35,	110,	70);//50
		private Pokemon Pangoro = new Pokemon("Pangoro", PKMNTYPE.DARK, PKMNTYPE.FIGHTING, 95, 124,	78,	69,	71,	58);//51
		private Pokemon Klinklang = new Pokemon("Klinklang", PKMNTYPE.STEEL, null, 60,	100,	115,	70,	85,	90);//52
		private Pokemon Vespiqueen = new Pokemon("Vespiqueen", PKMNTYPE.BUG, PKMNTYPE.FLYING, 70,	80,	102,	80,	102,	40);//53
		private Pokemon Bronzong = new Pokemon("Bronzong", PKMNTYPE.STEEL, PKMNTYPE.PSYCHIC, 67,	89,	116,	79,	116,	33);//54
		private Pokemon Gardevoir = new Pokemon("Gardevoir", PKMNTYPE.PSYCHIC, PKMNTYPE.FAIRY, 68,	65,	65,	125,	115,	80);//55
		private Pokemon Gallade = new Pokemon("Gallade", PKMNTYPE.PSYCHIC, PKMNTYPE.FIGHTING, 68,	125,	65,	65,	115,	80);//56
		private Pokemon Drifblim = new Pokemon("Drifblim", PKMNTYPE.GHOST, PKMNTYPE.FLYING, 150,	80,	44,	90,	54,	80);//57
		private Pokemon Eldegoss = new Pokemon("Eldegoss", PKMNTYPE.GRASS, null, 60,	50,	90,	80,	120,	60);//58
		private Pokemon Cherrim = new Pokemon("Cherrim", PKMNTYPE.GRASS, null, 70,	60,	70,	87,	78,	85);//59
		private Pokemon Skunktank = new Pokemon("Skunktank", PKMNTYPE.POISON, PKMNTYPE.DARK, 103,	93,	67,	71,	61,	84);//60
		private Pokemon Seismitoad = new Pokemon("Seismitoad", PKMNTYPE.WATER, PKMNTYPE.GROUND, 105,	95,	75,	85,	75,	74);//61
		private Pokemon Dusknoir = new Pokemon("Dusknoir", PKMNTYPE.GHOST, null, 45,	100,	135,	65,	135,	45);//62
		private Pokemon Machamp = new Pokemon("Machamp", PKMNTYPE.FIGHTING, null, 90,	130,	80,	65,	85,	55);//63
		private Pokemon Gengar = new Pokemon("Gengar", PKMNTYPE.GHOST, PKMNTYPE.POISON, 60,	65,	60,	130,	75,	110);//64
		private Pokemon Gyrados = new Pokemon("Gyrados", PKMNTYPE.WATER, PKMNTYPE.FLYING, 95,	125,	79,	60,	100,	81);//65
		private Pokemon Seaking = new Pokemon("Seaking", PKMNTYPE.WATER, null, 80,	92,	65,	65,	80,	68);//66
		private Pokemon Octillery = new Pokemon("Octillery", PKMNTYPE.WATER, null, 75,	105,	75,	105,	75,	45);//67
		private Pokemon Cloyster = new Pokemon("Cloyster", PKMNTYPE.WATER, PKMNTYPE.ICE, 50,	95,	180,	85,	45,	70);//68
		private Pokemon Milotic = new Pokemon("Milotic", PKMNTYPE.WATER, null, 95,	60,	79,	100,	125,	81);//69
		private Pokemon Basculin = new Pokemon("Basculin", PKMNTYPE.WATER, null, 70,	92,	65,	80,	55,	98);//70
		private Pokemon Wishiwashi = new Pokemon("Wishiwashi", PKMNTYPE.WATER, null, 45,	140,	130,	140,	135,	30);//71
		private Pokemon Pyukumuku = new Pokemon ("Pyukumuku", PKMNTYPE.WATER, null, 55,	60,	130,	30,	130,	5);//72
		private Pokemon Garbodor = new Pokemon("Garbodor", PKMNTYPE.POISON, null, 80,	95,	82,	60,	82,	75);//73
		private Pokemon Centiskorch = new Pokemon("Centiskorch", PKMNTYPE.FIRE, PKMNTYPE.BUG, 100,	115,	65,	90,	90,	65);//74
		private Pokemon Coalossal = new Pokemon("Coalossal", PKMNTYPE.ROCK, PKMNTYPE.FIRE, 110,	80,	120,	80,	90,	30);//75
		private Pokemon Dugtrio = new Pokemon("Dugtrio", PKMNTYPE.GROUND, null, 35,	100,	50,	50,	70,	120);//76
		private Pokemon Excadrill = new Pokemon("Excadrill", PKMNTYPE.GROUND, PKMNTYPE.STEEL, 110,	135,	60,	50,	65,	88);//77
		private Pokemon Gigalith = new Pokemon("Gigalith", PKMNTYPE.ROCK, null, 85,	135,	130,	60,	80,	25);//78
		private Pokemon Conkeldurr = new Pokemon("Conkeldurr", PKMNTYPE.FIGHTING, null, 105,	140,	95,	55,	65,	45);//79
		private Pokemon Swoobat = new Pokemon("Swoobat", PKMNTYPE.PSYCHIC, PKMNTYPE.FLYING, 67,	57,	55,	77,	55,	114);//80
		private Pokemon Noivern = new Pokemon("Noivern", PKMNTYPE.FLYING, PKMNTYPE.DRAGON, 85,	70,	80,	97,	80,	123);//81
		private Pokemon Steelix = new Pokemon("Steelix", PKMNTYPE.STEEL, PKMNTYPE.GROUND, 75,	85,	200,	55,	65,	30);//82
		private Pokemon Barraskewda = new Pokemon("Barraskewda", PKMNTYPE.WATER, null, 61,	123,	60,	60,	50,	136);//83
		private Pokemon Perrskerker = new Pokemon("Perrserker", PKMNTYPE.STEEL, null, 70,	110,	100,	50,	60,	50);//84
		private Pokemon Persian = new Pokemon("Persian", PKMNTYPE.NORMAL, null, 65,	70,	60,	65,	65,	115);//85
		private Pokemon Alcremie = new Pokemon("Alcremie", PKMNTYPE.FAIRY, null, 65,	60,	75,	110,	121,	64);//86
		private Pokemon Ribombee = new Pokemon("Ribombee", PKMNTYPE.BUG, PKMNTYPE.FAIRY, 60,	55,	60,	95,	70,	124);//87
		private Pokemon Ferrothorn = new Pokemon("Ferrothorn", PKMNTYPE.STEEL, PKMNTYPE.GRASS, 74,	94,	131,	54,	116,	20);//88
		private Pokemon Gourgeist = new Pokemon("Gourgeist", PKMNTYPE.GHOST, PKMNTYPE.GRASS, 65,	90,	122,	58,	75,	84);//89
		private Pokemon Raichu = new Pokemon("Raichu",PKMNTYPE.ELECTRIC, null, 60,	90,	55,	90,	80,	110);//90
		private Pokemon Vaporeon = new Pokemon("Vaporeon", PKMNTYPE.WATER, null, 130,	65,	60,	110,	95,	65);//91
		private Pokemon Jolteon = new Pokemon ("Jolteon", PKMNTYPE.ELECTRIC, null, 65,	65,	60,	110,	95,	130);//92
		private Pokemon Flareon = new Pokemon("Flareon", PKMNTYPE.FIRE, null, 65,	130,	60,	95,	110,	65);//93
		private Pokemon Espeon = new Pokemon("Espeon", PKMNTYPE.PSYCHIC, null, 65,	65,	60,	130,	95,	110);//94
		private Pokemon Umbreon = new Pokemon("Umbreon", PKMNTYPE.DARK, null, 95,	65,	110,	60,	130,	65);//95
		private Pokemon Leafeon = new Pokemon("Leafeon", PKMNTYPE.GRASS, null, 65,	110,	130,	60,	65,	95);//96
		private Pokemon Glaceon = new Pokemon("Glaceon", PKMNTYPE.ICE, null, 65,	60,	110,	130,	95,	65);//97
		private Pokemon Sylveon = new Pokemon("Sylveon", PKMNTYPE.FAIRY, null, 95,	65,	65,	110,	130,	60);//98
		private Pokemon Flapple = new Pokemon("Flapple", PKMNTYPE.GRASS, PKMNTYPE.DRAGON, 70,	110,	80,	95,	60,	70);//99
		private Pokemon Appletun = new Pokemon("Appletun", PKMNTYPE.GRASS, PKMNTYPE.DRAGON, 110,	85,	80,	100,	80,	30);//100
		private Pokemon Meowstic = new Pokemon("Meowstic", PKMNTYPE.PSYCHIC, null, 74,	48,	76,	83,	81,	104);//101
		private Pokemon Slurpuff = new Pokemon("Slurpuff", PKMNTYPE.FAIRY, null, 82,	80,	86,	85,	75,	72); //102
		private Pokemon Aromatisse = new Pokemon("Aromatisse", PKMNTYPE.FAIRY, null, 101,	72,	72,	99,	89,	29);//103
		private Pokemon Araquanid = new Pokemon("Araquanid", PKMNTYPE.WATER, PKMNTYPE.BUG, 68,	70,	92,	50,	132,	42);//104
		private Pokemon Wobbuffet = new Pokemon("Wobbuffet", PKMNTYPE.PSYCHIC, null, 190,	33,	58,	33,	58,	33);//105
		private Pokemon Sirfetchd = new Pokemon("Sirfetch'd", PKMNTYPE.FIGHTING, null, 62,	135,	95,	68,	82,	65);//106
		private Pokemon Lanturn = new Pokemon("Lanturn", PKMNTYPE.WATER, PKMNTYPE.ELECTRIC, 125,	58,	58,	76,	76,	67);//107
		private Pokemon Toxicroak = new Pokemon("Toxicroak", PKMNTYPE.POISON, PKMNTYPE.FIGHTING, 83,	106,	65,	86,	65,	85);//108
		private Pokemon Scrafty = new Pokemon("Scrafty", PKMNTYPE.DARK, PKMNTYPE.FIGHTING, 65,	90,	115,	45,	115,	58);//109
		private Pokemon Stunfisk = new Pokemon("Stunfisk", PKMNTYPE.GROUND, PKMNTYPE.STEEL, 109,	81,	99,	66,	84,	32);//110
		private Pokemon Shuckle = new Pokemon("Shuckle", PKMNTYPE.BUG, PKMNTYPE.ROCK, 20,	10,	230,	10,	230,	5);//111
		private Pokemon Whiscash = new Pokemon("Whiscash", PKMNTYPE.WATER, PKMNTYPE.GROUND, 110,	78,	73,	76,	71,	60);//112
		private Pokemon Gastrodon = new Pokemon("Gastrodon", PKMNTYPE.WATER, PKMNTYPE.GROUND, 111,	83, 68,	92,	82,	39);//113
		private Pokemon Golisopod = new Pokemon("Golisopod", PKMNTYPE.BUG, PKMNTYPE.WATER, 75,	125,	140,	60,	90,	40);//114
		private Pokemon Barbaracle = new Pokemon("Barbaracle", PKMNTYPE.ROCK, PKMNTYPE.WATER, 72,	105,	115,	54,	86,	68);//115
		private Pokemon Cursola = new Pokemon("Cursola", PKMNTYPE.GHOST, null, 60,	95,	50,	145,	130,	30);//116
		private Pokemon Grimmsnarl = new Pokemon("Grimmsnarl", PKMNTYPE.DARK, PKMNTYPE.FAIRY, 95,	120,	65,	95,	75,	60);//117
		private Pokemon Hatterene = new Pokemon("Hatterene", PKMNTYPE.PSYCHIC, PKMNTYPE.FAIRY, 57	,90,	95,	136,	103,	29);//118
		private Pokemon Salazzle = new Pokemon("Salazzle", PKMNTYPE.POISON, PKMNTYPE.FIRE, 68,	64,	60,	111,	60,	117);//119
		private Pokemon Bisharp = new Pokemon("Bisharp", PKMNTYPE.DARK, PKMNTYPE.STEEL, 65,	125,	100,	60,	70,	70);//120
		private Pokemon Throh = new Pokemon("Throh", PKMNTYPE.FIGHTING, null, 120,	100,	85,	30,	85,	45);//121
		private Pokemon Sawk = new Pokemon("Sawk", PKMNTYPE.FIGHTING, null, 75,	125,	75,	30,	75,	85);//122
		private Pokemon Weezing = new Pokemon("Weezing", PKMNTYPE.POISON, PKMNTYPE.FAIRY, 65,	90,	120,	85,	70,	60);//123
		private Pokemon Sudowoodo = new Pokemon("Sudowoodo", PKMNTYPE.ROCK, null, 70,	100,	115,	30,	65,	30);//124
		private Pokemon Clefable = new Pokemon("Clefable", PKMNTYPE.FAIRY, null, 95,	70,	73,	95,	90,	60);//125
		private Pokemon Togekiss = new Pokemon("Togekiss", PKMNTYPE.FAIRY, PKMNTYPE.FLYING, 85,	50,	95,	120,	115,	80);//126
		private Pokemon Snorlax = new Pokemon("Snorlax", PKMNTYPE.NORMAL, null, 160,	110,	65,	65,	110,	30);//127
		private Pokemon Whimsicott = new Pokemon("Whimsicott", PKMNTYPE.GRASS, PKMNTYPE.FAIRY, 60,	67,	85,	77,	75,	116);//128
		private Pokemon Rhyperior = new Pokemon("Rhyperior", PKMNTYPE.GROUND, PKMNTYPE.ROCK, 115,	140,	130,	55,	55,	40);//129
		private Pokemon Gothitelle = new Pokemon("Gothitelle", PKMNTYPE.PSYCHIC, null, 70,	55,	95,	95,	110,	65);//130
		private Pokemon Reuniclus = new Pokemon("Reuniclus", PKMNTYPE.PSYCHIC, null, 110,	65,	75,	125,	85,	30);//131
		private Pokemon Escavalier = new Pokemon("Escavalier", PKMNTYPE.STEEL, PKMNTYPE.BUG, 70,	135,	105,	60,	105,	20);//132
		private Pokemon Accelgor = new Pokemon("Accelgor", PKMNTYPE.BUG, null, 80,	70,	40,	100,	60,	145);//133
		private Pokemon Beheeyem = new Pokemon("Beheeyem", PKMNTYPE.PSYCHIC, null, 75,	75,	75,	125,	95,	40);//134
		private Pokemon Beartic = new Pokemon("Beartic", PKMNTYPE.ICE, null, 95,	130,	80,	70,	80,	50);//135
		private Pokemon Braviary = new Pokemon("Braviary", PKMNTYPE.NORMAL, PKMNTYPE.FLYING, 100,	123,	75,	57,	75,	80);//136
		private Pokemon Mandibuzz = new Pokemon("Mandibuzz", PKMNTYPE.DARK, PKMNTYPE.FLYING, 110,	65,	105,	55,	95,	80);//137
		private Pokemon Drapion = new Pokemon("Drapion", PKMNTYPE.POISON, PKMNTYPE.DARK, 70,	90,	110	,60,	75,	95);//138
		private Pokemon Chandelure = new Pokemon("Chandelure", PKMNTYPE.GHOST, PKMNTYPE.FIRE, 60,	55,	90,	145,	90,	80);//139
		private Pokemon Malamar = new Pokemon("Malamar", PKMNTYPE.DARK, PKMNTYPE.PSYCHIC, 86,	92,	88,	68,	75,	73);//140
		private Pokemon Weavile = new Pokemon("Weavile", PKMNTYPE.DARK, PKMNTYPE.ICE, 70,	120,	65,	45,	85,	125);//141
		private Pokemon Sableye = new Pokemon("Sableye", PKMNTYPE.DARK, PKMNTYPE.GHOST, 50,	75,	75,	65,	65,	50);//142
		private Pokemon Mawile = new Pokemon("Mawile", PKMNTYPE.STEEL, PKMNTYPE.FAIRY, 50,	85,	85,	55,	55,	50);//143
		private Pokemon Maractus = new Pokemon("Maractus", PKMNTYPE.GRASS, null, 75,	86,	67,	106,	67,	60);//144
		private Pokemon Sigilyph = new Pokemon("Sigilyph", PKMNTYPE.PSYCHIC, PKMNTYPE.FLYING, 72,	58,	80,	103,	80,	97);//145
		private Pokemon Lucario = new Pokemon("Lucario", PKMNTYPE.FIGHTING, PKMNTYPE.STEEL, 70,	110,	70,	115,	70,	90);//146
		private Pokemon Torkoal = new Pokemon("Torkoal", PKMNTYPE.FIRE, null, 70,	85,	140,	85,	70,	20);//147
		private Pokemon Mimikyu = new Pokemon("Mimikyu", PKMNTYPE.GHOST, PKMNTYPE.FAIRY, 55,	90,	80,	50,	105,	96);//148
		private Pokemon Copperajah = new Pokemon("Copperajah", PKMNTYPE.STEEL, null, 122,	130,	69,	80,	69,	30);//149
		private Pokemon Qwilfish = new Pokemon("Qwilfish", PKMNTYPE.WATER, PKMNTYPE.POISON, 65,	95,	85,	55,	55,	85);//150
		private Pokemon Jellicent = new Pokemon("Jellicent", PKMNTYPE.WATER, PKMNTYPE.GHOST, 100,	60,	70,	85,	105,	60);//151
		private Pokemon Toxapex = new Pokemon("Toxapex", PKMNTYPE.POISON, PKMNTYPE.WATER, 50,	63,	152,	53,	142,	35);//152
		private Pokemon Cramorant = new Pokemon ("Cramorant", PKMNTYPE.WATER, PKMNTYPE.FLYING, 70,	85,	55,	85,	95,	85);//153
		private Pokemon Toxtricity = new Pokemon("Toxtricity", PKMNTYPE.ELECTRIC, PKMNTYPE.POISON, 75,	98,	70,	114,	70,	75);//154
		private Pokemon Sandaconda = new Pokemon("Sandaconda", PKMNTYPE.GROUND, null, 72,	107,	125,	65	,70,	71);//155
		private Pokemon Hippowdon = new Pokemon("Hippowdon", PKMNTYPE.GROUND, null, 108,	112,	118,	68,	72,	47);//156
		private Pokemon Durant = new Pokemon("Durant", PKMNTYPE.BUG, PKMNTYPE.STEEL, 58,	109,	112,	48,	48,	109);//157
		private Pokemon Heatmor = new Pokemon("Heatmor", PKMNTYPE.FIRE, null, 85,	97,	66,	105,	66,	65);//158
		private Pokemon Heliolisk = new Pokemon("Heliolisk", PKMNTYPE.ELECTRIC, PKMNTYPE.NORMAL, 62,	55,	52,	109,	94,	109);//159
		private Pokemon Hawlucha = new Pokemon("Hawlucha", PKMNTYPE.FIGHTING, PKMNTYPE.FLYING, 78,	92,	75,	74,	63,	118);//160
		private Pokemon Flygon = new Pokemon("Flygon", PKMNTYPE.DRAGON, PKMNTYPE.GROUND, 80,	100,	80,	80,	80,	100);//161
		private Pokemon Haxorus = new Pokemon("Haxorus", PKMNTYPE.DRAGON, null, 76,	147,	90,	60,	70,	97);//162
		private Pokemon Runerigus = new Pokemon("Runerigus", PKMNTYPE.GHOST, PKMNTYPE.GROUND, 58,	95,	145,	50,	105,	30);//163
		private Pokemon Cofragigus = new Pokemon("Cofragigus", PKMNTYPE.GHOST, null, 58,	50,	145,	95,	105,	30);//164
		private Pokemon Aegislash = new Pokemon("Aegislash", PKMNTYPE.STEEL, PKMNTYPE.GHOST, 60,	50,	140,	50,	140,	60);//165
		private Pokemon Rapidash = new Pokemon("Rapidash", PKMNTYPE.PSYCHIC, PKMNTYPE.FAIRY, 65,	100,	70,	80,	80,	10);//166
		private Pokemon Polteageist = new Pokemon("Polteageist", PKMNTYPE.GHOST, null, 60,	65,	65,	134,	114,	70);//167
		private Pokemon Indeedee = new Pokemon("Indeedee", PKMNTYPE.PSYCHIC, PKMNTYPE.NORMAL, 60,	65,	55,	105,	95,	95);//168
		private Pokemon Trevenent = new Pokemon("Trevenant", PKMNTYPE.GRASS, PKMNTYPE.GHOST, 85,	110,	76,	65,	82,	56);//169
		private Pokemon Shiinotic = new Pokemon("Shiinotic", PKMNTYPE.GRASS, PKMNTYPE.FAIRY, 60,	45,	80,	90,	100,	30);//170
		private Pokemon Oranguru = new Pokemon("Oranguru", PKMNTYPE.PSYCHIC, PKMNTYPE.NORMAL, 90,	60,	80,	90,	110,	60);//171
		private Pokemon Passimian = new Pokemon("Passimian", PKMNTYPE.FIGHTING, null, 100,	120,	90,	40,	60,	80); //172
		private Pokemon Morpeko = new Pokemon("Morpeko", PKMNTYPE.DARK, PKMNTYPE.ELECTRIC, 58,	95,	58,	70,	58,	97);//173
		private Pokemon Falinks = new Pokemon("Falinks", PKMNTYPE.FIGHTING, null, 65,	100,	100,	70,	60,	75);//174
		private Pokemon Drampa = new Pokemon("Drampa", PKMNTYPE.DRAGON, PKMNTYPE.NORMAL, 78,	60,	85,	135,	91,	36);//175
		private Pokemon Turtonator = new Pokemon("Turtonator", PKMNTYPE.DRAGON, PKMNTYPE.FIRE, 60,	78,	135,	91,	85,	36);//176
		private Pokemon Togedemaru = new Pokemon("Togedemaru", PKMNTYPE.ELECTRIC, PKMNTYPE.STEEL, 65,	98,	63,	40,	73,	96);//177
		private Pokemon Frosmoth = new Pokemon("Frosmoth", PKMNTYPE.BUG, PKMNTYPE.ICE, 70,	65,	60,	125,	90,	65);//178
		private Pokemon Grapploct = new Pokemon("Grapploct", PKMNTYPE.FIGHTING, null, 80,	118,	90,	70,	80,	42);//179
		private Pokemon Pincurchin = new Pokemon("Pincurchin", PKMNTYPE.ELECTRIC, null, 48,	101,	95,	91,	85,	15);//180
		private Pokemon Mantine = new Pokemon("Mantine", PKMNTYPE.WATER, PKMNTYPE.FLYING, 85,	40,	70,	80,	140,	70);//181
		private Pokemon Wailord = new Pokemon("Wailord", PKMNTYPE.WATER, null, 170,	90,	45,	90,	45,	60);//182
		private Pokemon Avalugg = new Pokemon("Avalugg", PKMNTYPE.ICE, null, 95,	117,	184,	44,	46,	28);//183
		private Pokemon Dhelmise = new Pokemon("Dhelmise", PKMNTYPE.GHOST, PKMNTYPE.GRASS, 70	,131,	100,	86,	90,	40);//184
		private Pokemon Lapras = new Pokemon("Lapras", PKMNTYPE.WATER, PKMNTYPE.ICE, 130,	85,	80,	85,	95,	60); //185
		private Pokemon Lunatone = new Pokemon("Lunatone", PKMNTYPE.ROCK, PKMNTYPE.PSYCHIC, 90,	55,	65,	95,	85,	70); //186
		private Pokemon Solrock = new Pokemon("Solrock", PKMNTYPE.ROCK, PKMNTYPE.PSYCHIC, 90,	95,	85,	55,	65,	70);//187
		private Pokemon MrRime = new Pokemon("Mr. Rime", PKMNTYPE.ICE, PKMNTYPE.PSYCHIC, 80,	85,	75,	110,	100,	70);//188
		private Pokemon Darmanitan = new Pokemon("Darmanitan", PKMNTYPE.ICE, null, 105,	140,	55,	30,	55,	95);//189
		private Pokemon Stonjourner = new Pokemon("Stonjourner", PKMNTYPE.ROCK, null, 100,	125,	135,	20,	20,	70);//190
		private Pokemon Eiscue = new Pokemon("Eiscue", PKMNTYPE.ICE, null, 75,	80,	110,	65,	90,	50);//191
		private Pokemon Duraludon = new Pokemon("Duraludon", PKMNTYPE.STEEL, PKMNTYPE.DRAGON, 70,	95,	115,	120,	50,	85);//192
		private Pokemon Rotom = new Pokemon("Rotom", PKMNTYPE.ELECTRIC, PKMNTYPE.GHOST, 50,	50,	77,	95,	77,	91);//193
		private Pokemon Ditto = new Pokemon("Ditto", PKMNTYPE.NORMAL, null, 48,	48,	48,	48,	48,	48);//194
		private Pokemon Dracozolt = new Pokemon("Dracozolt", PKMNTYPE.ELECTRIC, PKMNTYPE.DRAGON, 90,	100,	90,	80,	70,	75);//195
		private Pokemon Arctozolt = new Pokemon("Arctozolt", PKMNTYPE.ELECTRIC, PKMNTYPE.ICE, 90,	100,	90,	90,	80,	55);//196
		private Pokemon Dracovish = new Pokemon("Dracovish", PKMNTYPE.WATER, PKMNTYPE.DRAGON, 90,	90,	100,	70,	80,	75);//197
		private Pokemon Arctovish = new Pokemon("Arctovish", PKMNTYPE.WATER, PKMNTYPE.ICE, 90,	90,	100,	80,	90,	55);//198
		private Pokemon Charizard = new Pokemon("Charizard", PKMNTYPE.FIRE, PKMNTYPE.FLYING, 78,	84,	78,	109,	85,	100);//199
		private Pokemon Silvally = new Pokemon("Silvally", PKMNTYPE.NORMAL, null, 95,	95,	95,	95,	95,	95);//200
		private Pokemon Tyranitar = new Pokemon("Tyranitar", PKMNTYPE.ROCK, PKMNTYPE.DARK, 100,	134,	110,	95,	100,	61);//201
		private Pokemon Hydreigon = new Pokemon("Hydreigon", PKMNTYPE.DARK, PKMNTYPE.DRAGON, 92,	105,	90,	125,	90,	98);//202
		private Pokemon Goodra = new Pokemon("Goodra", PKMNTYPE.DRAGON, null, 90,	100,	70,	110,	150,	80);//203
		private Pokemon Kommo = new Pokemon("Kommo-o", PKMNTYPE.FIGHTING, PKMNTYPE.DRAGON, 75,	110,	125,	100,	105,	85);//204
		private Pokemon Dragapult = new Pokemon("Dragapult", PKMNTYPE.DRAGON, PKMNTYPE.GHOST, 88,	120,	75,	100,	75,	142);//205
	
		
		
		public Pokedex(){
			addPokemon();
		}
		
		public static void main(String args[]) {
			/*Pokedex p = new Pokedex();
			System.out.println(p.getXTypePokemon(PKMNTYPE.ICE));
			System.out.println(p.getPokemon(21).getAttack());*/
			
		}
		
		private void addPokemon() {
			pokedex.add(Rillaboom);  
			pokedex.add(Cinderace);
			pokedex.add(Inteleon);
			pokedex.add(Orbeetle);
			pokedex.add(Butterfree);
			pokedex.add(Vikavolt);
			pokedex.add(Noctowl);
			pokedex.add(Corviknight);
			pokedex.add(Greedent);
			pokedex.add(Unfezant);
			pokedex.add(Thievul);
			pokedex.add(Obstagoon);
			pokedex.add(Dubwool);
			pokedex.add(Ludicolo);
			pokedex.add(Shiftry);
			pokedex.add(Drednaw);
			pokedex.add(Liepard);
			pokedex.add(Boltund);
			pokedex.add(Diggersby);
			pokedex.add(Ciccino);
			pokedex.add(Tsareena);
			pokedex.add(Vileplume);
			pokedex.add(Bellossom);
			pokedex.add(Roserade);
			pokedex.add(Pelipper);
			pokedex.add(Galvantula);
			pokedex.add(Manectric);
			pokedex.add(Ninetales);
			pokedex.add(Arcanine);
			pokedex.add(Vanilluxe);
			pokedex.add(Mamoswine);
			pokedex.add(Delibird);
			pokedex.add(Glailie);
			pokedex.add(Froslass);
			pokedex.add(Claydol);
			pokedex.add(Mudsdale);
			pokedex.add(Crustle);
			pokedex.add(Golurk);
			pokedex.add(Musharna);
			pokedex.add(Xatu);
			pokedex.add(Bewear);
			pokedex.add(Abomasnow);
			pokedex.add(Kingler);
			pokedex.add(Quagsire);
			pokedex.add(Crawdaunt);
			pokedex.add(Ninjask);
			pokedex.add(Shedinja);
			pokedex.add(Hitmonlee);
			pokedex.add(Hitmonchan);
			pokedex.add(Hitmontop);
			pokedex.add(Pangoro);
			pokedex.add(Klinklang);
			pokedex.add(Vespiqueen);
			pokedex.add(Bronzong);
			pokedex.add(Gardevoir);
			pokedex.add(Gallade);
			pokedex.add(Drifblim);
			pokedex.add(Eldegoss);
			pokedex.add(Cherrim);
			pokedex.add(Skunktank);
			pokedex.add(Seismitoad);
			pokedex.add(Dusknoir);
			pokedex.add(Machamp);
			pokedex.add(Gengar);
			pokedex.add(Gyrados);
			pokedex.add(Seaking);
			pokedex.add(Octillery);
			pokedex.add(Cloyster);
			pokedex.add(Milotic);
			pokedex.add(Basculin);
			pokedex.add(Wishiwashi);
			pokedex.add(Pyukumuku);
			pokedex.add(Garbodor);
			pokedex.add(Centiskorch);
			pokedex.add(Coalossal);
			pokedex.add(Dugtrio);
			pokedex.add(Excadrill);
			pokedex.add(Gigalith);
			pokedex.add(Conkeldurr);
			pokedex.add(Swoobat);
			pokedex.add(Noivern);
			pokedex.add(Steelix);
			pokedex.add(Barraskewda);
			pokedex.add(Perrskerker);
			pokedex.add(Persian);
			pokedex.add(Alcremie);
			pokedex.add(Ribombee);
			pokedex.add(Ferrothorn);
			pokedex.add(Gourgeist);
			pokedex.add(Raichu);
			pokedex.add(Vaporeon);
			pokedex.add(Jolteon);
			pokedex.add(Flareon);
			pokedex.add(Espeon);
			pokedex.add(Umbreon);
			pokedex.add(Leafeon);
			pokedex.add(Glaceon);
			pokedex.add(Sylveon);
			pokedex.add(Flapple);
			pokedex.add(Appletun);
			pokedex.add(Meowstic);
			pokedex.add(Slurpuff);
			pokedex.add(Aromatisse);
			pokedex.add(Araquanid);
			pokedex.add(Wobbuffet);
			pokedex.add(Sirfetchd);
			pokedex.add(Lanturn);
			pokedex.add(Toxicroak);
			pokedex.add(Scrafty);
			pokedex.add(Stunfisk);
			pokedex.add(Shuckle);
			pokedex.add(Whiscash);
			pokedex.add(Gastrodon);
			pokedex.add(Golisopod);
			pokedex.add(Barbaracle);
			pokedex.add(Cursola);
			pokedex.add(Grimmsnarl);
			pokedex.add(Hatterene);
			pokedex.add(Salazzle);
			pokedex.add(Bisharp);
			pokedex.add(Throh);
			pokedex.add(Sawk);
			pokedex.add(Weezing);
			pokedex.add(Sudowoodo);
			pokedex.add(Clefable);
			pokedex.add(Togekiss);
			pokedex.add(Snorlax);
			pokedex.add(Whimsicott);
			pokedex.add(Rhyperior);
			pokedex.add(Gothitelle);
			pokedex.add(Reuniclus);
			pokedex.add(Escavalier);
			pokedex.add(Accelgor);
			pokedex.add(Beheeyem);
			pokedex.add(Beartic);
			pokedex.add(Braviary);
			pokedex.add(Mandibuzz);
			pokedex.add(Drapion);
			pokedex.add(Chandelure);
			pokedex.add(Malamar);
			pokedex.add(Weavile);
			pokedex.add(Sableye);
			pokedex.add(Mawile);
			pokedex.add(Maractus);
			pokedex.add(Sigilyph);
			pokedex.add(Lucario);
			pokedex.add(Torkoal);
			pokedex.add(Mimikyu);
			pokedex.add(Copperajah);
			pokedex.add(Qwilfish);
			pokedex.add(Jellicent);
			pokedex.add(Toxapex);
			pokedex.add(Cramorant);
			pokedex.add(Toxtricity);
			pokedex.add(Sandaconda);
			pokedex.add(Hippowdon);
			pokedex.add(Durant);
			pokedex.add(Heatmor);
			pokedex.add(Heliolisk);
			pokedex.add(Hawlucha);
			pokedex.add(Flygon);
			pokedex.add(Haxorus);
			pokedex.add(Runerigus);
			pokedex.add(Cofragigus);
			pokedex.add(Aegislash);
			pokedex.add(Rapidash);
			pokedex.add(Polteageist);
			pokedex.add(Indeedee);
			pokedex.add(Trevenent);
			pokedex.add(Shiinotic);
			pokedex.add(Oranguru);
			pokedex.add(Passimian);
			pokedex.add(Morpeko);
			pokedex.add(Falinks);
			pokedex.add(Drampa);
			pokedex.add(Turtonator);
			pokedex.add(Togedemaru);
			pokedex.add(Frosmoth);
			pokedex.add(Grapploct);
			pokedex.add(Pincurchin);
			pokedex.add(Mantine);
			pokedex.add(Wailord);
			pokedex.add(Avalugg);
			pokedex.add(Dhelmise);
			pokedex.add(Lapras);
			pokedex.add(Lunatone);
			pokedex.add(Solrock);
			pokedex.add(MrRime);
			pokedex.add(Darmanitan);
			pokedex.add(Stonjourner);
			pokedex.add(Eiscue);
			pokedex.add(Duraludon);
			pokedex.add(Rotom);
			pokedex.add(Ditto);
			pokedex.add(Dracozolt);
			pokedex.add(Arctozolt);
			pokedex.add(Dracovish);
			pokedex.add(Arctovish);
			pokedex.add(Charizard);
			pokedex.add(Silvally);
			pokedex.add(Tyranitar);
			pokedex.add(Hydreigon);
			pokedex.add(Goodra);
			pokedex.add(Kommo);
			pokedex.add(Dragapult);
		
		}
		
		//returns Pokemon with input of its name
		public Pokemon getPokemon(String n) {
			for(Pokemon p : pokedex) {
				if(p.getName().equals(n)) {
					return p;
				}
			}
			return null;
		}
		
		//returns Pokemon with input of its number
		public Pokemon getPokemon(int n) {
			int n2 = n - 1;
			return pokedex.get(n2);
		}
		
		//returns number of the Pokemon
		public int getPokemonNumber(String n) {
			for(Pokemon p : pokedex) {
				if(p.getName().equals(n)) {
					return pokedex.indexOf(p);
				}
			}
			return (Integer) null;
		}
		
		//returns list of Pokemon of a certain type
		public List<Pokemon> getXTypePokemon(PKMNTYPE t){
			List <Pokemon> list = new ArrayList<Pokemon>();
			for(Pokemon p : pokedex) {
				if(p.getType().contains(t)) {
					list.add(p);
				}
			}
			return list;
		}
		
		public List<Pokemon> getPokedex(){
			return pokedex;
		}
		
		public float avgPokedexHP() {
			float n = 0;
			for(int i = 0; i < pokedex.size(); i++) {
				n += pokedex.get(i).getHP();
			}
			float result = (n / pokedex.size());
			return result;
		}
		
		public float avgPokedexAtt() {
			float n = 0;
			for(int i = 0; i < pokedex.size(); i++) {
				n += pokedex.get(i).getAttack();
			}
			float result = (n / pokedex.size());
			return result;
		}
		
		public float avgPokedexDef() {
			float n = 0;
			for(int i = 0; i < pokedex.size(); i++) {
				n += pokedex.get(i).getDefense();
			}
			float result = (n / pokedex.size());
			return result;
		}
		
		public float avgPokedexSpAtt() {
			float n = 0;
			for(int i = 0; i < pokedex.size(); i++) {
				n += pokedex.get(i).getSpecialAttack();
			}
			float result = (n / pokedex.size());
			return result;
		}
		
		public float avgPokedexSpDef() {
			float n = 0;
			for(int i = 0; i < pokedex.size(); i++) {
				n += pokedex.get(i).getSpecialDefense();
			}
			float result = (n / pokedex.size());
			return result;
		}
		
		public float avgPokedexSpeed() {
			float n = 0;
			for(int i = 0; i < pokedex.size(); i++) {
				n += pokedex.get(i).getSpeed();
			}
			float result = (n / pokedex.size());
			return result;
		}
	}
