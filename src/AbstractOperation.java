public abstract class AbstractOperation implements Operation {
    protected String name;

    public AbstractOperation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}