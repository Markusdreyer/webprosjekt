public class WeekDays {
    public String weekDay(int dayNumber) {
        String day = "";
        switch(dayNumber) {
            case 1: day = "Mandag";
            break;
            case 2: day = "Tirsdag";
            break;
            case 3: day = "Onsdag";
            break;
            case 4: day = "Torsdag";
            break;
            case 5: day = "Fredag";
            break;
            case 6: day = "Lørdag";
            break;
            case 7: day = "Søndag";
            break;
            default: day = "Ukjent";
        }
        return day;
    }

    public void mainMethod() {
        for (int dag = 1; dag <= 7; dag++) {
            String ukedag = weekDay(dag);
            System.out.println(ukedag);
        }
    }
}
