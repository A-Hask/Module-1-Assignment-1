public class main {

    /* Convert from feet to meters */
    public static double footToMeter(double foot) {
        double meter = (0.305 * foot);
        System.out.println("The measurement is " + meter + "meter.");
        return meter;
    }


    /* Convert from meters to feet */
    public static double meterToFoot(double meter){
        double foot = (3.279 * meter);
        System.out.println("The measurement is " + foot + "feet.");
        return foot;
    }
}

