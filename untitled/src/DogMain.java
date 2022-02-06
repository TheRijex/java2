public class DogMain {
    public static void main(String[] args) {
        dogprtp dog1 = new dogprtp();
        dogprtp dog2 = new dogprtp();

        dog1.speed = 4;
        dog1.run();
        System.out.println(dog1.info());
    }
}
