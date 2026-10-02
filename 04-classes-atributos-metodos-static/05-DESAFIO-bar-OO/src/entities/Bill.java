package entities;

public class Bill {

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double cover() {
        if (feeding() > 30.0) {
            return 0.0;
        } else {
            return 4.0;
        }
    }

    public double feeding() {
        return (beer * 5.0) + (softDrink * 3.0) + (barbecue * 7.0);
    }

    public double ticket() {
        if (gender == 'F' || gender == 'f') {
            return 8.0;
        } else {
            return 10.0;
        }
    }

    public double total() {
        return feeding() + cover() + ticket();
    }
}