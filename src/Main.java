public class Main {
    public static void main(String[] args) {
         Restaurant obj1 = new  Restaurant( "Status", " Green 25", "09:00-22:00");
         Personnel obj2 = new  Personnel( 30,15 , 5);
         Menu obj3 = new  Menu( 35, 45, 20);


        System.out.println(" Клас  Restaurant ");
        System.out.println(" У ресторані- " + obj1.getName()  + "за адресою -" + obj1.getAdress()  + ",робочий час :"+ obj1.getWorktime() );


        System.out.println(" Клас  Personnel ");
        System.out.println(" Загальна кількість персоналу: " +"" +( obj2.getCooks()+obj2.getWaiters()+obj2.getGuards()));


        System.out.println(" Клас  Menu");
        System.out.println("Кількість страв:" +"" +(obj3.getHotmeals()+obj3.getAppetizer()+obj3.getDrinks()));

    }



}