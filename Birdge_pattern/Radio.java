package Birdge_pattern;

public class Radio implements Device {
    private boolean status = false ;
    private int volume = 0;
    private int channel= 0;

    public boolean isEnalbed(){
        return status;
    };
    public void enable(){
        status = true;
        return;
    };
    public void disable(){
        status = false;
        return;
    };
    public int getVolume(){
        return volume;
    };
    public int setVolume(int percentage){
        volume = percentage;
        return volume;
    };
    public int getChannel(){
        return channel;
    };
    public int setChannel(int channelSet){
        channel = channelSet;
        return channel;
    };
    
}
