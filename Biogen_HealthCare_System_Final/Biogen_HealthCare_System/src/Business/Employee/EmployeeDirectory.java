/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name,String designation,int maxID){
        Employee employee = new Employee(maxID);
        employee.setName(name);
        employee.setDesignation(designation);
        employeeList.add(employee);
        return employee;
    }
    
    
    public void removeEmployee(Employee e){
        employeeList.remove(e);
        
    }
    
    
    
    
}