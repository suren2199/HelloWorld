import java.util.Arrays;

public class Sample_Arrays {


    public static void main(String[] args) {

        // Int arrays

        int[] Numbers = new int[5];

        Numbers[0] = 10;
        Numbers[1] = 20;
        Numbers[3] = 30;

        System.out.println(Arrays.toString(Numbers));
        System.out.println(Numbers[0]);

        // String arrays

        String[] Colours = new String[10];

        Colours[1] = "Black";
        Colours[2] = "Blue";
        Colours[3] = "Red";
        Colours[8] = "Yellow";
        Colours[6] = "10";

        System.out.println(Arrays.toString(Colours));

        // Int Second arrays

        int[] Number = {10,20,30,40,50};

        System.out.println(Arrays.toString(Number));

        // Char arrays

        char[] Name = {'a', 'b', 'c'};

        System.out.println(Arrays.toString(Name));



    }


}
