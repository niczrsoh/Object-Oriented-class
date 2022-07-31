Vector class 
- belong to List interface. List is a subclass of Collections.
- resizeable-array implementation of List 
- part of java.util package
- dynamically shrink or grow as needed
- data can be inserted/removed from any location 
- elements of the vector must be object, cannot be primitive types
- same as Array List
- are synchronized for thread safety
- size does not need to be declared
- grows and shrinks as needed
- add, retrieve and insert in the middle of the vector
- remove elements from the vector
- Due to list can store different types of elements, they must be cast first before using it.
- (Animal) ani;
- Vector<Animal> ani = new Vector<Animal>();
- thus vector is also considered as generic class.
- benefit of generic is to enable errors to be detected during the compalition time rather than run time.
- autoboxing occurs when primitive type values are inserted into the list of vector. 
//constructors for Vector 
public Vector(int initial Capacity);
public Vector();
//methods 
addElement(Object obj);
insertElement(Object obj, int index);
capacity();
elementAt(int index);
firstElement();
indexOf(Object elem);//return index of the given element
lastIndexOf(Object elem);
lastElement();
removeElement(Object obj);
removeAllElements(); // remove all the objects  
removeElementAt();
size();//return number of objects stored 
trimToSize();//reduce the capacity of the vector to the number of elements
setElementAt(Object obj,int index);//to change the value of specific element