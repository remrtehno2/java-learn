public class Anom {
    public static void main(String[] args) {


        interface T {
            int x = 5;

            default int getX() {
                return 5;
            }
        }


        T newTClass = new T() {
            @Override
            public String toString() {
                return "String";
            }
        };

        System.out.println(newTClass.x + newTClass.getX() + newTClass.toString());
        System.out.println(new Object());

        System.out.println("-----------------------");
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(321123));
        System.out.println(isPalindrome(0121));
        System.out.println(isPalindrome(0321123));
    }

    public static boolean isPalindrome(int x) {
        // 121 -> "121" -> split [1, 2, 1] - [3, 2, 1, 2, 3]
        // 333
        // 303
        // 33

        // Преобразуем число в строку
        String num1 = Integer.toString(x);
        String[] intArray = num1.split("");

        int end = intArray.length;
        for (int start = 0; start < intArray.length / 2; start++) {
            // System.out.println("start " + intArray[start]);
            // System.out.println("end " + intArray[--end]);
            if (!intArray[start].equals(intArray[--end])) {
                return false;
            }
        }


        return true;

    }
}
