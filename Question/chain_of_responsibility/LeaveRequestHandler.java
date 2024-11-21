package Question.chain_of_responsibility;

public abstract class LeaveRequestHandler {
    LeaveRequestHandler successHandler;
    public abstract void handleRequest(LeaveRequest l);
    public void setSuccessor(LeaveRequestHandler handler){
        this.successHandler = handler;
    }
}
