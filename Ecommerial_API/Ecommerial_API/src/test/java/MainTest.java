import POGO.*;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    P01_Registeration P1 = new P01_Registeration();
    P02_Login P2 = new P02_Login();
    PO3_AddProduct P3 = new PO3_AddProduct();
    PO4_AddToCard P4 = new PO4_AddToCard();
    PO5_CreateOrder P5 = new PO5_CreateOrder();
    PayLoad payload = new PayLoad();
    String email = "tarek6@gmail.com";
    String password = "Tarek199";
    String Token;
    String UserID;
    @Test
    public void T01_registeration(){
        POGO_01_Registeration_responsetbody Response_01 = P1.req_01_Register(payload.RequestBody_req01("Tarek",
                "Ahmed",
                email,"customer","Engineer",
                "Male","1234567891",password,password,true));
        System.out.println("ResponseBody 1 = "+Response_01.getMessage());
        Assert.assertEquals(Response_01.getMessage(),"Registered Successfully");
    }
    @Test
    public void T02_Login(){
        POGO_02_LoginToHomePage_responsebody Response_02 = P2.req_02_Register(payload.RequestBody_req02(email,password));
        Token = Response_02.getToken();
        UserID = Response_02.getUserId();
        System.out.println(Token);
        System.out.println(UserID);
        Assert.assertEquals(Response_02.getMessage(),"Login Successfully");
    }
    @Test
    public void T03_AddProduct(){
        POGO_03_AddProduct_responsebody Response_03 = P3.req_03_AddProduct(UserID,Token);
        System.out.println(Response_03);
    }
    @Test
    public void T04_AddToCard(){
        POGO_04_AddToCard_responsebody Response_04 = P4.response_04();
        System.out.println(Response_04.getMessage());
        Assert.assertEquals(Response_04.getMessage(),"Product Added To Cart");
    }
    @Test
    public void T05_CreateOrder(){
        POGO_05_CreateOrder_responsetbody Response_05 = P5.ResponseCreateOrder();
        System.out.println(Response_05.getMessage());
    }
}
