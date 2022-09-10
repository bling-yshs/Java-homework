import java.util.Scanner;
//15位身份证号转18位身份证号
public class Upgrade15IDDigitNumberTo18IDDigit {
    public static void main(String[] args) {
        StringBuilder id = new StringBuilder(18);
        Scanner input = new Scanner(System.in);
        id.append(input.nextLine());
        id.insert(6, "19");

        char a = 0;
        int b = 0;
        int sum = 0;
        // 计算校验码

        for (int i = 0; i <= 16; i++) {
            a = id.charAt(i);
            b = (int) a - 48;
            switch (i) {
                case 0:
                    sum += b * 7;
                    break;
                case 1:
                    sum += b * 9;
                    break;
                case 2:
                    sum += b * 10;
                    break;
                case 3:
                    sum += b * 5;
                    break;
                case 4:
                    sum += b * 8;
                    break;
                case 5:
                    sum += b * 4;
                    break;
                case 6:
                    sum += b * 2;
                    break;
                case 7:
                    sum += b * 1;
                    break;
                case 8:
                    sum += b * 6;
                    break;
                case 9:
                    sum += b * 3;
                    break;
                case 10:
                    sum += b * 7;
                    break;
                case 11:
                    sum += b * 9;
                    break;
                case 12:
                    sum += b * 10;
                    break;
                case 13:
                    sum += b * 5;
                    break;
                case 14:
                    sum += b * 8;
                    break;
                case 15:
                    sum += b * 4;
                    break;
                case 16:
                    sum += b * 2;
                    break;
                default:
                    break;
            }

        }

        int num1 = sum % 11;
        char num2 = '0';
        switch (num1) {
            case 0:
                num2 = '1';
                break;
            case 1:
                num2 = '0';
                break;
            case 2:
                num2 = 'x';
                break;
            case 3:
                num2 = '9';
                break;
            case 4:
                num2 = '8';
                break;
            case 5:
                num2 = '7';
                break;
            case 6:
                num2 = '6';
                break;
            case 7:
                num2 = '5';
                break;
            case 8:
                num2 = '4';
                break;
            case 9:
                num2 = '3';
                break;
            case 10:
                num2 = '2';
                break;
            default:
                break;
        }
        id.append(num2);
        System.out.println(id.toString());
        input.close();
    }

}
