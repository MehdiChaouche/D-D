package gameboard;

public class BoardCase {

    protected int caseID;
    protected int caseStatus;
    protected String contains;

    public BoardCase(int id) {
        this.caseID = id;
        this.caseStatus = 0;
        this.contains = "Empty";
    }

    public int getCaseID() {
        return caseID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public int getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(int caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getContains() {
        return contains;
    }

    public void setContains(String contains) {
        this.contains = contains;
    }
}
