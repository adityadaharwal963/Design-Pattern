package ChainOfResponsibility;

public class SpamEmailHandler extends EmailHandler {
    @Override
    public void handleRequest(EmailRequest e) {

       if(e.type.equals("spam")){
        System.err.println("spam email deleted");
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
