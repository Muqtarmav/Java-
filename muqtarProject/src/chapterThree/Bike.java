package chapterThree;

public class Bike {
    private boolean power;
    private int Deceleration;
    public boolean powerOff;
    private int Acceleration;
    public int setAcceleration;
    public int gearTwo;
    public int gearThree;
    public int gearFour;
    public int setDeceleration;
    public int decGearTwo;
    public int decGearThree;
    public int decGearFour;
    public boolean autoAcceleration;
    public boolean autoDeceleration;


    public void turnOn(boolean turnOn) {
        if (turnOn == true) ;
        power = true;
    }

    public boolean getPower() {
        return power;
    }

    public void turnOff(boolean turnOff) {
        if (turnOff == false) ;
        powerOff = false;
    }

    public boolean getPowerOff() {
        return powerOff;
    }

    public void setAcceleration() {
        if (setAcceleration > 15) ;
        Acceleration = 16;


    }

    public int getAcceleration() {
        return Acceleration;
    }

    public void setGearTwo(int setGearTwo) {
        if (setGearTwo > 24) ;
        gearTwo = 26;
    }


    public int getGearTwo() {
        return gearTwo;
    }

    public void setGearThree(int setGearThree) {
        if (setGearThree > 35) ;
        gearThree = 38;
    }

    public int getGearThree() {
        return gearThree;
    }

    public void setGearFour(int setGearFour) {
        if (setGearFour > 44) ;
        gearFour = 48;
    }

    public int getGearFour() {
        return gearFour;
    }

    public void setDeceleration() {
        if (setDeceleration < 15) ;
        Deceleration = 14;
    }

    public int getDeceleration() {
        return Deceleration;

    }

    public void setDecGearTwo(int GearTwo) {
        if (GearTwo < 24) ;
        decGearTwo = 22;
    }

    public int getDecGearTwo() {
        return decGearTwo;
    }

    public void setDecGearThree(int GearThree) {
        if (GearThree < 35) ;
        decGearThree = 32;
    }

    public int getDecGearThree() {
        return decGearThree;
    }

    public void setDecGearFour(int GearFour) {
        if (GearFour < 44) ;
        decGearFour = 40;
    }

    public int getDecGearFour() {
        return decGearFour;
    }

    public void setAutoDeceleration( int autoDecelerate) {
        if (autoDecelerate < 20) ;
        autoDeceleration = true;
    }


    public boolean getAutoDeceleration() {
        return autoDeceleration;
    }

    public void setAutoAcceleration(int autoAccelerate) {
        if (autoAccelerate >= 21);
        autoAcceleration = true;
    }

    public boolean getAutoAcceleration() {
        return autoAcceleration;

    }
}



