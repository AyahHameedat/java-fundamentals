/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("-------------------------- Restaurant --------------------------");
        Restaurant();
    }


public static void Restaurant() {

    Restaurant restaurant1 = new Restaurant("Vogo", "4$", 2);
    Review review1 = new Review("Noraml taste" ,"AYA" ,3);
    Review review2 = new Review("Noraml taste" ,"AYA" ,4);
    Review review3 = new Review("GOOOOD taste" ,"AYA" ,5);
    Review review4 = new Review("Ver GOOOD taste" ,"AYA" ,1.6);


    restaurant1.addReview(review1);
    restaurant1.addReview(review2);
    restaurant1.addReview(review3);
    restaurant1.addReview(review4);

    restaurant1.getStars();

    System.out.println(restaurant1.toString());

    System.out.println("-----------------------------------------");

    Shop shop1 = new Shop("Mango", "Verrrry Good", "5$",2.5) {
        @Override
        public String reviewTheater() {
            return null;
        }
    };

    Review review11 = new Review("Noraml" ,"AYA" ,3);
    Review review12 = new Review("Noraml" ,"AYA" ,1);
    Review review13 = new Review("Noraml" ,"AYA" ,4);
    shop1.addReview(review11);
    shop1.addReview(review12);
    shop1.addReview(review13);
    System.out.println("***********************New**************************");
    System.out.println(shop1.getName());
    System.out.println(shop1.getStars());
    System.out.println(shop1.toString());

    Theater movie1 = new Theater("Anne with an E", 3) {
        @Override
        public String reviewTheater() {
            return null;
        }

        @Override
        public String reviewShop() {
            return null;
        }
    };
    System.out.println("---------------------------Movie-------------------------------------------");


    System.out.println("------------------------------ AYA1 ----------------------------------------");

    movie1.addReview(new movieReview("aya","aya",2.5,"aya"));
    System.out.println("----------------------------------AYA2-------------------------------------");

    movie1.addReview(new Review("aya","aya",2.5));
    System.out.println(movie1.getReviews());
    System.out.println(movie1.getStars());
    System.out.println("------------------------------------------------------------------------");

    movie1.addMovie("Movie1");
    movie1.addMovie("Movie2");
    movie1.addMovie("Movie3");


    movie1.removeMovie("Movie2");
    System.out.println(movie1.getMovie());


    }

}
