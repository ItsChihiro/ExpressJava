package homework_3;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

     public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println("Company name is " + Company.companyName);
    }

     public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String newEmployeeName){
        this.employeeName = newEmployeeName;
    }

    public static void main(String[] args) {
        Company peter = new Company(1001, "Peter");
        Company nick = new Company(1002, "Nick");

        Company.companyName = "Meta";

        Company.printCompanyName();
//        peter.employeeID = 1003; // impossible to change
    }
}
