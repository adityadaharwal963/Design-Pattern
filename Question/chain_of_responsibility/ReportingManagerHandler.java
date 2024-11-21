package Question.chain_of_responsibility;

public class ReportingManagerHandler extends LeaveRequestHandler {
    public void handleRequest(LeaveRequest l){
        if(l.days<5){
            System.out.println("rm1 leave accepted :"+l.employeeName);
        }else{
            this.successHandler.handleRequest(l);
        }
    };
}
