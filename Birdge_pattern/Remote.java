package Birdge_pattern;

public class Remote{
    Device d;
    public Remote(Device device){
        this.d = device;
    }
    public void togglePower(){
        if(this.d.isEnalbed()){
            this.d.disable();
        }else{
            this.d.enable();
        }
    };
    public void volumeDown(){
        this.d.setVolume(this.d.getVolume()-1);
    };
    public void volumeUp(){

    };
    public void channelDown(){

    };
    public void channelup(){

    };
    
}
