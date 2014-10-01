/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Nico Kuijpers
 */
public interface IStudentAdmin extends Remote {
    public int getNumberOfStudents() throws RemoteException;
    public Student getStudent(int nr) throws RemoteException;
    public Student addStudent(String firstName, String lastName, int birthYear) throws RemoteException;
}
