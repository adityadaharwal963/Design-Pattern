package ChainOfResponsibility;

public class ComplaintEmailHandler extends EmailHandler {
    
    @Override
    public void handleRequest(EmailRequest e) {

       if(e.type.equals("Complaint")){
        System.err.println("Complaint send to legal dept");
       }else{
        if(this.successorHandler != null){
            this.successorHandler.handleRequest(e);
        } 
        else{
            System.out.println("Not handled");
        }
       }
    }
}
