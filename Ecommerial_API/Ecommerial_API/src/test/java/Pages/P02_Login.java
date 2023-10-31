package Pages;

import POGO.POGO_01_Registeration_responsetbody;
import POGO.POGO_02_LoginToHomePage_requestbody;
import POGO.POGO_02_LoginToHomePage_responsebody;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

import static io.restassured.RestAssured.given;

public class P02_Login {
    public POGO_02_LoginToHomePage_responsebody req_02_Register (POGO_02_LoginToHomePage_requestbody RequestBody02){
        RestAssured.baseURI = "https://rahulshettyacademy.com/api/ecom/auth";
        String EndPoint = "/login";
        POGO_02_LoginToHomePage_responsebody ResponseBody02 = given().log().all()
                .header("Content-Type","application/json")
                .body(RequestBody02)
                .expect().defaultParser(Parser.JSON)
                .when().post(EndPoint).as(POGO_02_LoginToHomePage_responsebody.class);
        return ResponseBody02;
    }
}
