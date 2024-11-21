package ChainOfResponsibility;

public class FanEmailHandler extends EmailHandler {
    @Override
    public void handleRequest(EmailRequest e) {

       if(e.type.equals("Fan")){
        System.err.println("Fan email send to ceo");
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
