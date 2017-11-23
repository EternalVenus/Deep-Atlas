package Pokemon.ItemBag.Medicine.AllMedicine;

import Pokemon.ItemBag.Medicine.Medicine;

public class HyperPotion extends Medicine {
    public HyperPotion() {
        super(  "Hyper Potion",
                "A spray-type medicine for treating wounds.\n" +
                        "It can be used to restore 120 HP to an injured Pokémon.\n",
                "Heals a Pokémon by 120 HP.\n",
                "All Poké Marts (after completing 4 trials)\n",
                750,
                1500,
                0);
    }
}
