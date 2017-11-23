package Pokemon.ItemBag.Mail;

import Pokemon.ItemBag.Item.Item;

import java.util.ArrayList;

public class MailBag {
    private ArrayList<Mail> mailList;

    public MailBag(){
        this.mailList = new ArrayList<>();
    }

    public int addMail(Mail mail, int amount){
        if (this.mailList.indexOf(mail) >= 0){
            return mail.addMail(amount);
        }else{
            this.mailList.add(mail);
            return mail.addMail(amount);
        }
    }

    // If the Mail is found, the method uses the Mail and subtract the amount.
    public int useMail(Mail mail){
        // if the berry is found.
        if (this.mailList.indexOf(mail) >= 0){
            return mail.useMail();
        }else{
            System.out.println("There is no such Mail in the bag");
            return 0;
        }
    }
}
