public class NameScanner {
    public static void main(String[] args) {

        String[] namesArray = new String[5];

        Utils.fillArrayWithNames(namesArray);
        System.out.println(">>>>>>> Reverse order : >>>>>>>");
        Utils.displayArray(namesArray);
    }
}
