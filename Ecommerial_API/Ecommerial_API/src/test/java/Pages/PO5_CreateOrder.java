package Pages;

import POGO.POGO_05_CreateOrder_responsetbody;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;

public class PO5_CreateOrder {
    public POGO_05_CreateOrder_responsetbody ResponseCreateOrder(){
        RestAssured.baseURI = "https://rahulshettyacademy.com/api/ecom";
        String endpoint = "/order/create-order";
        POGO_05_CreateOrder_responsetbody response = given().log().all(). given().log().all()
                .header("Content-Type","application/json")
                .header("Authorization","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTJlYTg3NDcyNDQ0OTBmOTVjZjNkZjEiLCJ1c2VyRW1haWwiOiJ0YXJlazEyMzRAZ21haWwuY29tIiwidXNlck1vYmlsZSI6MTIzNDU2Nzg5MSwidXNlclJvbGUiOiJjdXN0b21lciIsImlhdCI6MTY5NzU1NzIzMiwiZXhwIjoxNzI5MTE0ODMyfQ.xZE2jh_sckgxC0v9S7kSb9YM10o5et-JEjv-teiT8g8")
                .body("{\"orders\":[{\"country\":\"Egypt\",\"productOrderedId\":\"6262e95ae26b7e1a10e89bf0\"}]}")
                .expect().defaultParser(Parser.JSON)
                .when().post(endpoint).as(POGO_05_CreateOrder_responsetbody.class);
        return response;
    }
}
