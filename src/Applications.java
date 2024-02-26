public class Applications extends MyPhon{
    private String name;
    private String appliColour;
    private String memory;

    public Applications(String name, String appliColour, String memory) {
        super();
        this.name = name;
        this.appliColour = appliColour;
        this.memory = memory;
    }

    public Applications() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return appliColour;
    }

    public void setColour(String appliColour) {
        this.appliColour = appliColour;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
