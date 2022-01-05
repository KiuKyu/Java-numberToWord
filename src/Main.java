import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.print("Nhập vào số cần đọc: ");
        int inputNum = inputNumber.nextInt();
        String strNum = "";
        switch (inputNum) {
            case 0: {
                strNum = "Zero";
                break;
            }
            case 1: {
                strNum = "One";
                break;
            }
            case 2: {
                strNum = "Two";
                break;
            }
            case 3: {
                strNum = "Three";
                break;
            }
            case 4: {
                strNum = "Four";
                break;
            }
            case 5: {
                strNum = "Five";
                break;
            }
            case 6: {
                strNum = "Six";
                break;
            }
            case 7: {
                strNum = "Seven";
                break;
            }
            case 8: {
                strNum = "Eight";
                break;
            }
            case 9: {
                strNum = "Nine";
                break;
            }
            case 10: {
                strNum = "Ten";
                break;
            }
            case 11: {
                strNum = "Eleven";
                break;
            }
            case 12: {
                strNum = "Twelve";
                break;
            }
            case 13: {
                strNum = "Thirteen";
                break;
            }
            case 14: {
                strNum = "Fourteen";
                break;
            }
            case 15: {
                strNum = "Fifteen";
                break;
            }
            case 16: {
                strNum = "Sixteen";
                break;
            }
            case 17: {
                strNum = "Seventeen";
                break;
            }
            case 18: {
                strNum = "Eighteen";
                break;
            }
            case 19: {
                strNum = "Nineteen";
                break;
            }
            case 20: {
                strNum = "Twenty";
                break;
            }
            default: {
                strNum = "Out of ability";
                break;
            }
        }
        System.out.println(strNum);
    }
}
