package StepDefinition;

import Model.GroceryModel;
import io.cucumber.java.en.Given;

public class GroceryTest {
    GroceryModel groceryModel=new GroceryModel();


    @Given("^Name '(.*)', price '(.*)',stock '(.*)' olan ürün olduğu kontrol edilir.$")
    public void checkProduct(String name,int price,int stock){
        groceryModel.checkProduct(name,price,stock);
    }

    @Given("Apideki ürünlerin varlığı kontrol edilir.$")
    public void checkAllProductControl(){
        groceryModel.checkAllProductControl();
    }

    @Given("^id '(.*)', name '(.*)', price '(.*)',stock '(.*)' özellikli ürün eklenir.$")
    public void postProduct(int id,String name,int price,int stock){
        groceryModel.postProduct(id, name,price,stock);
    }
}
