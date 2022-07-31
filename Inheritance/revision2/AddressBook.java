package Inheritance.revision2;

public class AddressBook {
    private Person[] entry;
    private int count;
    static private int num;//added
    public AddressBook() {
    }
    public AddressBook(int i) {//added
        count=i;
        entry=new Person[count];
    }
    public void addPerson(Person p){
        entry[num]=p;
        num++;
    }
    //added
    public void displayAddressBook(){
        for(int i=0; i<num; i++){
        System.out.println("Name: "+ entry[i].getName());
        System.out.println("Phone: "+ entry[i].getPhone());
        //to validate the entry object is BusinessAssociate object.
        if(entry[i] instanceof BusinessAssociate)
        ((BusinessAssociate) entry[i]).dispBusinessAssociates();
        System.out.println("Address: "+ entry[i].address.getFullAddress());
        //to validate the entry object is PersonalFriend object.
        if(entry[i] instanceof PersonalFriend)
        ((PersonalFriend) entry[i]).dispPersonalFriend();
        System.out.println();
    }
    }
}
