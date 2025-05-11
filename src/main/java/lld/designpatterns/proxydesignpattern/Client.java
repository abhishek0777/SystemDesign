package lld.designpatterns.proxydesignpattern;

public class Client {
    public static void main(String[] args) throws Exception{
        try{
            EmployeeDao employeeDaoProxy = new EmployeeDaoProxy();
            Employee employee = new Employee(1,"Abhishek Vaishnav");
            employeeDaoProxy.create("ADMIN",employee);
            System.out.println("Operation Successful!!");
            employeeDaoProxy.delete("ADMIN",1);
            System.out.println("Operation Successful!!");
            employeeDaoProxy.get("ADMIN",2);
            System.out.println("Operation Successful!!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
