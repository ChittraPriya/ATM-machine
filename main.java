public class Main {
        public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            System.out.println("Hello and welcome!");

            public class ATM {
                private double balance;

                public ATM(double initialBalance) {
                    this.balance = initialBalance;
                }

                public double checkBalance() {
                    return balance;
                }

                public void deposit(double amount) {
                    balance += amount;
                    System.out.println("Deposited: $" + amount);
                }

                public void withdraw(double amount) {
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawn: $" + amount);
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                }

                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();

                    ATM atm = new ATM(initialBalance);

                    while (true) {
                        System.out.println("\nATM Menu:");
                        System.out.println("1. Check Balance");
                        System.out.println("2. Deposit");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice: ");
                        int choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Your balance: $" + atm.checkBalance());
                                break;
                            case 2:
                                System.out.print("Enter deposit amount: $");
                                double depositAmount = scanner.nextDouble();
                                atm.deposit(depositAmount);
                                break;
                            case 3:
                                System.out.print("Enter withdrawal amount: $");
                                double withdrawalAmount = scanner.nextDouble();
                                atm.withdraw(withdrawalAmount);
                                break;
                            case 4:
                                System.out.println("Thank you for using our ATM. Goodbye!");
                                System.exit(0);
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    }
                }
            }
        }
