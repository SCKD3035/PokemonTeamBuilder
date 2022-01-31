# PokemonTeamBuilder

1.0   Introduction

	Welcome to the world of Pokémon! This monster-catching franchise had taken the world by storm when it was introduced in 1996 and has since then grown to become the world’s largest media franchise. The competitive aspect of the game has grown more popular as well, with the company hosting many international tournaments over the years.
	The turn-based battling system can be as simple or as intricate as you make it. Most people concern themselves with type matchups and go on from there. However, there is a lot more than meets the eye with this game. Every individual Pokémon not only has a typing, but a unique set of stats (Attack, Defense, HP, Speed), an ability (a condition that is activated when the Pokémon enters battle), and a move pool. Every individual Pokémon also has a specific nature that affects how their stats grow, and the player can train their Pokémon in a certain way to affect the growth of certain stats as well.  In addition, the player can have their Pokémon hold certain items for beneficiary effects.
	All of these intricacies make the process behind building a team for competitive battling much harder, as one would not only have to worry about type matchups but also how certain individual Pokémon’s stat makeups affect the whole team’s battling style. 
	The Pokémon Team Builder program attempts to alleviate this difficulty. The user first picks between three styles of teams (Balanced, Offensive, or Defensive) and picks their first Pokémon. After that, the program recommends Pokémon to add to the team based on the team style and how well that Pokémon’s typing complements the team. The program mainly uses vectors and dot products to find the best fit Pokémon.
2.0  Pokémon Mechanics
	Every Pokémon brings different strengths and weaknesses to the table. A standard Pokémon team has six different Pokémon. Two of the same Pokémon can not be on a team. Each Pokémon has access to four moves, and at the beginning of each turn, the player may choose which move to use or switch their Pokémon. The Pokémon with the higher Speed stat attacks first. Every Pokémon has a certain amount of Hit Points (HP), and when their HP reaches 0, they faint and are unable to battle.
	With such a vast and diverse array of Pokémon, there is no limit as to how many different teams one may choose to employ. And just as teams are customizable (typing, stats/style), Pokémon are customizable as well (Abilities, Natures, Moves, Items).

2.1  Pokémon Typing
There are 18 Pokémon types: Normal, Fire, Water, Grass, Electric, Ice, Rock, Ground, Bug, Ghost, Poison, Fighting, Flying, Psychic,Dragon, Dark, Steel, and Fairy.
Each type has a set of weaknesses (they take 2x the amount of damage from those types), resistances (they take ½x or ¼x the amount of damage from those types), and immunities (they take 0x the amount of damage from these types).
 Let’s take a look at Charizard:

Type: Fire / Flying
Ability: Blaze

	Charizard’s typing is Fire and Flying, which gives it three weaknesses (Water, Electric, Rock), six resistances (Fighting, Bug, Steel, Grass, Fire, Fairy), and one immunity (Ground). Having only three weaknesses is pretty good for a Pokémon, but one of Charizard’s weaknesses is Water, one of the more popular types. One way a player can counter this is have their Charizard learn the move Solar Beam, a Grass type move, or Thunder Punch, an Electric type move, both of which are super effective against Water type Pokémon.
	One aspect of team customization we see here is not having too many Pokémon that are weak to one type, as a Pokémon of that type would be able to take out your entire team. One would also want a team that is resistant to a wide array of types to protect them from various types.
	An aspect of Pokémon customization would be the example above, teaching Charizard a Grass or Electric type move to counter Water types.

2.2  Pokémon Stats
	Every Pokémon has six stats: Hit Points (HP), Attack, Defense, Special Attack, Special Defense, and Speed. HP is how much health the Pokémon has, Attack determines how powerful Pokémon’s physical moves (that make direct contact, like Thunder Punch) are, Defense determines how well a Pokémon can take a hit from a physical move, Special Attack determines how powerful Pokémon’s specials moves (that don’t make direct contact, like Solar Beam) are, Special Defense determines how well a Pokémon can take a hit from a special move, and Speed determines how fast a Pokémon is.

