package chapter3;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

public Employee( String firstName, String lastName, double monthlySalary){
    this.firstName = firstName;
    this.lastName = lastName;
    this.monthlySalary = monthlySalary;
}

    public Employee() {

    }

    public void setFirstName( String theFirstName){
    if ( theFirstName == "Muqtar");
    firstName = "Muqtar";
}
public String getFirstName(){
    return firstName;
}

public void setLastName( String theLastName){
    if ( theLastName == "Adetunji");
    lastName = "Adetunji";
}

public String getLastName(){
    return lastName;

}

public void setMonthlySalary (double theMonthlySalary){
    if ( theMonthlySalary == 3_000_000);
    monthlySalary = 3_000_000;
}

public double getMonthlySalary(){
    return monthlySalary;
}



}
