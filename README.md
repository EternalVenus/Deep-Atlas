<h1>Deep Atlas</h1>

Deep Atlas will be a large scale object oriented programming project. 
We will be using OOP to model the real world or virtual world (video game).
This project will include all of the aspects of OOP such as Inheritance, 
Composition, Encapsulation, Abstraction, Polymorphism and also Interfaces. 

<h1>Branch Note </h1>
Unfortunatly the master branch and the interface-abstract method branch cannot be merged
together due to their origin does not lay on the same branch. Now trying to manually merge
these two branches.
<br>
Created packages and src folder to increase organization.

<h1>Major Design Change</h1>
<ul>
    <li>Animal is now a concrete class.</li>
    <li>Changed abstract classes Hunter, Fighter, etc to interfaces</li>
    <li>Redesigned Interfaces to be more general to include limb, mouth etc</li>
    <li>More specific types of traits such as paw and hoof will be concrete classes implementing the interfaces</li>
    <li>Updated Bird, Cat, Dog, And Pig to reflect such changes</li>
    <li>Use encapsulation to include these trait above using strategy design pattern</li>
</ul>


