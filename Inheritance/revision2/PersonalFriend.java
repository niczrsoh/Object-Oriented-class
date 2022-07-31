package Inheritance.revision2;

public class PersonalFriend extends Person{
    private String message;

    public PersonalFriend() {
    }


    public PersonalFriend(String name, String phone, Address address, String message) {
        super(name, phone, address);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public void dispPersonalFriend(){
        System.out.println("Message: "+ getMessage());
    }
}
