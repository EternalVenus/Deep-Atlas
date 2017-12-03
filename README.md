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
    <li>Accuracy: Determine if a move will hit a given target, by putting in consideration of status effects and accuracy value of a             skill. </li>
    <li>Critical Hit Calculation: Determine the probability of whether a move will be critical hit, which will be determine by the speed of         Pokemon and effect of a skill or item. </li>
    <li>Damage Calculation: Determine the total damage of a skill, by taking in consideration of effectiveness, type , weather, etc.
        Total Damage Calculation Formula: <br>
                ( ( ( ( ( (2 * Level) / 2) + 2) * Power * A / D) / 50 )  + 2 )  * Modifier <br>
        Modifier = Targets  * Weather * Badge * Critical * random * STAB * Type * Burn * Other
    </li>
    <li>Secondary Effect: Deciding whether secondary effects of moves should be activated.</li>
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


