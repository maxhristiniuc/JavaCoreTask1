package service;

import Enums.AvailabilityStatus;
import model.Intern;
import utils.TimeHelper;

public class CommunicableImpl implements Communicable {

    private AvailabilityStatus status = AvailabilityStatus.Offline;

    public void sendMessage(Intern sender, Intern receiver, String message){

        if(receiver.getStatus() == AvailabilityStatus.Offline)
        {
            System.out.printf("Intern %s is offline. Please wait...\n", receiver);
            TimeHelper.waitTime(AvailabilityStatus.Offline.getDelay(), true);
        }
        else if(receiver.getStatus() == AvailabilityStatus.Busy)
        {
            System.out.printf("Intern %s is Busy. Please wait...\n", receiver);
            TimeHelper.waitTime(AvailabilityStatus.Busy.getDelay(), true);
        }
        else if(receiver.getStatus() == AvailabilityStatus.InMeeting)
        {
            System.out.printf("Intern %s is In meeting. Please wait...\n", receiver);
            TimeHelper.waitTime(AvailabilityStatus.InMeeting.getDelay(), true);
        }
        else
            System.out.printf("Intern %s is available!\n", receiver);

        System.out.printf("\n%s sent message: '%s' to %s", sender, message, receiver);
        receiver.receiveMessage(sender, message);
    }


    public void receiveMessage(Intern sender, Intern receiver, String message) {
        System.out.printf("\n%s received message: '%s' from %s\n", receiver, message, sender);
    }

    public AvailabilityStatus getStatus() {
        return status;
    }

    public void setStatus(AvailabilityStatus status) {
        this.status = status;
    }
}
