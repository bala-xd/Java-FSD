
public class Employee {
    private int eid;
    private String ename;
    private int esalary;

    public Employee() {
    }

    public Employee(int eid, String ename, int esalary) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }

    public int getEid() {
        return this.eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return this.ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEsalary() {
        return this.esalary;
    }

    public void setEsalary(int esalary) {
        this.esalary = esalary;
    }

    @Override
    public String toString() {
        return "{" +
                " eid='" + getEid() + "'" +
                ", ename='" + getEname() + "'" +
                ", esalary='" + getEsalary() + "'" +
                "}";
    }

}
