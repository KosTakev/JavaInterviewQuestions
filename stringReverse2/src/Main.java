import java.util.*;

/*
Reversing a String using Collections.reverse()
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String[] textArray = text.split("");

        ArrayList<String> textList = new ArrayList<>();
        textList.addAll(Arrays.asList(textArray));

        Collections.reverse(textList);
//        With iteration:
//        for (String s : textList) {
//            System.out.print(s);
//        }

//        With stream:
        textList
                .stream()
                .forEach(s -> System.out.print(s));
        }
    }
