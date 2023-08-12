package item17;

public class CanModify {

    private String name;

    public CanModify(final String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
