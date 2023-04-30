public class SleepSchedule {
        private int hoursToSleep;
        private int hoursToWake;
    
        public SleepSchedule(int hoursToSleep, int hoursToWake) {
            this.hoursToSleep = hoursToSleep;
            this.hoursToWake = hoursToWake;
        }
    
        public void printSleepSchedule() {
            System.out.println("Time to go to sleep: " + this.hoursToSleep + " hours before wake up time");
            System.out.println("Time to wake up: " + this.hoursToWake + " hours after sleep time");
        }
    
        public static void main(String[] args) {
            SleepSchedule mySchedule = new SleepSchedule(8, 6);
            mySchedule.printSleepSchedule();
        }
    }
    