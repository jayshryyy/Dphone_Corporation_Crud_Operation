package com.bajaj.dphone;
import java.util.Scanner;
import java.util.LinkedList;
import com.bajaj.service.Record;
public class DphoneCrudOperations {

    LinkedList<Record> list;
    public DphoneCrudOperations()
    {
        list = new LinkedList<>();
    }

    public void add(Record record)
    {

        if (!find(record.getIdNumber())) {
            list.add(record);
        }
        else {

            System.out.println(
                    "Record already exists in the Record list");
        }
    }

    public boolean find(int idNimber)
    {

        for (Record l : list) {
            if (l.getIdNumber() == idNimber) {

                System.out.println(l);
                return true;
            }
        }
        return false;
    }

    public void delete(int recIdNumber)
    {
        Record recordDel = null;
        for (Record ll : list) {

            if (ll.getIdNumber() == recIdNumber) {
                recordDel = ll;
            }
        }
        if (recordDel == null) {
            System.out.println("Invalid record Id");
        }
        else {

            list.remove(recordDel);
            System.out.println(
                    "Successfully removed record from the list");
        }
    }
    public Record findRecord(int idNumber)
    {

        for (Record l : list) {
            if (l.getIdNumber() == idNumber) {
                return l;
            }
        }

        return null;
    }

    public void update(int id, Scanner input)
    {

        if (find(id)) {
            Record rec = findRecord(id);
            System.out.print(
                    "What is the new  id Number ? ");
            int idNumber = input.nextInt();
            System.out.print(
                    "What is the new  contact Number ");
            int contactNumber = input.nextInt();
            input.nextLine();
            System.out.print(
                    "What is the new Name ? ");
            String name = input.nextLine();

            rec.setIdNumber(idNumber);
            rec.setName(name);
            System.out.println(
                    "Record Updated Successfully");
        }
        else {
            System.out.println(
                    "Record Not Found in the list");
        }
    }
    public void display()
    {
        if (list.isEmpty()) {

            System.out.println("The list has no records\n");
        }

        for (Record record : list) {


            System.out.println(record.toString());
        }
    }




}
