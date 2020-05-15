package model;

import java.util.Date;
import java.util.Objects;

/**
 * Class to hold information about an Employee of the Company.
 *
 * @author Sebastian Rodriguez, 2020. email: sebastian.rodriguez@rmit.edu.au
 */
public class Employee {

    private final String name;
    private final Date startDate;
    private double perWeekSalary;
    private int numberOfProjects = 0;

    /**
     * Create a new employee object.
     * @param name Name of the Employee
     * @param startDate Date this employee started in the company.
     */
    public Employee(String name, Date startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setPerWeekSalary(double perWeekSalary) {
        this.perWeekSalary = perWeekSalary;
    }

    public double getPerWeekSalary() {
        return perWeekSalary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public int getNumberOfProjects() {
        return numberOfProjects;
    }

    public void setNumberOfProjects(int numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }

    public String formattedId(){
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
