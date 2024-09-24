/*
 * Higher level interface (not java interface)
 */
public class StreamFacade {
    private MovieSelection movieSelection;
    private UserAccount userAccount;
    private StreamingService streamingService;

    StreamFacade(){
        this.movieSelection = new MovieSelection();
        this.streamingService = new StreamingService();
        this.userAccount = new UserAccount();
    }

    public void watchMoive(String movieName,String user){
        if(userAccount.checkSubcription(user)){
            movieSelection.selectMovie(movieName);
            streamingService.prepareStream(movieName);
            streamingService.startStream(movieName);
        }
        
    }
};