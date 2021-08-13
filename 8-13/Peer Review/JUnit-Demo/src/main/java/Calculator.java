public class Calculator {

    public int addNum(int a, int b) {
        return a + b;
    }


    public int findMaxNumber(int myArr[]) {

        int max = myArr[0];
        for (int i = 0; i < myArr.length; i++) {
            if (max < myArr[i])
                max = myArr[i];

        }
        return max;
    }

    public int getCube(int number) {
        return number * number * number;
    }

    public String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public int multipe(int a, int b) {

        return a*b;
    }


}
