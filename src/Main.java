// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Juhaina","j@gmail.com","Muscat",98987676,4500);
        System.out.println(e.calcNetSalary());

        e.printName();
        e.printAddress();
//        new Employee();
//        Employee e1= new Employee();
//        Employee e2= new Employee();
//        Employee e3= new Employee();
//        Employee e4= new Employee();

    }

}
class Employee{
    Employee(){
        System.out.println("Create new Employee");
    }
    Employee(String n,String e,String a,int p,double s){
        name = n;
        email = e;
        address = a;
        phoneNo = p;
        salary = s;
    }
    String name,email,address;
    int phoneNo;
    double salary;

    double  calcNetSalary(){

        return salary - (salary * .14);
    }
    void printName(){
        System.out.println("Hello, Mr/Mrs "+name+" your email is : "+email+" your phone number is "+phoneNo);
    }
    void printAddress(){
        System.out.println("Your address is : "+address);
    }

}

