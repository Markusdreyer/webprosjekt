import java.util.ArrayList;

public class CdClient {
    public void mainMethod() {
        ArrayList<Cd> cdList = new ArrayList<Cd>();
        cdList.add(new Cd("1234", "Artist1", "Tittel1", 2010));
        cdList.add(new Cd("2341", "Artist2", "Tittel2", 2011));
        cdList.add(new Cd("3412", "Artist3", "Tittel3", 2012));
        cdList.add(new Cd("4123", "Artist4", "Tittel4", 2013));
        
        for (Cd cd : cdList) {
            System.out.println(cd.toString());
        }
    }
}
