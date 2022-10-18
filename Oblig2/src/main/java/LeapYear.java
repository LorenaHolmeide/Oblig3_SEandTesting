public class LeapYear {
    public static boolean isLeapYear(int year) {

        if (year % 400 == 0 && year % 4000!=0){
        return true;
        }
        if (year % 100==0){
            return false;
        }
        if (year % 4000 ==0){
            return false;
        }
        return (year >= 1583 && year % 4 == 0);
    }
}