Let’s take another look at Charizard:

	The table to the right of Charizard shows its base stats. Based on the table, we know that Charizard is a fast special attacker. It does have solid Defense and Special Defense stats, but not enough to call it a tank (A Pokémon with high defensive stats). A hit from a super-effective move could take Charizard out in one blow. Looking back to the Solar Beam and Thunder Punch example from 2.1, it would make more sense to teach Charizard Solar Beam. Solar Beam is a special attack, and because Charizard has a higher Special Attack than Attack, Solar Beam would do more damage than Thunder Punch. 
	For team customization, if one wanted an Offensive team, it would consist mainly of Pokémon with higher Attack, Special Attack, and Speed stats. If one wanted a Defensive team, it would consist mainly of Pokémon with higher Defense, Special Defense, and HP stats.
	A way to customize a Pokémon’s stats would be through natures. There are a total of 25 natures. Every Pokémon has a certain nature that affects how its stats grow as the Pokémon gains experience. A specific nature causes the growth of one stat to accelerate while decelerating another. If one wanted to maximize Charizard’s Special Attack, they would get one with a Modest nature, which accelerates Special Attack, while decelerating Attack. Or if they wanted to maximize Charizard’s speed, they would get one with a Timid nature, which accelerates Speed, while decelerating Attack.


3.0  The Team Builder
	As mentioned in the introduction, the Team Builder alleviates the process of putting together a team. After the user picks a team style (Balanced, Offensive, Defensive) and their first Pokémon, the program recommends Pokémon to add to the team based on the Pokémon’s stats and how well the Pokémon’s typing complements the team. This program only takes aspects of team customization into account, not Pokémon customization, so moves, abilities, and natures will not be included in the program. 
The program has two equations to determine how well a Pokémon fits in a team, which we will call T(t,p), for type, and S(t,p), for stats. Both equations take in the user’s current team, t, and a potential Pokémon to add, P. They both use vectors and dot products to yield a scalar value as a score. Both equations are then combined in a final equation, which we will call F(t,P), for a final score.
For the sake of time and size, the Pokémon used for this program are from the Galar Pokédex, which is the list of Pokémon available for capture in the most recent games, Pokémon Sword and Pokémon Shield. The size of the Galar Pokédex is 400, but after including only final evolutions and excluding legendary Pokémon, the program’s pool of Pokémon was reduced to 205, which still allows for plenty of variation among teams. This pool will be referred to as Galar Pokédex 2.

3.1  Stats Score
	The equation used for getting the score based on stats is:

S(t, P)= (A(t ∪ P) − A(X)) • M

	This equation takes in 2 parameters, Team t and Pokémon P.
A(t ∪ P) is a six-component vector containing the averages of the stats of Pokémon in Team t, and the potential Pokémon P. The first component is the average HP of t and P, the second component is the average Attack of t and P, the third component is the average Defense of t and P, and so on.
	A(X) is another six-component vector that contains the averages of the stats of all the Pokémon in the Galar Pokédex 2.
	M is what is known as the bias vector, and is a key part of the program. Like the other two vectors, it contains six components, but it doesn’t contain any averages. Instead, the values of the vector change depending on the team style that the user chose.
	A balanced team style will give M the values: [ ⅙ , ⅙, ⅙, ⅙, ⅙, ⅙]. This gives an equal preference to all stats, and all Pokémon, regardless of whether they are attackers or tanks, will have an equal opportunity to be recommended.
	An offensive team style will give M the values: [1/30, 9/30, 1/30, 9/30, 1/30, 9/30]. This gives preference to Pokémon with higher Attack, Special Attack, and Speed Stats. These Pokémon will receive a higher score and will be recommended, while others will receive lower scores.
	A defensive team style will give M the values: [9/30, 1/30, 9/30, 1/30, 9/30, 1/30]. This gives preference to Pokémon with higher HP, Defense, and Special Defense stats.
	(A(t ∪ P) − A(T)) measures the impact Pokémon P would have on Team t. The dot product is then used to combine the expression above with the bias vector and returns a scalar value. Pokémon P’s impact will either be amplified or reduced by the bias vector (the larger the value, the better).
	What this equation hopes to achieve is to assemble the best Pokémon for the user’s preferred style of battling.

