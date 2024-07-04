
    import java.util.Scanner;

public class calculator {
    
        private static int choice;
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            do {
                
                System.out.println("\n***** Calculator Menu *****");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
    
                int choice = scanner.nextInt();
            
                //Switch Case is applied here
                switch (choice) {
                    case 1:
                        calculate('+', scanner);
                        break;
                    case 2:
                        calculate('-', scanner);
                        break;
                    case 3:
                        calculate('*', scanner);
                        break;
                    case 4:
                        calculate('/', scanner);
                        break;
                    case 5:
                        System.out.println("Exiting calculator...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 5); 
    
            scanner.close(); 
        }
    
        public static void calculate(char operator, Scanner scanner) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
    
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
    
            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:

                    System.out.println("Unexpected error.");
                    return;
            }
    
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
       

