public class Main {
    public static void main(String[] args) {
        //1 continue break
        //2 calc by sheself
        //3 Refactoring, functions just reusable with args for Menu
        //4 Explaining Throw Error for what, try catch(many) finally(guarantee)/ RuntimeExecption is not mandatory to be treated, not Error -
        //  4.1 [method](int a) throws Exception .... { ...
        //  4.2 Inherited methods trhows, ССУЖАТЬ ОБЛАСТЬ ИСКЛЮЧЕНИЙ ИЗ ОБЩИХ В БОЛЕЕ ТОЧНЕЕ

        LABEL1:
        for (int i = 0; i < 10; i++) {
            LABEL4:
            for (int j = 0; j < 10; j++) {
                if (j == 9) break LABEL4;
                System.out.print(j);

                LABEL10:
                for (int k = 0; k < 10; k++) {
                    break LABEL4;
                }
            }
            System.out.print(i);
            break LABEL1;
        }
    }
}
