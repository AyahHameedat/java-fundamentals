package inheritance;

import java.util.LinkedList;


public abstract class Shop implements ResShoMovReview{
//    name, description, and number of dollar signs

            private String name;
            private String description;
            private String price;
            private double numOfStars = 0.0;

            private LinkedList<Review> reviewShop = new LinkedList<>();

            public Shop(String name, String description, String price, double numOfStars) {
                this.name = name;
                this.description = description;
                this.price = price;
        this.numOfStars = numOfStars;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public LinkedList<Review> getReviewShop() {
        return reviewShop;
    }



    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public double getStars() {
        return this.numOfStars;
    }


    @Override
    public LinkedList<Review> getReviews() {

        return this.reviewShop;
    }



    public void addReview(Review review){
        this.reviewShop.add(review);
        review.setPointer(this);
    }

//    public void getDollarSigh()
//    {
//        int counterDollarSign = 0;
//        for (Review revShop: getReviews()) {
////            counterDollarSign += revShop.getNumOf$();
//        }
//    }

    @Override
    public String reviewShop(){
        LinkedList<Review> review = getReviews();

        String result = "";
        for (Review rev: review) {
            result+=rev.toString();
        }
        return result;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
