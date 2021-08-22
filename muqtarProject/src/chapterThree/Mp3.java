package chapterThree;

public class Mp3 {
    private boolean power;
    private int volume;
    public void setOn(boolean isOn) {
        if (isOn == true) ;
        power = true;
    }
    public void setOff(boolean isOff) {
        if (isOff == false) ;
        power = false;
        }

        public boolean getPower(){
        return power;
        }
        public void increaseVolume ( int increaseVolume){
            if (increaseVolume > 0) ;
            volume = 1;
        }
        public int getIncreaseVolume () {
            return volume;
        }
        public void decreaseVolume ( int decreaseVolume){
            if (decreaseVolume < 2) ;
            volume = 1;
        }
        public int getDecreaseVolume () {
            return volume;
        }


    }








