package edu.wctc;

public class FloridaFormatter implements DriversLicenseFormatter {

    public String formatLicenseNumber(DriversLicense driversLicense) {
        driversLicense=new DriversLicense();
        return driversLicense.getSSSS()+"-"+driversLicense.getFFF()+ driversLicense.getYY()+"-0";
    }
}
