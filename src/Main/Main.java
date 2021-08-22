package Main;

import Documents.EmployeeContract;
import Documents.FinancialInvoice;
import Documents.GoodsSupplyContract;
import Register.Register;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.add(Calendar.MONTH, 1);

        Register.addDocument(new EmployeeContract(325, new Date(), calendar.getTime(), "Alex"), 0);
        Register.addDocument(new GoodsSupplyContract(743, new Date(), "some_type", 7), 1);
        Register.addDocument(new FinancialInvoice(943, new Date(), 894398, 999), 2);

        System.out.println(Register.showInformation(0));
        System.out.println(Register.showInformation(1));
        System.out.println(Register.showInformation(2));
    }
}
