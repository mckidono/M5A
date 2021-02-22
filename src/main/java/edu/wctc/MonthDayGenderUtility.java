package edu.wctc;

public class MonthDayGenderUtility {
    private	final int	MOD_MALE=0;
    private	final int	MOD_FEMALE=500;
    private	final char CODE_MALE='M';
    private	final char CODE_FEMALE='F';
    public	int	encodeMonthDayGender(int year, int month, int day, char genderCode) throws UnknownGenderCodeException,InvalidBirthdayException{
        if (!(genderCode != CODE_MALE|| genderCode != CODE_FEMALE||genderCode != 'm'|| genderCode != 'f')){
            new UnknownGenderCodeException(genderCode);
            return 0;
        }
        else{
            if(genderCode=='m'||genderCode==CODE_MALE){
                return  (month - 1) * 40 + day + MOD_MALE;
            }
            else{
                return  (month - 1) * 40 + day + MOD_FEMALE;
            }

        }
    }
}
