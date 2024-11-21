package Question.chain_of_responsibility;

public class Director extends LeaveRequestHandler {
    public void handleRequest(LeaveRequest l){
        if(l.days>15){
            System.out.println("d leave accepted :"+l.employeeName);
        }else{
            System.out.println("no more authority , rejected");
        }
    };
}
