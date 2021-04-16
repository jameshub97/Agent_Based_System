import java.util.*;


public class main_method extends Thread {


    public static void main(String[] args) {
        main_method method = new main_method();

        System.out.println("TYPE ENTER ");
        buyer_thread t2 = new buyer_thread();
        Scanner input = new Scanner(System.in);
        if (input.equals("ENTER"))
                method.purchasing();

        seller_thread t1 = new seller_thread();
        t1.run();
        t2.run();


    }

    public ArrayList<Data> list() {

        main_method method = new main_method();
        seller_thread sale_thread = new seller_thread();
        ArrayList<Data> books = new ArrayList<>();
        final Data item = new Data(1, method.sell(), method.Price());
        books.add(item);
        sale_thread.list().add(item.toString());

        return books;

    }


    public String sell() {
        main_method method = new main_method();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Book");
        String result_name = input.nextLine();
        System.out.println("you have chosen: " + result_name);
        method.list();
        return result_name;
    }


    public int Price() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Price");
        int result_price = input.nextInt();
        System.out.println("at a price of :" + result_price);
        return result_price;
    }


    public int purchasing() {
        sales_agents sales = new sales_agents();
        Scanner input = new Scanner(System.in);
        System.out.println("These are these books available, use the key value to view how many copies are available");
        System.out.println(sales.sales_list());
        System.out.println("0 = Hungry Caterpillar, 1 = Peter Pan, 2 = Cisco, 3 = Learn Python, 4 = Developing with JAVA");
        System.out.println("5 = Cisco, 6  =  Multi-Agent systems, 7 = Jack and the Beanstalk");
        int result_name = input.nextInt();
        System.out.println("you have chosen" + sales.sales_list().get(result_name));
        main_method method = new main_method();
        System.out.println(method.Map());
        System.out.println("sell books here");
        method.sell();
        return result_name;
    }
//    Used to find lowest value

    public TreeMap Map() {
        sales_agents sales = new sales_agents();
        ArrayList<Integer> al = new ArrayList();
        Collections.sort(al, new myComparator());
        TreeMap<Integer, Integer> lowest_price = new TreeMap();
        lowest_price.put(6, sales.getValue());
        lowest_price.put(2, sales.getValue());
        lowest_price.put(3, sales.getValue());
        lowest_price.put(4, sales.getValue());
        lowest_price.put(4, sales.getValue());
        lowest_price.put(1, sales.getValue());
        System.out.println("Cheapest price is:  " + lowest_price);
        return lowest_price;
    }
}

class myComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer o3 = (Integer) o1;
        Integer o4 = (Integer) o2;
        return o3.compareTo(o4);
    }
}

