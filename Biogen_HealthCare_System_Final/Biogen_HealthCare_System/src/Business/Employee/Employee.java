/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private int id;
    private String designation;
    private static int count = 1;

    public Employee(int maxID) {
       count = maxID +1;  
      id = count;
        count++;
          
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
 
    
    
    @Override
    public String toString() {
        
        return name;
    }
    
    
}
