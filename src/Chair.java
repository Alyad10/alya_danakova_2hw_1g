import java.io.PrintStream;

public class Chair extends Furniture {
    private String material;
    private String form;

    public Chair(String material, String form) {
        this.material = material;
        this.form = form;
    }

    public String getMaterial() {
        return material;
    }

    public String getForm() {
        return form;
    }

    @Override
    public void print() {
        System.out.println("Material: " + material + " Form: "+ form);

    }
}


