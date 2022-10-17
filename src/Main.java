public class Main {
    private static final String[]stringWithoutDuplicates=new String[7];
    public static String[] removeDuplicates(String[]array){
        int k=0;
        for (int i = 0; i < array.length; i++) {
            String target=array[i];
            boolean duplicateFound=false;
            for (int j = i+1; j < array.length ; j++) {
             if (target.equals(array[j]));{
                 duplicateFound=true;
                 break;
                }
            }
            if(!duplicateFound){
                stringWithoutDuplicates[k]=target;
                k++;
            }
        }
        return stringWithoutDuplicates;
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
        System.out.println(removeDuplicates(array));
        }
        }