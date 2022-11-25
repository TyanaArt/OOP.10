public class Radio {
    protected int currentVolume;
    protected int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void enlarge() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
            currentVolume = 10;
        }
    }

    public void reduse() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if(currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }

        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation < 9){
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0){
            currentStation--;
        } else {
            currentStation = 9;
        }
    }
}

