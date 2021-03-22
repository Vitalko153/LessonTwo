public class LessonTwo {

    static int SIZE = 4;

    public static void main(String[] args) {

        String[][] arr = {
                {"10", "45", "6", "15"},
                {"5", "12", "78","3"},
                {"92", "46", "16", "10"},
                {"78", "4", "52", "34"}
        };

        try {
            sum(arr);
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyDataSizeException e){
            e.printStackTrace();
        }
    }


    public static void sum(String[][] arr) throws MyArraySizeException, MyDataSizeException{
        /**
         *
         * @param arr = строковой массив.
         * @param sum = сумма всех чисел массива
         * @throws MyArraySizeException = проверка на соответствие размера массива с константой SIZE.
         * @throws MyDataSizeException = поиск ошибок при преобразование строки в число.
         */

        if(arr.length != SIZE){
            throw new MyArraySizeException();
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length != SIZE){
                throw new MyArraySizeException();
            }
        }
                int sum = 0;
                for (int x = 0; x < arr.length; x++){
                    for(int y =0; y < arr[x].length; y++) {
                        try {
                            sum += Integer.parseInt(arr[x][y]);
                        }catch (NumberFormatException e){
                        throw new MyDataSizeException("Ошибка в массиве " + x + ":" + y + ", введено " + arr[x][y], x, y);
                    }
            }
            }
        System.out.printf("Общая сумма массива размером %d X %d = %d", SIZE, SIZE, sum);
    }
}
