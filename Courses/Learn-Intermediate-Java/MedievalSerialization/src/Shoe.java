import java.io.Serializable;

public class Shoe extends Armour implements Serializable {

    /* Class Variables */
    private static final long serialVerisonUID = 1L;

    /* Constructors */
    public Shoe(String name, int durability, int defenseRating) {
        super(name, durability, defenseRating);
    }
}