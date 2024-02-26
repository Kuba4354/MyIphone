public class MyPhon {
    private String name;
    private String model;
    private String phonMemory;

    public MyPhon(String name, String model, String phonMemory) {
        this.name = name;
        this.model = model;
        this.phonMemory = phonMemory;
    }

    public MyPhon() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPhonMemory() {
        return phonMemory;
    }

    public void setPhonMemory(String phonMemory) {
        this.phonMemory = phonMemory;
    }
}
