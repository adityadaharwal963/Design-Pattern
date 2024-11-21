package ChainOfResponsibility;

public class EmailRequest {
    String type;
    String subject;

    EmailRequest(String t, String s){
        this.subject = s;
        this.type = t;
    }
    
}
