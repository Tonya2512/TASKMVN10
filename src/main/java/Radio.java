public class Radio {
    private int currentStation;
    private int currentVolume;
    private int increaseVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int setIncreaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;

        }
        if (currentVolume > 100) {
            return currentVolume;
        }
        this.currentVolume = currentVolume;

        return currentVolume;
    }

    public int setReduceVolume(int currentVolume) {
        if (currentVolume > 100) {
            return currentVolume;
        }
        this.currentVolume = currentVolume;

        return currentVolume;
    }
}







