package Pokemon.ItemBag.Mail.AllMails;

import Pokemon.ItemBag.Mail.Mail;

public class BloomMail extends Mail {
    public BloomMail() {
        super("Bloom Mail",
                "Causes the secondary effect of Thief and Covet to fail when used on holder.\n" +
                        " Causes Trick and Switcheroo to fail when used by or on the holder.\n" +
                        "Causes Fling to fail when used by holder. Pokémon holding this cannot be placed in the PC.\n",
                "Azalea Town Poké Mart; Celadon Department Store\n",
                "Stationery featuring a print of pretty floral patterns. Let a Pokémon hold it for delivery.\n",
                50 ,25, 0);
    }
}
