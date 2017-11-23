package Pokemon.ItemBag.Medicine.AllMedicine;

import Pokemon.ItemBag.Medicine.Medicine;

public class Potion extends Medicine {
    public Potion() {
        super("Potion",
                "A spray-type medicine for treating wounds.\n" +
                        "It can be used to restore 20 HP to an injured Pokémon.\n",
                "Heals a Pokémon by 20 HP.\n",
                "All Poké Marts\n",
                100,
                200,
                0);
    }
}