3.2  Type Score
	The equation used for getting a score based on typing is:

T(t, P) = (B(t ∪ P) − B(t)) • M

	This equation also takes in 2 parameters, Team t and Pokémon P
All of the vectors in this equation have 18 components, one for each type. 
	B(t) takes in the partial team that the user has accumulated so far. For every Pokémon in the team, if it is weak to a certain type, the program will subtract 1 from its component. If it is resistant to that type, the program will add one to its component, and if it is immune to that type, the program will add two to its component. 
	B(t ∪ P) works the same way as B(t) but it also includes the potential Pokémon P. 
	M, the bias vector, also appears in this equation. Like the other two vectors, it has 18 components, and unlike the previous bias vector, its values change as the program progresses. It changes depending on the types of the Pokémon in the team.
	If there is one Pokémon in Team t that is weak to a certain type, that type’s component’s value is set to 15. If there are two or more Pokémon in Team t that are weak to a certain type, that type’s component’s value is set to 50. If there are no Pokémon in Team t that are weak to a certain type, that type’s component’s value is set to 5. (These numbers were decided on after several runs of trial and error).
	If Pokémon P is weak to a certain type, it will add an additional -1 to that type’s component (resulting in a negative number for the type’s component in (B(t ∪ P) − B(t))) and depending on how many Pokémon are weak to that type, the component’s value will decrease thanks to the bias vector. If the Pokémon is resistant or immune to a certain type, the type’s component’ value will increase in (B(t ∪ P) − B(t)), resulting in a higher score for the Pokémon.
	Once again, the dot product is used to combine the bias vector and (B(t ∪ P) − B(t)), resulting in a scalar value for a score (the larger the value, the better).
	What the equation hopes to achieve is obtaining a team where no more than 2 Pokémon are weak to the same type, and if there is a Pokémon weak to a certain type, there is at least one other Pokémon in the team that is resistant or immune to that type.

3.3  Fit
	To combine the results of the two equations, the program uses:

F(t,P) = (1.65)T(t,P) + S(t,P)

What the program does is that it inputs the user’s current team in F(t,P), and runs every other Pokémon in Galar Pokédex 2 through the equation as well. It then returns a list Pokémon with the highest score for the user to choose from (it is ordered from Pokémon with the highest score to the lowest score)
The purpose of the value 1.65 is to give greater weight to the type equation, so that the team will be balanced. The value was arrived at with trial and error.

4.0  Conclusion
	Building an ideal team for competitive Pokémon battling is one of the hardest parts of the competitive scene, as the player has to weigh the many advantages and disadvantages of certain Pokémon. The Pokémon Team Builder uses vectors and dot products to help guide the player along the process.
	Hopefully this tool can help those who are interested in Pokémon partake in the worldwide phenomenon and get more involved in the competitive scene. This may be a gateway that further introduces them to the intricacies of Pokémon battling and the many strategies one can employ. With the barrier of team customization out of the way, the player can experiment with Pokémon customization with new moves or new items and have fun.
	Happy battling! And go out there and be the very best like no one ever was!

Works Cited
Reijm, Hujo. “A Time-Efficient Competitive Pokémon Team-Building Algorithm.” Delft University of Technology, TUDelft Library, 2016.
“Charizard (Pokémon).” Charizard (Pokémon) - Bulbapedia, the Community-Driven Pokémon Encyclopedia, Bulbapedia, 2020, bulbapedia.bulbagarden.net/wiki/Charizard_(Pokémon).
“Galar Region Pokédex - Pokémon Sword & Shield.” Serebii.net Header, Serebii, 2020, www.serebii.net/swordshield/galarPokédex.shtml.

	
	
	

