package model;

import Enums.AvailabilityStatus;
import Interfaces.*;
import service.Communicable;
import service.CommunicableImpl;
import utils.TimeHelper;

import java.util.Random;

public class Intern extends Human
        implements CodeReader, LunchBreak,
        TaskSolver, Trainable, TutorialWatcher
{
    private Communicable commEngine = new CommunicableImpl();

    public Intern(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void readCode() {
        System.out.println("Reading...");
        commEngine.setStatus(AvailabilityStatus.Busy);
        TimeHelper.waitTime(1, false);
    }

    public void eat() {
        System.out.println("Eating...");
        commEngine.setStatus(AvailabilityStatus.Offline);
        TimeHelper.waitTime(1, false);
    }

    public void solveTask() {
        System.out.println("Solving...");
        commEngine.setStatus(AvailabilityStatus.Busy);
        TimeHelper.waitTime(1, false);
    }

    public void watchTutorial() {
        System.out.println("Watching tutorials...");
        commEngine.setStatus(AvailabilityStatus.Busy);
        TimeHelper.waitTime(1, false);
    }

    public void training() {
        System.out.println("Learning...");
        commEngine.setStatus(AvailabilityStatus.InMeeting);
    }

    @Override
    public void doActivity() {
        Random rand = new Random();
        int activitiesCount = rand.nextInt(6);

        switch (activitiesCount) {
            case 0:
                readCode();
                break;
            case 1:
                eat();
                break;
            case 2:
                solveTask();
                break;
            case 3:
                training();
                break;
            case 4:
                watchTutorial();
                break;
            default:
                commEngine.setStatus(AvailabilityStatus.Available);
                break;
        }
    }

    public void sendMessage(Intern receiver, String message) {
        commEngine.sendMessage(this, receiver, message);
    }

    public void receiveMessage(Intern sender, String message) {
        commEngine.receiveMessage(sender, this, message);
    }

    public AvailabilityStatus getStatus() {
        return commEngine.getStatus();
    }
}

