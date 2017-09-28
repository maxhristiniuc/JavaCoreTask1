package utils;

public class TimeHelper {
    public static void waitTime(int numberOfSeconds, boolean showCount){
        try
        {
            for (int i = 0; i < numberOfSeconds; i++) {
                Thread.sleep(1000);
                if (showCount)
                    System.out.print(i + " ");
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
