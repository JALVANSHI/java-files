import java.util.Scanner;
class switch1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the day:");
        int day=sc.nextInt();
        System.out.println("enter the day:"+day);
        switch (day) {
        case 1:
        System.out.println("the day is Monday");
        break;
        case 2:
        System.out.println("the day is tuesday");
        break;
        case 3:
        System.out.println("the day is Wednesday");
        break;
        case 4:
        System.out.println("the day is thursday");
        break;
        case 5:
        System.out.println("the day is Friday");
        break;
        case 6:
        System.out.println("the day is Saturday");
        break;
        case 7:
        System.out.println("the day is Sunday");
        break;
        default:
        System.out.println("the day is invalid");
        break;
        }
       
    }
}