package com.javastreams.serialization;

import java.io.*;
import java.util.List;

public class EmployeeService {

    // Serialize list of employees
    public static void saveEmployees(List<Employee> empList, String fileName) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(empList);
            System.out.println("Employees saved successfully");

        } catch (IOException e) {
            System.out.println("Error while saving: " + e.getMessage());
        }
    }

    // Deserialize and return list
    public static List<Employee> loadEmployees(String fileName) {
        List<Employee> list = null;

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            list = (List<Employee>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while loading: " + e.getMessage());
        }
        return list;
    }
}
