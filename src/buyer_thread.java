import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class buyer_thread extends Thread {
    @Override
    public void run() {

        sales_agents sales = new sales_agents();
        seller_thread one = new seller_thread();
        buyer_agents buyer = new buyer_agents();
        ArrayList<Object> books = new ArrayList<>();
        int maxSize = 20;
        while (one.list().size() < maxSize) {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, (String) sales.getSales_1());

        }
        try {
            Thread.sleep(6 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(buyer.getBuyer_1() + " has bought ");
        final Data item = new Data(1, (String) sales.getSales_1(), sales.getValue());
        books.add(item);

        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(buyer.getBuyer_2() + " has bought ");
        final Data item2 = new Data(1, (String) sales.getSales_2(), sales.getValue());
        books.add(item2);
        System.out.println(buyer.getBuyer_1() + " has bought ");
        final Data item3 = new Data(1, (String) sales.getSales_3(), sales.getValue());
        books.add(item3);

        try {
            Thread.sleep(8 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(buyer.getBuyer_2() + " has bought");
        final Data item4 = new Data(1, (String) sales.getSales_2(), sales.getValue());
        books.add(item4);
    }


}
