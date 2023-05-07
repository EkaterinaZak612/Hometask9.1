public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private final int MAX_VOLUME = 100;
    private final int MIN_VOLUME = 0;

    public Radio() {
        this.maxStation = 10; // По умолчанию 10 станций
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setCurrentStation(int station) {
        if (station < 0 || station >= maxStation) {
            return;
        }
        currentStation = station;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation == maxStation - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxStation - 1;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < MAX_VOLUME) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > MIN_VOLUME) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= MIN_VOLUME && currentVolume <= MAX_VOLUME) {
            this.currentVolume = currentVolume;
        }
    }

    public int getMaxStation() {
        return maxStation;
    }
}
