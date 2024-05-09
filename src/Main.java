public class Main {
    public static void main(String[] args) {
         Restaurant obj1 = new  Restaurant( "Status", " Green 25", "09:00-22:00");
         Personnel obj2 = new  Personnel( 30,15 , 5);
         Menu obj3=new Menu( "Lasagna", "Salad","OrangeJuice");


        System.out.println(" Клас  Restaurant ");
       // System.out.println(" У ресторані- " + obj1.getName()  + "за адресою -" + obj1.getAdress()  + ",робочий час :"+ obj1.getWorktime() );
    obj1.Information();

        System.out.println(" Клас  Personnel ");
        // System.out.println(" Загальна кількість персоналу: " +"" +( obj2.getCooks()+obj2.getWaiters()+obj2.getGuards()));
      obj2.findAmount();

        System.out.println(" Клас  Menu");
         System.out.println("В меню є:" +"" +obj3.getHotmeals()+","+obj3.getAppetizer()+","+obj3.getDrinks());

       obj3.getOrder(" hasallergy");

        obj3.printWhichMenu();



    }
    }




