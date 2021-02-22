package edu.wctc;

public class WisconsinFormatter implements DriversLicenseFormatter {

    public String formatLicenseNumber(DriversLicense driversLicense) {
        return driversLicense.getSSSS()+"-"+driversLicense.getFFF()+"-"+ driversLicense.getYY()+"-00";
    }
}
