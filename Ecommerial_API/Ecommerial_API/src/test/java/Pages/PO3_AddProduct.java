package Pages;
import POGO.POGO_03_AddProduct_responsebody;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;

import java.io.File;

public class PO3_AddProduct {
    public POGO_03_AddProduct_responsebody req_03_AddProduct(String userId, String Token){
            RestAssured.baseURI = "https://rahulshettyacademy.com/api/ecom/auth";
            String endpoint = "/add-product";
            String filePath = "C:\\Users\\lenovo\\Pictures\\Camera Roll\\WIN_20220303_15_30_41_Pro.jpg";

        RestAssured.given()
                .header("userId", userId)
                .header("Token", Token)
                .contentType(ContentType.MULTIPART)
                .multiPart("productName", "qwerty")
                .multiPart("productAddedBy", userId)
                .multiPart("productCategory", "fashion")
                .multiPart("productFor", "women")
                .multiPart("productImage", new File(filePath))
                .when()
                .post(endpoint).then()
                .extract()
                .response();
        POGO_03_AddProduct_responsebody response = new POGO_03_AddProduct_responsebody();
                return response;
            }
    }
