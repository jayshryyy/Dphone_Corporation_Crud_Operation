package com.bajaj.dphone;
import java.util.Scanner;
import com.bajaj.service.Record;
public class ReferalRecordDphone {

        public static void main(String[] args)
        {
            DphoneCrudOperations obj = new DphoneCrudOperations ();

            Record record = new Record();
            record.setIdNumber(2);
            record.setName("Jayshree");
            obj.add(record);
            Scanner input = new Scanner(System.in);
            int option = 0;
            do {
                menu();
                option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.print(
                                "What is the id Number ? ");
                        int idNumber = input.nextInt();
                        input.nextLine();
                        System.out.print(
                                "What is theName ? ");
                        String name = input.nextLine();
                        record = new Record(name, idNumber);
                        obj.add(record);
                        System.out.println(record.toString());
                        break;


                    case 2:
                        System.out.print(
                                "What is the id number ? ");
                        int rId = input.nextInt();
                        obj.delete(rId);
                        break;


                    case 3:


                        System.out.print(
                                "What is the id number? ");

                        int rIdNo = input.nextInt();
                        obj.update(rIdNo, input);

                        break;


                    case 4:


                        System.out.print(
                                "What is the id ? ");
                        int bookId = input.nextInt();

                        if (!obj.find(bookId)) {
                            System.out.println(
                                    "id does not exist\n");
                        }

                        break;


                    case 5:
                        obj.display();
                        break;


                    case 9:


                        System.out.println(
                                "\nThank you. Goodbye!\n");
                        System.exit(0);

                        break;


                    default:


                        System.out.println("\nInvalid input\n");
                        break;
                }
            }


            while (option != 9);
        }


        public static void menu()
        {


            System.out.println("MENU");
            System.out.println("1: Add Referal");
            System.out.println("2: Delete Referal");
            System.out.println("3: Update Referal");
            System.out.println("4: Search Referal");
            System.out.println("5: Display Referal");
            System.out.println("9: Exit program");
            System.out.print("Enter your selection : ");
        }
    }


