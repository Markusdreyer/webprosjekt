public class Cd {
    private String regNr;
    private String artist;
    private String title;
    private int year;
    
    public Cd() {
        this("ukjent", "ukjent", "ukjent", 0);
    }
    
    public Cd(String regNr, String artist, String title, int year) {
        setRegNr(regNr);
        setArtist(artist);
        setTitle(title);
        setYear(year);
    }
    
    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public String getRegNr() {
        return regNr;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getYear() {
        return year;
    }
    
    public String toString() {
        return regNr + " " + artist + " " + title + " " + year;
    }
}
