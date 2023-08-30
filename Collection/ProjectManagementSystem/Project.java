package Collection.ProjectManagementSystem;

import java.util.ArrayList;

public class Project {
    private int projectID;
    private String projectName;
    private String description;
    private ArrayList<String>teamMember;

    public Project(int projectID, String projectName, String description, ArrayList<String> teamMember) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.description = description;
        this.teamMember = teamMember;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectID='" + projectID + '\'' +
                ", projectName='" + projectName + '\'' +
                ", description='" + description + '\'' +
                ", teamMember=" + teamMember +
                '}';
    }
}
