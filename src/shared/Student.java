/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shared;

import java.io.Serializable;

/**
 *
 * @author Nico Kuijpers
 */
public class Student implements Serializable {
    private String firstName;
    private String lastName;
    private int birthYear;
    
    public Student(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getBirthYear() {
        return birthYear;
    }
    
    public String toString() {
        return new String(firstName + " " + lastName + " (" + birthYear + ")");
    }
}
