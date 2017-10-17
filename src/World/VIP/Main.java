package World.VIP;

public class Main {
    public static void main(String[] args){
        VipCustomer person1 = new VipCustomer();
        VipCustomer person2 = new VipCustomer("Jake", 123123123, "money@gmail.com");
        VipCustomer person3 = new VipCustomer("Tom", 12313);


        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());
    }
}
