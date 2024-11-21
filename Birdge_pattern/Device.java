package Birdge_pattern;

interface Device{
    public boolean isEnalbed();
    public void enable();
    public void disable();
    public int getVolume();
    public int setVolume(int percentage);
    public int getChannel();
    public int setChannel(int channel);

}