package Question.chain_of_responsibility;

class Empolyee {

     public static void main(String[] args) {
        LeaveRequestHandler rM1 = new ReportingManagerHandler();
        LeaveRequestHandler rM2 = new ReportingManager2();
        LeaveRequestHandler d = new Director();

        rM1.setSuccessor(rM2);
        rM2.setSuccessor(d);

        LeaveRequest l = new LeaveRequest(40, "pandu");
        rM1.handleRequest(l);
     }
}