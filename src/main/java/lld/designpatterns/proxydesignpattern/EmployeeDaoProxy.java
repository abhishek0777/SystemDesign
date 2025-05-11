package lld.designpatterns.proxydesignpattern;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDao employeeDaoImpl;
    EmployeeDaoProxy(){
        this.employeeDaoImpl = new EmployeeDaoImpl();
    }
    @Override
    public void create(String client, Employee employee) throws Exception{
        if (client.equals("ADMIN")){
            employeeDaoImpl.create(client, employee);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int id) throws Exception{
        if(client.equals("ADMIN")){
            employeeDaoImpl.delete(client, id);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int id) throws Exception{
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeDaoImpl.get(client, id);
        }
        throw new Exception("Access Denied");
    }
}
