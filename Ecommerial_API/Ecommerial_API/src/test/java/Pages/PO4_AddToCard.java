package Pages;

import POGO.POGO_01_Registeration_responsetbody;
import POGO.POGO_04_AddToCard_responsebody;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import javafx.beans.binding.When;

import java.lang.reflect.Type;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;

public class PO4_AddToCard {
    public POGO_04_AddToCard_responsebody response_04 (){
        RestAssured.baseURI = "https://rahulshettyacademy.com/api/ecom";
        String endpoint = "/user/add-to-cart";
        POGO_04_AddToCard_responsebody response = given().log().all()
                .header("Content-Type","application/json").header("Authorization","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTJlYTg3NDcyNDQ0OTBmOTVjZjNkZjEiLCJ1c2VyRW1haWwiOiJ0YXJlazEyMzRAZ21haWwuY29tIiwidXNlck1vYmlsZSI6MTIzNDU2Nzg5MSwidXNlclJvbGUiOiJjdXN0b21lciIsImlhdCI6MTY5NzU1NzIzMiwiZXhwIjoxNzI5MTE0ODMyfQ.xZE2jh_sckgxC0v9S7kSb9YM10o5et-JEjv-teiT8g8")
                .header("Cookie","__gads=ID=3f69b392a84aded3-22bdf4776be00056:T=1697697550:RT=1697697550:S=ALNI_MaP_OIYroLwyBkER6GT-yGXPRyYtA; __gpi=UID=00000cbb8a345b78:T=1697697550:RT=1697697550:S=ALNI_Ma2tQg9WrTuIeXo2GOvkn1Rxcg58A; XSRF-TOKEN=eyJpdiI6IlhmRVp4MzdxQmNuTWE1M0o5N1RTQUE9PSIsInZhbHVlIjoiOUlzZWJiVFNtaS96UVBGMWtFdmc4OWdrVE5RbjI1R1pOc0xoQ0dDUUJZbjg1NWt3T1JkUlQycUxLNUpFYnlXcHVFdldNcFZQWGtpZG1BOEhlYW5qdkdMTXpVdmhmVHZINUZRNld2ZmNqQlgyN2UrNlo5T2tBM3JtWWMwRXpmTlIiLCJtYWMiOiI0ZTY3ZDZiYTgzMzc2ZDQzNTVhNWM2NDY5ZTIxNmFlYmM2ZTBkNDVhNjNjMzgyZDBiMmM4NGY0YzU3YTJmZTIwIiwidGFnIjoiIn0%3D; rahulshettyacademy_session=eyJpdiI6IkhFYm0zY0VQQm9rSFFoYTByQWVjdWc9PSIsInZhbHVlIjoiVHFodzRtVjRZRHFkNFZ0QzJCN2MzZHFPdVR3cXAzdmZ6ZVkwM0NtTFpXTXlxUmFKdlNDclZEN0o4SXpNUzYrbmRtemhTSUhLbGczQVg3YkRiOXpOL2kvU2ZrQVlmd1dyV0ZwTjZlK2RPa1dLNGFrN2pFK01rbnhneTVwL1pHMHUiLCJtYWMiOiIxNmZhY2QzNGViZTllNWY2NzMwOTQ0ZjUzZTZhYTdlMGE3NzQyYTQ3OGQ5NmEyOWRmYzk5N2M4Mzc0ZjE0YTYxIiwidGFnIjoiIn0%3D")
                .body("{\"_id\":\"652ea8747244490f95cf3df1\"," +
                        "\"product\":{\"_id\":\"6262e95ae26b7e1a10e89bf0\"," +
                        "\"productName\":\"zara coat 3\"," +
                        "\"productCategory\":\"fashion\"," +
                        "\"productSubCategory\":\"shirts\"," +
                        "\"productPrice\":31500," +
                        "\"productDescription\":\"zara coat 3\"," +
                        "\"productImage\":\"https://rahulshettyacademy.com/api/ecom/uploads/productImage_1650649434146.jpeg\"," +
                        "\"productRating\":\"0\"," +
                        "\"productTotalOrders\":\"0\"," +
                        "\"productStatus\":true," +
                        "\"productFor\":\"women\"," +
                        "\"productAddedBy\":\"admin^@gmail.com\"," +
                        "\"__v\":0}}").expect().defaultParser(Parser.JSON)
                .when().post(endpoint)
                .as((Type) POGO_04_AddToCard_responsebody.class);
        return response;
    }
}