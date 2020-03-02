package beans;

import beans.entity.Job;
import beans.entity.Position;
import beans.entity.ProgrammingLanguage;

public class EmployeeFactory {
    public static Employee getType(Job job, String name, ProgrammingLanguage programmingLanguage, Position position){
        Employee employee = null;
        switch (job){
            case TESTER: {
                employee = new Tester(name, programmingLanguage, position);
                break;
            }
            case TEAMLEAD:{
                employee = new TeamLead(name, programmingLanguage, position);
                break;
            }
            case DEVELOPER:{
                employee = new Developer(name, programmingLanguage, position);
                break;
            }
        }
        return employee;
    }
}
