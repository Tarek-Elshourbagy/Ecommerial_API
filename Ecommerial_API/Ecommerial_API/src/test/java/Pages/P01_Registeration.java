package Pages;

import POGO.POGO_01_Registeration_requestbody;
import POGO.POGO_01_Registeration_responsetbody;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

import static io.restassured.RestAssured.given;

public class P01_Registeration {
    public POGO_01_Registeration_responsetbody req_01_Register(POGO_01_Registeration_requestbody RequestBody){
        RestAssured.baseURI = "https://rahulshettyacademy.com/api/ecom/auth";
        String EndPoint = "/register";
        POGO_01_Registeration_responsetbody ResponseBody = given().log().all().header("Content-Type","application/json")
                .body(RequestBody)
                .expect().defaultParser(Parser.JSON)
                .when().post(EndPoint).as(POGO_01_Registeration_responsetbody.class);
    return ResponseBody;
    }
}
