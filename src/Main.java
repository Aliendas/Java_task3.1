public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 300;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}
