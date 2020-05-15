package model;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  Implement and test {@link Project#addTeamMember(Employee)} } that respects the following:
 *
 * <ul>
 *     <li>A project of estimated duration of 3 months (inclusive) or less cannot have more that 5 members</li>
 *     <li>A project of estimated duration of more than 3 months can have any number of members</li>
 *     <li>Project class must ensure an employee is not added twice to the same project</li>
 * </ul>
 * NOTE: Consider all months are 30 days. Then a project of 2 months is estimated as 60 days.
 *
 * Throws an {@link IllegalTeamMemberException} if an Employee cannot be part of the team.
 * Exception MUST identify the Employee name, project name and reason of exception in the message.
 *
 *
 * Each test criteria must be in an independent test method and named as specified in the README.
 *
 * Initialize the test object with setUp method.
 *
 * TIPS:
 * <ul>
 *     <li>You can use assertJ (https://assertj.github.io/doc/)  </li>
 * </ul>
 */

class ProjectTeamAddMemberTest {
   private int ProjectTime;
   private int SizeOfTeam;
   private List<Employee> team = new ArrayList<Employee>();
   private String ProjectName;
   public void GetProjectTime(){
       Project Pj = new Project("ProjectName");

       this.ProjectTime=Pj.getEstimatedDuration();
   }
   public void SetTeamSize(){
        /*
       we assume a month have 30 days
        */
       if(this.ProjectTime<(30*3)){
           this.SizeOfTeam = 5;
       }else if (this.ProjectTime>(30*3)){
           this.SizeOfTeam = Math.max(0,10000);
       }
   }
   public void CheckAgain(Employee employee) throws IllegalTeamMemberException {

       Project pj = new Project("ProjectName");
       this.team=pj.getTeam();
       this.ProjectName = pj.getName();
       if(this.team.contains(employee)){
           throw new IllegalTeamMemberException(this.ProjectName+" already contains "+  employee.getName()+ ". Cannot add a members twice.");
       }else if ( this.ProjectTime<=90 &&this.SizeOfTeam==5){
           throw new IllegalTeamMemberException(this.ProjectName+" has a duration of " + this.ProjectTime + " and has already has 5 members. Cannot add "+  employee.getName());
       }else
           pj.addTeamMember(employee);
   }

@Test
    void Test1() {


}

}

