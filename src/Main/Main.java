package Main;

import Documents.EmployeeContract;
import Documents.FinancialInvoice;
import Documents.GoodsSupplyContract;
import Register.Register;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Класс для имитации работы системы
 */
public class Main {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.add(Calendar.MONTH, 1);
        Register register = new Register();

        register.addDocument(new EmployeeContract(325, new Date(), calendar.getTime(), "Alex"));
        register.addDocument(new GoodsSupplyContract(743, new Date(), "some_type", 7));
        register.addDocument(new FinancialInvoice(943, new Date(), 894398, 999));

        System.out.println(register.showInformation(0));
        System.out.println(register.showInformation(1));
        System.out.println(register.showInformation(2));
    }
}
