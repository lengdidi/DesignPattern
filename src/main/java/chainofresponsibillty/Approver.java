package chainofresponsibillty;

public abstract class Approver {
    protected Approver approver;

    public void setNaexApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
