package Pokemon.ItemBag.Medicine.AllMedicine;

import Pokemon.ItemBag.Medicine.Medicine;

public class SuperPotion extends Medicine {
    public SuperPotion() {
        super(  "Super Potion",
                "A spray-type medicine for treating wounds.\n" +
                        "It can be used to restore 60 HP to an injured Pokémon.\n",
                "Heals a Pokémon by 60 HP.\n",
                "All Poké Marts (after completing 1 trial)\n",
                350,
                700,
                0);
    }
}
