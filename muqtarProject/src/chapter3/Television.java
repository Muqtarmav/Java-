package chapter3;

public class Television {
    private boolean power;
    private int volume;
    private boolean channel;
    public void setOn(boolean isOn) {
        if (isOn == true) ;
        power = true;
    }
    public void setOff(boolean isOff){
    if (isOff == false);
        power = false;

    }
    public boolean getSetOn(){
        return power;

    }
    public boolean getSetOff(){
        return power;
    }

    public void increaseVolume(int increaseVolume){
        if (increaseVolume > 0);
            volume = 1;
    }
    public int getIncreaseVolume(){
        return volume;
    }
    public void decreaseVolume(int decreaseVolume){
        if (decreaseVolume < 2);
        volume = 1;
    }
    public int getDecreaseVolume(){
        return volume;
    }
    public void changeChannel(int changeChannel){
        if(changeChannel > 1);
        channel = true;
    }

    public boolean getChangeChannel(){
        return channel;
    }



}
