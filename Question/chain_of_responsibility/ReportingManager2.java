package Question.chain_of_responsibility;

public class ReportingManager2 extends LeaveRequestHandler {
    public void handleRequest(LeaveRequest l){
        if(l.days>4 && l.days<16){
            System.out.println("rm2 leave accepted :"+l.employeeName);
        }else{
            this.successHandler.handleRequest(l);
        }
    };
}
