public class Main 
{
    public static void main(String[]args)
    { 
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        
        // for (int i=10; i<15; i++) schedule[1][i] = true;
        //a.printPeriod(2);

       a.findFreeBlock(2,15);

    }
}