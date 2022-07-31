package Inheritance.revision2;

public class BusinessAssociate extends Person{
    private String jobtitle;
    private String companyName;
    public BusinessAssociate(String name, String phone, Address address, String jobtitle, String companyName) {
        super(name, phone, address);
        this.jobtitle = jobtitle;
        this.companyName = companyName;
    }
    public String getJobTitle() {
        return jobtitle;
    }
    public String getCompanyName() {
        return companyName;
    }
    public BusinessAssociate() {
    }
    
    public void dispBusinessAssociates(){
        System.out.println("Job Title: "+ getJobTitle());
        System.out.println("Company: "+ getCompanyName());
    }
}
