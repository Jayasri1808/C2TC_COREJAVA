package assignmentmain;


public class Developer extends Employee {
private String programmingLanguage;
public Developer(String name, int employeeId, String programmingLanguage) {
super(name, employeeId);
this.programmingLanguage = programmingLanguage;
}
public String getProgrammingLanguage() {
return programmingLanguage;
} public void setProgrammingLanguage(String programmingLanguage) {
this.programmingLanguage = programmingLanguage;
}
}