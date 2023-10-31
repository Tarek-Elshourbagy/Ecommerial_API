package Pages;

import POGO.POGO_01_Registeration_requestbody;
import POGO.POGO_01_Registeration_responsetbody;
import POGO.POGO_02_LoginToHomePage_requestbody;

public class PayLoad {
    POGO_01_Registeration_requestbody RequestBody01 = new POGO_01_Registeration_requestbody();
        public POGO_01_Registeration_requestbody RequestBody_req01(String firstName,String lastName,
                 String userEmail,String occupation,String userRole,String gender,String userMobile,String userPassword
                 ,String confirmPassword ,Boolean required){
                    RequestBody01.setFirstName(firstName);
                    RequestBody01.setLastName(lastName);
                    RequestBody01.setUserEmail(userEmail);
                    RequestBody01.setOccupation(occupation);
                    RequestBody01.setUserRole(userRole);
                    RequestBody01.setGender(gender);
                    RequestBody01.setUserMobile(userMobile);
                    RequestBody01.setUserPassword(userPassword);
                    RequestBody01.setConfirmPassword(confirmPassword);
                    RequestBody01.setRequired(required);
                    return RequestBody01;
        }
        POGO_02_LoginToHomePage_requestbody RequestBody_02 = new POGO_02_LoginToHomePage_requestbody();
        public POGO_02_LoginToHomePage_requestbody RequestBody_req02(String Email ,String password){
                    RequestBody_02.setUserEmail(Email);
                    RequestBody_02.setUserPassword(password);
                    return RequestBody_02;
        }
}
