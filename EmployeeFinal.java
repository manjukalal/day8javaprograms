public class EmployeeFinal {

    public static final int rateperhrs = 20;
    public static final int fulltime = 1;
    public static final int parttime = 2;
    public static final int maxhrs = 100;
    public static final int noworkingdays = 20;

    public static void main(String[] args) {

        int emphr = 0;
        int totalemphrs = 0;

        int totalworkingdays = 0;
        int empwage = 0;
        while (totalemphrs <= maxhrs && totalworkingdays < noworkingdays) {
            totalworkingdays++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empcheck) {
                case 1:
                    emphr = 4;
                    break;

                case 2:
                    emphr = 8;
                    break;

                default:
                    emphr = 0;
            }
            totalemphrs += emphr;


            System.out.println(totalworkingdays + "emphrs" + emphr);
        }
        empwage = (emphr * rateperhrs);
        System.out.println("per day emp wage for" + emphr + "is:" + empwage);
        int hrs = totalemphrs * rateperhrs;
        System.out.println("total wage for" + totalemphrs + "hrs is :" + hrs);

    }
}
