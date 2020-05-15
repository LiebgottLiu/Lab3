package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Project inside the company.
 * Projects are identified by its name.
 *
 * @author Sebastian Rodriguez, 2020. email: sebastian.rodriguez@rmit.edu.au
 */
public class Project {
    /**
     * Name the this project
     */
    private String name;

    /**
     * Project start
     */
    private Date startDate;

    /**
     * Project maximum end date
     */
    private Date dueDate;

    /**
     * Estimated duration of the project in DAYS (WEEKENDS INCLUDED)
     */
    private int estimatedDuration = 1;

    /**
     * Team allocated to this project
     */
    private List<Employee> team = new ArrayList<Employee>();


    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(int estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public List<Employee> getTeam() {
        return team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(name, project.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    /**
     * Adds a new member to the team
     * @param employee the employee to add as member
     */

    public void addTeamMember(Employee employee) throws IllegalTeamMemberException {

        if(this.estimatedDuration <= 95 && this.team.size() == 5){
            throw new IllegalTeamMemberException(this.name+" has a duration of " + this.estimatedDuration + " and has already has 5 members. Cannot add "+  employee.getName());
        }

        if(this.team.contains(employee)){
            throw new IllegalTeamMemberException(this.name+" already contains "+  employee.getName()+ ". Cannot add a members twice.");
        }

        this.team.add(employee);
    }

    public boolean removeTeamMember(Employee employee){
        return false;
    }

    /**
     * Verifies the Project has valid dates.
     * @return true if dates are valid, false otherwise.
     */
    public boolean hasValidDates(){
       return false;
    }

    /**
     * Verifies that an employee can be added as team member
     * @return true if the Employee can be added to the team, false otherwise.
     */
    public boolean canAddTeamMember(Employee employee){
        return false;
    }
}
