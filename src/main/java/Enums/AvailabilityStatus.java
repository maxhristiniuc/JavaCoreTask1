package Enums;

public enum AvailabilityStatus
{
    Busy(5),
    Available(0),
    Offline(20),
    InMeeting(15);

    private int delay;

    AvailabilityStatus(int delay) {
        this.delay = delay;
    }

    public int getDelay() {
        return delay;
    }
}
