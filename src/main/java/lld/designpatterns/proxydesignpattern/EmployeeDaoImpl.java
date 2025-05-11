package lld.designpatterns.proxydesignpattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee employee) throws Exception{
        //create a new entry in employee table
        System.out.println("Created a new entry for employee: "+employee.toString());
    }

    @Override
    public void delete(String client, int id) throws Exception{
        //delete a entry in employee table
        System.out.println("Deleted a entry for employee id: "+id);
    }

    @Override
    public Employee get(String client, int id) throws Exception{
        //retrieve employee from employee table
        System.out.println("Fetching employee details from table...");
        return new Employee(-1,null);
    }
}
