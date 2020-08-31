package com.company;

public class Main {

    public static void main(String[] args) {

        String patientName = ("Stacey Manson");
        Boolean hasInsurance = false;
        int temp = 102;
        int numVisits = 5;
        Float bodytemp = 102.2f;


        System.out.println("Patient Details:");
        System.out.println("Name: " + patientName);
        System.out.println("Patient has insurance: " + hasInsurance);
        System.out.println("Body temprature: " + bodytemp);
        System.out.println("Number of visitis: " + numVisits);

        Float copay = 101.2f;
        String nextappointment = "September 1, 2020";
        String contactnum = "011-102-1029";

        System.out.println ("Patient's copay amount: " + copay);
        System.out.println ("Next Appointment Date: " + nextappointment);
        System.out.println ("Contact Number: " + contactnum);

    }
}
