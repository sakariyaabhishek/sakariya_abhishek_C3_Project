import java.time.LocalTime;
// This is a testing code ///
class Main {
    public static void main(String[] args) throws restaurantNotFoundException {
        RestaurantService res1 = new RestaurantService();
        res1.addRestaurant("Silk Board", "Mars", LocalTime.of(9, 30), LocalTime.of(22, 00));
        System.out.println(res1.findRestaurantByName("Silk Board").getName());

        Restaurant restObj = new Restaurant("Silk Board", "Mars", LocalTime.of(9, 30), LocalTime.of(22, 00));
        System.out.println(restObj.isRestaurantOpen());
    }
}