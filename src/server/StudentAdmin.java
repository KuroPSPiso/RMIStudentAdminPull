/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import shared.IStudentAdmin;
import shared.Student;

/**
 *
 * @author Nico Kuijpers
 */
public class StudentAdmin extends UnicastRemoteObject implements IStudentAdmin {
    
    // Students
    private ArrayList<Student> students;
    
    // Constructor
    public StudentAdmin() throws RemoteException {
        students = new ArrayList<Student>();
    }
    
    public int getNumberOfStudents() throws RemoteException {
        System.out.println("StudentAdmin: Request for number of students");
        return students.size();
    }
    
    public Student getStudent(int nr) throws RemoteException {
        System.out.println("StudentAdmin: Request for student with number " + nr);
        if (nr >= 0 && nr < students.size()) {
            return students.get(nr);
        }
        else {
            return null;
        }
    }
    
    public Student addStudent(String firstName, String lastName, int birthYear) throws RemoteException {
        Student student = new Student(firstName,lastName,birthYear);
        students.add(student);
        System.out.println("StudentAdmin: Student " + student.toString() + " added to student administration");
        return student;
    }
}
