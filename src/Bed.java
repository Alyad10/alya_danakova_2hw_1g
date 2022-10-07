public class Bed extends Furniture{

    private String color;
    private int yearOfIssue;

    public Bed(String color, int yearOfIssue) {
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    @Override
    public void print() {

        System.out.println("Color: " + color + " YearOfIssue: " + yearOfIssue);

    }
}
