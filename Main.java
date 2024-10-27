import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Do You Want Normal Pizza or Deluxe pizza");

        System.out.println(" a. Pizza ");
        System.out.println(" b. Deluxe Pizza");

        String c = s.nextLine();
        if(String.valueOf(c).contains("a") && !String.valueOf(c).contains("b")) {

            System.out.println("Enter 'v' If You Want Veg Pizza ");
            System.out.println("Enter 'n' If You Want Non-Veg Pizza ");

            String d = s.nextLine();

            if(String.valueOf(d).contains("v")){
                Pizza base = new Pizza(true);

                System.out.println("Do You Want Extra Addition in Your Pizza Order ");

                System.out.println(" 1. Extra Cheese");
                System.out.println(" 2. Extra Toppings");
                System.out.println(" 3. Extra Onion");
                System.out.println(" 4. Take Away");

                int b = s.nextInt();


                if(String.valueOf(b).contains("1")) {
                    base.addExtraCheese();
                }
                if(String.valueOf(b).contains("2")) {
                    base.addExtraToppings();
                }
                if(String.valueOf(b).contains("3")) {
                    base.addExtraOnion();
                }
                if(String.valueOf(b).contains("4")) {
                    base.takeAway();
                }

                System.out.println("How Many No. Of Pizza's You Want!");
                int y = s.nextInt();



                base.getBill(y);


            }
            if(String.valueOf(d).contains("n")){
                Pizza base = new Pizza(false);

                System.out.println("Do You Want Extra Addition in Your Pizza Order ");

                System.out.println(" 1. Extra Spice");
                System.out.println(" 2. Extra Chicken");
                System.out.println(" 3. Extra Onion");
                System.out.println(" 4. Take Away");

                int b = s.nextInt();


                if(String.valueOf(b).contains("1")) {
                    base.addExtraSpice();
                }
                if(String.valueOf(b).contains("2")) {
                    base.addExtraChicken();
                }
                if(String.valueOf(b).contains("3")) {
                    base.addExtraOnion();
                }
                if(String.valueOf(b).contains("4")) {
                    base.takeAway();
                }

                System.out.println("How Many No. Of Pizza's You Want!");
                int y = s.nextInt();



                base.getBill(y);


            }

        }


        if(String.valueOf(c).contains("b") && !String.valueOf(c).contains("a")) {

            System.out.println("Enter 'v' If You Want Veg Pizza ");
            System.out.println("Enter 'n' If You Want Non-Veg Pizza ");

            String b = s.nextLine();

            if(String.valueOf(b).contains("v")){

                DeluxePizza dp = new DeluxePizza(true);


                System.out.println("Do You Want Take Away : yes or no ");
                String x = s.nextLine();

                if(String.valueOf(x).contains("yes")){
                    dp.takeAway();
                }
                if(String.valueOf(x).contains("no")){

                }

                System.out.println("How Many No. Of Pizza's You Want!");
                int y = s.nextInt();


                dp.getBill(y);
            }



            if(String.valueOf(b).contains("n")){

                DeluxePizza dp = new DeluxePizza(false);

                System.out.println("Do You Want Take Away : yes or no ");
                String x = s.nextLine();

                if(String.valueOf(x).contains("yes")){
                    dp.takeAway();
                }
                if(String.valueOf(x).contains("no")){

                }

                System.out.println("How Many No. Of Pizza's You Want!");
                int y = s.nextInt();


                dp.getBill(y);
            }
        }

        if(String.valueOf(c).contains("a") && String.valueOf(c).contains("b")){
            System.out.println();

            System.out.println("This is for Normal Pizza Select Options");
            System.out.println();

            System.out.println(" 1. Veg Pizza");
            System.out.println(" 2. Non-Veg Pizza");


            String p = s.nextLine();

            if(String.valueOf(p).contains("1")){
                Pizza base = new Pizza(true);

                System.out.println("Do You Want Extra Addition in Your Pizza Order ");

                System.out.println(" 1. Extra Cheese");
                System.out.println(" 2. Extra Toppings");
                System.out.println(" 3. Extra Onion");
                System.out.println(" 4. Take Away");

                int b1 = s.nextInt();


                if(String.valueOf(b1).contains("1")) {
                    base.addExtraCheese();
                }
                if(String.valueOf(b1).contains("2")) {
                    base.addExtraToppings();
                }
                if(String.valueOf(b1).contains("3")) {
                    base.addExtraOnion();
                }
                if(String.valueOf(b1).contains("4")) {
                    base.takeAway();
                }

                System.out.println("How Many No. Of Pizza's You Want!");
                int y = s.nextInt();



                base.getBill(y);
            }

            if(String.valueOf(p).contains("2")){


                Pizza base = new Pizza(false);

                System.out.println("Do You Want Extra Addition in Your Pizza Order ");

                System.out.println(" 1. Extra Spice");
                System.out.println(" 2. Extra Chicken");
                System.out.println(" 3. Extra Onion");
                System.out.println(" 4. Take Away");

                int b1 = s.nextInt();


                if(String.valueOf(b1).contains("1")) {
                    base.addExtraSpice();
                }
                if(String.valueOf(b1).contains("2")) {
                    base.addExtraChicken();
                }
                if(String.valueOf(b1).contains("3")) {
                    base.addExtraOnion();
                }
                if(String.valueOf(b1).contains("4")) {
                    base.takeAway();
                }

                System.out.println("How Many No. Of Pizza's You Want!");
                int y = s.nextInt();



                base.getBill(y);
            }
            System.out.println();

            System.out.println("This is for Deluxe Pizza Select Options");
            System.out.println();

            System.out.println("Enter 'v' If You Want Veg Pizza ");
            System.out.println("Enter 'n' If You Want Non-Veg Pizza ");

            String b1 = s.nextLine();

            String b = s.nextLine();

            if(String.valueOf(b).contains("v")){

                DeluxePizza dp = new DeluxePizza(true);


                System.out.println("Do You Want Take Away : yes or no ");
                String x = s.nextLine();

                if(String.valueOf(x).contains("yes")){
                    dp.takeAway();
                }
                if(String.valueOf(x).contains("no")){

                }

                System.out.println("How Many No. Of Pizza's You Want!");
                int y = s.nextInt();


                dp.getBill(y);
            }



            if(String.valueOf(b).contains("n")){

                DeluxePizza dp = new DeluxePizza(false);

                System.out.println("Do You Want Take Away : yes or no ");
                String x = s.nextLine();

                if(String.valueOf(x).contains("yes")){
                    dp.takeAway();
                }
                if(String.valueOf(x).contains("no")){

                }

                System.out.println("How Many No. Of Pizza's You Want!");
                int y = s.nextInt();


                dp.getBill(y);
            }
        }
    }
}
