package Pokemon.ItemBag.Mail.AllMails;

import Pokemon.ItemBag.Mail.Mail;

public class AirMail extends Mail{
    public AirMail() {
        super("Air Mail",
                "Causes the secondary effect of Thief and Covet to fail when used on holder.\n"+
                        " Causes Trick and Switcheroo to fail when used by or on the holder. Causes Fling to fail when used by holder.\n" +
                        "Pokémon holding this cannot be placed in the PC.\n",
                "Cherrygrove City, Ecruteak City, Blackthorn City, Cerulean City, Saffron City, and Vermilion City Poké Marts;\n" +
                        "Celadon Department Store; Mahogany Town souvenir shop; Safari Zone Gate.\n",
                "Stationery featuring a print of colorful letter sets. Let a Pokémon hold it for delivery.\n",
                50 ,25, 0);
    }
}
