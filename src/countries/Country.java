package countries;

public class Country {
    private String name;

    public Country(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  this.name + '\n';
    }

    public String getName() {
        return name;
    }

}
