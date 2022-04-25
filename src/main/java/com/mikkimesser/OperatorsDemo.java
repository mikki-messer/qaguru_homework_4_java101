package com.mikkimesser;

import java.time.LocalDate;

public class OperatorsDemo {
    public static void main(String[] args) {
        char aChar = 'm';
        byte aByte = 125;
        short aShort = 1025;
        int aInt = 50000;
        long aLong = 2147483649L;

        boolean flag = true;

        float aFloat = 2.5f;
        double aDouble = 2.5d;

        String name = "Mikki";
        String[] names = {"Mike","Tony","Alex", "Greg"};

        //operators
        aByte = (byte) (aByte + 2);
        System.out.println("Addition result "+aByte);
        aByte = (byte) (aByte - 4);
        System.out.println("Substraction result "+aByte);

        short result = (short) (aShort / 50);
        short remainder = (short) (aShort % 50);
        System.out.println("Quotient is "+result+", remainder is "+remainder);

        aShort = (short) (result * remainder);
        System.out.println("Multiplication demo:" +aShort);

        //case operator and logical operations
        String dayOfTheWk = LocalDate.now().getDayOfWeek().toString();
        System.out.println(dayOfTheWk);

        for (String employee: names) {
            switch (employee)
            {
                case ("Mike"):
                case ("Tony"):
                    if (dayOfTheWk.equals("TUESDAY") || (flag && dayOfTheWk.equals("FRIDAY")))
                        System.out.println(employee+" support guy");
                    else
                        System.out.println(employee+" QA guy");
                    break;
                case ("Alex"):
                    System.out.println(employee+" TechLead");
                    break;
                default:
                    System.out.println(employee+" Developer");
                    break;
            }
        }

        //strings
        String mString = "Mike";
        String mString2 = "Mike";

        if (mString.equals(mString2))
            System.out.println("Works as expected");

        mString = "Mikhail";
        mString2 = "Mihail";

        if (!mString2.equals(mString))
            System.out.println("Spelling matters!");

        //instance of
        if (name instanceof String)
            System.out.println("Yes, it is a String!");

        byte day = (byte) LocalDate.now().getDayOfMonth();

        // ? condition
        String message = day % 2 == 1 ?
                "Today is an odd day"
                :
                "Today is an even day";
        System.out.println(message);

        //some more comparisons and ! operator
        if (aChar!='w')
            System.out.println("m!=w");

        if (aFloat == aDouble)
            System.out.println("Float can be equal to double");
        else
            System.out.println("Float can't be equal to double");

        //overrun tests
        System.out.println("Before Overrun up "+aByte);
        aByte = (byte) (aByte + aInt);
        System.out.println("After Overrun up "+aByte);

        aByte = (byte) (aByte - aLong);
        System.out.println("Overrun down "+aByte);

    }
}
