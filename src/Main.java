import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: 23.02.2024 Озунуздун телефонунузду тузунуз.
        //  Телефонунузда томондогу мумкунчулуктор болсун :
        //  заметки, банк приложения, калькулятор .
        //  -Заметкиге озунуз каалаганча текст турундо маалыматтарды
        //  сактай алыныз жаnа аларды озгортуп очуруп колдонунуз.
        //  -Bank приложенияда озунуздун балансынызды текшеруу,
        //  башка адамдын картасына акча которуу  мумкунчулуктору болсун
        //  -Калькулятордо болсо сандарды кошуп, алып, кобойтуп, боло алыныз


        LoginPhone loginPhone = new LoginPhone();
        System.out.println(loginPhone.phoneParol());

        Bank bank = new Bank();
        Scanner scanner2 = new Scanner(System.in);
        MyPhon myPhon = new MyPhon();
        System.out.println("IPHONE:");
        myPhon.setName("Iphone");
        myPhon.setModel("Iphone 14");
        myPhon.setPhonMemory("256.GB");
        System.out.println("name :" + myPhon.getName() + "\n" + "model :" +
                myPhon.getModel() + "\n" + "memory :" +
                myPhon.getPhonMemory());

        System.out.println("================================");
        System.out.println(" ");

        System.out.println("Приложения:");
        Applications applications = new Applications();
        applications.setName("Pubg");
        applications.setColour("black");
        System.out.println(applications.getColour() + "\n" + applications.getName());

        System.out.println("=======================");
        System.out.println(" ");

        Notes notes = new Notes();
        System.out.println("ЗAМЕТКА:  ");
        notes.setNotesName("Заметка");
        notes.setNotesColor("Желтый");
        System.out.println("Цветь :" + notes.getNotesColor() + "\n" + "Названия приложению :" + notes.getNotesName());
        System.out.println(" ");
        System.out.println(notes.newText());
        System.out.println("====================");
        System.out.println(" ");

        System.out.println("Калкульятор:");
        Calculator calculator = new Calculator();
        System.out.println("Кошуу");
        calculator.pilyus();
        System.out.println("Кемитуу");
        calculator.minus();
        System.out.println("Кобойтуу");
        calculator.miltiplication();

        System.out.println("Enter number 3: 3)It's Bank: ");
        int choice1 = scanner2.nextInt();
        while (true) {
            switch (choice1) {
                case 3:
                    System.out.println("""
                            1)checkBalance
                            2)deposit
                            3)withdraw
                            4)transaction""");
                    int choice2 = scanner2.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("Check your balance: ");
                            bank.checkBalance();
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("Do deposit: ");
                            double deposit = scanner2.nextDouble(); //225
                            bank.deposit(deposit);
                            break;
                        case 3:
                            System.out.println("Do withdraw: ");
                            double withdraw = scanner2.nextDouble(); //220
                            bank.withdraw(withdraw);

                        case 4:
                            System.out.println("Напишите фамилия затем имя: " + scanner2.nextLine());
                            String name = scanner2.nextLine();
                            switch (name) {
                                case "Kudayberdi Gapurov" -> {
                                    System.out.println(" введите количество: ");
                                    double transaction = scanner2.nextDouble();
                                    bank.transaction(transaction);
                                    return;
                                }


                            }
                    }
            }


        }
    }
}




