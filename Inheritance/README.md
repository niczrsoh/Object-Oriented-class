Inheritance
- is-a relationship that consists of superclass and subclass
- superclass -> general class / base class
- subclass -> specialized class / derived class
- specialized class inherits the methods and instance variables of superclass
- can extend the capabilities of a class 
- the process by which a new class is created from another class.
- allows code to be reused
- private: cannot be accessed by the subclass [only exists in the memory when subclass is created]
- public: inherited by the subclass
- protected: control access to the members of a class.
- protected visibility allows a class to retain some encapsulation properties bu tnot tight as private.
- derived class has instance, static variables and public methods of base class
- superclass's constructor is not inherited!
- constructor is invoked explicitly or implicitly
- explicitly using super keyword.
- if super keyword is not explicitly used, the superclass's no-arg constructor is invoked automatically.
- implicitly: when a subclass is instantiated, the superclass's constructor is executed first.
- if a parameterized constructor is defined in superclass:
   - superclass must have a non-arg constructor 
   OR
   - subclass must have a constructor and must call a superclass's constructor
- super(10) // explicitly call
- super: call to the base class's constructor
- super must always be the first action taken in a constructor definition.
- if super is not defined in subclass's constructor, no-arg constructorof the base class will be called automatically.
- this: can be used inside a constructor to invoke another constructor of the same class.
- a constructor with no/fewer arguments will invoke the constructor with more arguments using this.
- after passing data to the base constructor, super.method() can be used to invoke method in base class.
- super.memberVariable can be used to access the value of the superclass variable.

- Note that: public method/variable can be accessed in a parent class explicitly by name in child class or through object in class. 