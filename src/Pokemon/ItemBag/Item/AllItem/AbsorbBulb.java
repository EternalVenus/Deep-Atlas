package Pokemon.ItemBag.Item.AllItem;

import Pokemon.ItemBag.Item.Item;

public class AbsorbBulb extends Item {

    public AbsorbBulb() {
        super("Absorb Bulb",
                "Hold items",
                "A consumable bulb. If the holder is hit by a Water-type move, its Sp. Atk will rise.\n",
                "An item to be held by a Pokémon. It boosts Sp. Atk if hit with a Water-type attack. It can only be used once.\n",
                0);
    }
}
