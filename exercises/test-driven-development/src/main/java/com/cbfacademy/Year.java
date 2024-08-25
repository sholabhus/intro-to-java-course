package com.cbfacademy;

public class Year {
   public static boolean isLeapYear(int Year){
    if(Year % 400==0 ){
        return true;

}else{
    if(Year % 100==0 ){
        return false;
    }
    else {
        if(Year % 4==0 ){
            return true;
        }
    return false;
   }
}
   }
}
