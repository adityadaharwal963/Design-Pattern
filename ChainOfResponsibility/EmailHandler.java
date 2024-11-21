package ChainOfResponsibility;

public abstract class EmailHandler {
    EmailHandler successorHandler;
    public abstract void handleRequest(EmailRequest e);
    public void setSuccessor(EmailHandler succ){
        this.successorHandler = succ;
    };
}
