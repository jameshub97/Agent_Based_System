import java.util.ArrayList;
import java.util.LinkedList;


public class seller_thread implements Runnable {

    public LinkedList<String> list() {
        LinkedList<String> list = new LinkedList<String>();
        return list;

    }

    @Override
    public void run() {

        sales_agents sales = new sales_agents();
        seller_thread one = new seller_thread();
        Data data = new Data(0, null,0);
        ArrayList<Data> books = new ArrayList<>();
        int maxSize = 10;
        while (one.list().size() < maxSize) {

            System.out.println(sales.getSales_1() + " has been added to catalogue");
            final Data item = new Data(1, (String) sales.getSales_1(), sales.getValue());
            try {
                Thread.sleep(9 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(sales.getSales_2() + " has been added to catalogue");
            final Data item2 = new Data(1, (String) sales.getSales_2(), sales.getValue());
            books.add(item2);
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(sales.getSales_2() + " has been added to catalogue");
            final Data item3 = new Data(1, (String) sales.getSales_3(), sales.getValue());
            books.add(item3);
            try {
                Thread.sleep(4 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(sales.getSales_2() + " has been added to catalogue");
            final Data item4 = new Data(1, (String) sales.getSales_4(), sales.getValue());
            books.add(item2);
            try {
                Thread.sleep(6 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(sales.getSales_2() + " has been added to catalogue");
            final Data item5 = new Data(1, (String) sales.getSales_5(), sales.getValue());
            books.add(item2);
            try {
                Thread.sleep(7 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(sales.getSales_2() + " has been added to catalogue");
            final Data item6 = new Data(1, (String) sales.getSales_6(), sales.getValue());
            books.add(item2);
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(sales.getSales_2() + " has been added to catalogue");
            final Data item7 = new Data(1, (String) sales.getSales_7(), sales.getValue());
            books.add(item7);
//            Appends
            one.list().add(item.toString());
        }
//        Implementation of looped linked_list has been used with guidance from support from User Steyrix
//        https://stackoverflow.com/questions/59745800/how-do-you-use-a-linked-list-withina-while-loop/59745863?noredirect=1#comment105639604_59745863




        }



        }

