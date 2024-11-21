package ChainOfResponsibility;

public class Client {
   
    
    public static void main(String[] args) {
        EmailHandler fHandler = new FanEmailHandler();
        fHandler.setSuccessor(null);
        EmailHandler rHandler = new RequestEmailHandler();
        rHandler.setSuccessor(fHandler);
        EmailHandler cHandler = new ComplaintEmailHandler();
        cHandler.setSuccessor(rHandler);
        EmailHandler sHandler = new SpamEmailHandler();
        sHandler.setSuccessor(cHandler);

        EmailRequest email = new EmailRequest("Fan", "Awesome");
        
        sHandler.handleRequest(email);
        
    }
}
