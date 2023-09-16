import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Toy {
    private int idToy;
    private String nameToy;
    private int quantityToy;
    private int frequenciesToy;

    public Toy(int idToy, String nameToy, int quantityToy, int frequenciesToy) {
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.quantityToy = quantityToy;
        this.frequenciesToy = frequenciesToy;
    }

    public int getIdToy() {
        return idToy;
    }

    public String getNameToy() {
        return nameToy;
    }

    public int getQuantityToy() {
        return quantityToy;
    }

    public int getFrequenciesToy() {
        return frequenciesToy;
    }

    public void setFrequenciesToy(int frequenciesToy) {
        this.frequenciesToy = frequenciesToy;
    }

    public void decreaseQuantity() {
        quantityToy--;
    }

    public boolean isAvailable() {
        return quantityToy > 0;
    }

    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))) {
            writer.write("ID: " + idToy + ", name: " + nameToy + ", quantity: " + quantityToy + ", frequencies: " + frequenciesToy);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
