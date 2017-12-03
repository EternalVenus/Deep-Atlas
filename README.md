<h1>(ノ*゜▽゜*) Deep Atlas (ノ*゜▽゜*)</h1>

Deep Atlas will be a large scale object oriented programming project. 
We will be using OOP to model the real world or virtual world (video game).
This project will include all of the aspects of OOP such as Inheritance, 
Composition, Encapsulation, Abstraction, Polymorphism and also Interfaces. 

<h2>Pokemon Battle System ϞϞ(๑⚈ ꇴ ⚈๑)∩</h2>
<h3>Using object oriented programming to replicate Pokemon's Battle System. (Currently Still Under Development)<h3>
<h3> Listing the main mechanics </h3>
<ul>
    <li>Turn Order: Deciding turn of Player1 and Player2. This will also decide the order in which the Pokémon will make their move.</li>
    <li>Accuracy: Determine if a move will hit a given target, by putting in consideration of status effects and accuracy value of a skill. </li>
    <li>Critical Hit Calculation: Determine the probability of whether a move will be critical hit, which will be determine by the speed of        
    Pokemon and effect of a skill or item. </li>
    <li>Secondary Effect: Deciding whether secondary effects of moves should be activated.</li>
    <li>Damage Calculation: Determine the total damage of a skill, by taking in consideration of effectiveness, type , weather, etc.
        Total Damage Calculation Formula: <br>
        ( ( ( ( ( (2 * <i>Level</i>) / 2) + 2) * <i>Power</i> * <i>A / D</i>) / 50 )  + 2 )  * <i>Modifier</i><br>
        <ul>
            <li><i>Level</i> is the level of the attacking Pokémon </li>
            <li><i>A</i>  is the effective Attack stat of the attacking Pokémon if the used move is a physical move, or the effective Special           
                        Attack stat of the attacking Pokémon if the used move is a special move </li>
            </li><i>D</i> is the effective Defense stat of the target if the used move is a physical move or a special move that uses the                    
                    target's Defense stat, or the effective Special Defense of the target if the used move is an other special move </li>
            <li><i>Power</i> is the effective power of the used move. </li> 
        </ul>
    </li>
    <li>Modifier = Targets  * Weather * Badge * Critical * random * STAB * Type * Burn * Other</li>
        <ul>
            <li>Targets is 0.75 if the move has more than one target, and 1 otherwise.</li>
            <li>Weather is 1.5 if a Water-type move is being used during rain or a Fire-type move during harsh sunlight, and 0.5 if a Water-type move is used during harsh sunlight or a Fire-type move during rain, and 1 otherwise.</li>
            <li>Badge is applied in Generation II only. It is 1.25 if the attacking Pokémon is controlled by the player and if the player has obtained the Badge corresponding to the used move's type, and 1 otherwise.</li>
            <li>Critical is applied starting in Generation II. It is 2 for a critical hit in Generations II-V, 1.5 for a critical hit from Generation VI onward, and 1 otherwise.
            random is a random factor between 0.85 and 1.00 (inclusive).</li>
            <li>STAB is the same-type attack bonus. This is equal to 1.5 if the move's type matches any of the user's types, 2 if the user of the move additionally has Adaptability, and 1 if otherwise.</li>
            <li>Type is the type effectiveness. This can be 0 (ineffective); 0.25, 0.5 (not very effective); 1 (normally effective); 2 or 4 (super effective) depending on both the move's and target's types.</li>
            <li>Burn is 0.5 (from Generation III onward) if the attacker is burned, its Ability is not Guts, and the used move is a physical move (other than Facade from Generation VI onward), and 1 otherwise.</li>
            <li>other is 1 in most cases, and a different multiplier when specific interactions of moves, Abilities or items.</li>
        </ul>

</ul>


<hr>

<h1>Animal Object Design</h1>
<ul>
    <li>Animal is now a concrete class.</li>
    <li>Changed abstract classes Hunter, Fighter, etc to interfaces</li>
    <li>Redesigned Interfaces to be more general to include limb, mouth etc</li>
    <li>More specific types of traits such as paw and hoof will be concrete classes implementing the interfaces</li>
    <li>Updated Bird, Cat, Dog, And Pig to reflect such changes</li>
    <li>Use encapsulation to include these trait above using strategy design pattern</li>
</ul>


