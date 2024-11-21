package ChainOfResponsibility;

public class RequestEmailHandler extends EmailHandler {
    @Override
    public void handleRequest(EmailRequest e) {

       if(e.type.equals("Request")){
        System.err.println("Request send to business dept");
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
