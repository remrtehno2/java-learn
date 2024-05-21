public class ArrayChallenge {
    public static void main(String[] args) {
        Integer[] years = {2000,2001,2002,2003, 222};

        years[3] = 2020;

        for(Integer n : years) {
            System.out.println(n);
        }

        int lastIndexOfArray = years.length - 1;
                                    //5-1 = years[4]
        System.out.println(years[years.length - 1]);


    }
}
