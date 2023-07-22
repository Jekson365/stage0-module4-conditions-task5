package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        String result;
        switch (year % 400) {
            case 0:
                result = "leap";
                break;
            default:
                switch (year % 100) {
                    case 0:
                        result = "not leap";
                        break;
                    default:
                        switch (year % 4) {
                            case 0:
                                result = "leap";
                                break;
                            default:
                                result = "not leap";
                                break;
                        }
                }
        }
        System.out.println(result);
    }
}
