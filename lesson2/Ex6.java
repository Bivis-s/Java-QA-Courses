package lesson2;

public class Ex6 {
    public static String buildStarsString(int count) {

        StringBuilder result = new StringBuilder();
        for(int i = count; i != 0; i--) {
            result.append("*");
        }
        return result.toString();
    }

    public static void main(String[] args) {

        for(int i = 1; i <= 4; i++) {
            System.out.println(buildStarsString(i));
        }
        for(int i = 4; i  >= 1; i--) {
            System.out.println(buildStarsString(i));
        }
    }
}
