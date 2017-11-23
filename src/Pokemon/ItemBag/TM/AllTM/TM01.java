package Pokemon.ItemBag.TM.AllTM;

import Pokemon.ItemBag.TM.TM;

public class TM01 extends TM{
    public TM01() {
        super("TM01",
                "Work Up",
                "Status",
                "Normal",
                "The user is roused, and its Attack and Sp. Atk stats increase.\n",
                "Work Up raises the user's Attack and Special Attack stats by one stage each.\n" +
                        "If powered up by a Normalium Z into Z-Work Up, the user's Attack stat is raised by an additional one stage.\n",
                30, 0, 100);
    }
}
