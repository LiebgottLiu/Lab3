package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A Department within the Company
 *
 * @author Sebastian Rodriguez, 2020. email: sebastian.rodriguez@rmit.edu.au
 */
public class Department {
    private String name;
    private List<Project> projects = new ArrayList<Project>();
    private List<Employee> employees = new ArrayList<Employee>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public boolean canHostProject(int duration) {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
