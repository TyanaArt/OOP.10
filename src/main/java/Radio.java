public class Radio {

    protected int currentVolume;
    protected int maxVolume;
    protected int minVolume;
    protected int currentStation;
    protected int maxStation;
    protected int minStation;

    public Radio() {
        maxVolume = 10;
        minVolume = 0;
        maxStation = 9;
        minStation = 0;

    }

    public Radio(int countStation) {
        maxStation = countStation - 1;
        //this.countStation = countStation;
        maxVolume = 100;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void enlarge() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reduce() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if(currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return ;
        }

        this.currentStation = currentStation;
    }

    public void next() {

        if (currentStation < maxStation){
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation){
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }
}

