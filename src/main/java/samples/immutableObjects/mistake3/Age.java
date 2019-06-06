package samples.immutableObjects.mistake3;

public class Age {
    private int year;

    public Age(){
        year = 0;
    }

    public Age(int year){
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
