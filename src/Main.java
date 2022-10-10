import java.util.Arrays;

public class Main {
    public static Object[] removeDuplicates(String[]array){
        return Arrays.stream(array).distinct().toArray();

    }
    public static void main(String[] args) {
        String[] array = new String[7];
        array[0] = "12";
        array[1] = "34";
        array[2] = "56";
        array[3] = "78";
        array[4] = "910";
        array[5] = "12";
        array[6] = "34";
        Object[] dist=removeDuplicates(array);
        System.out.println(Arrays.toString(dist));

        }

        }


