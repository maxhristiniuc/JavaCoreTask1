package service;

import Enums.AvailabilityStatus;
import model.Intern;

public interface Communicable
{
    void sendMessage(Intern sender, Intern receiver, String message);
    void receiveMessage(Intern sender,Intern receiver, String message);
    AvailabilityStatus getStatus();
    void setStatus(AvailabilityStatus status);
}
