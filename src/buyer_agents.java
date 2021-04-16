import java.util.ArrayList;
import java.util.Random;
public class buyer_agents {
    sales_agents sales = new sales_agents();
    Random rand = new Random();
    int selection = rand.nextInt(3);
    private Object buyer_1 = sales.sales_list().get(rand.nextInt(8));
    private Object buyer_2 = sales.sales_list().get(rand.nextInt(8));
    private Object buyer_3 = sales.sales_list().get(rand.nextInt(8));
    private Object buyer_4 = sales.sales_list().get(rand.nextInt(8));



    public Object getBuyer_1() {
        return this.buyer_1 + "buyer1";
    }

    public Object getBuyer_2() {
        return this.buyer_2 + "buyer2";
    }

    public Object getBuyer_3() {
        return this.buyer_3 + "buyer3";
    }

    public Object getBuyer_4() {
        return this.buyer_4 + "buyer4";
    }
}


