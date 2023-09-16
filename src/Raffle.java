import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Raffle {
    private List<Toy> toys;

    public Raffle() {
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy){
        toys.add(toy);
    }

    public void updateToyFrequencies(int toyId, int newFrequencies) {
        for (Toy toy : toys) {
            if (toy.getIdToy() == toyId) {
                toy.setFrequenciesToy(newFrequencies);
                break;
            }
        }
    }

    public Toy choosePrizeToy() {
        List<Toy> availableToys = new ArrayList<>();
        int totalFrequencies = 0;

        for (Toy toy : toys) {
            if (toy.isAvailable()) {
                availableToys.add(toy);
                totalFrequencies += toy.getFrequenciesToy();
            }
        }

        Random random = new Random();
        int randomNumber = random.nextInt(totalFrequencies) + 1;

        int accumulatedFrequencies = 0;
        for (Toy toy : availableToys) {
            accumulatedFrequencies += toy.getFrequenciesToy();
            if (randomNumber <= accumulatedFrequencies)
                return toy;
        }

        return null;
    }

    public void rewardPrizeToy() {
        Toy prizeToy = choosePrizeToy();
        if (prizeToy != null) {
            prizeToy.decreaseQuantity();
            prizeToy.saveToFile();
        }
    }

}
