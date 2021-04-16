import java.util.*;


public class sales_agents {
    int Max = 25;
    int Min = 5;
    Random rand = new Random();
    public int value =  (int) (Math.random() * ((Max - Min) + 1));
    public Object sales_1 = sales_list().get(rand.nextInt(8));
    public Object sales_2 = sales_list().get(rand.nextInt(8));
    public Object sales_3 = sales_list().get(rand.nextInt(8));
    public Object sales_4 = sales_list().get(rand.nextInt(8));
    public Object sales_5 = sales_list().get(rand.nextInt(8));
    public Object sales_6 = sales_list().get(rand.nextInt(8));
    public Object sales_7 = sales_list().get(rand.nextInt(8));
    public Object sales_8 = sales_list().get(rand.nextInt(8));
    public Object sales_9 = sales_list().get(rand.nextInt(8));
    public Object sales_10 = sales_list().get(rand.nextInt(8));



    public List sales_list(){
        List<String> book_choice = new ArrayList<String>();
        book_choice.add(" Hungry Caterpillar ");
        book_choice.add(" Harry Potter ");
        book_choice.add(" Peter Pan ");
        book_choice.add(" Cisco ");
        book_choice.add(" Learn PYTHON ");
        book_choice.add(" Developing with JAVA ");
        book_choice.add(" Learn CISCO networking ");
        book_choice.add(" Multi-agent systems ");
        book_choice.add(" Jack and the Beanstalk ");

        return book_choice;
    }

    public int getValue(){
        return this.value;
    }

    public Object getSales_1() {
        return this.sales_1 + "seller 1";
    }

    public Object getSales_2() {
        return this.sales_2 + "seller 2";
    }

    public Object getSales_3() {
        return this.sales_3 + "seller 3";
    }

    public Object  getSales_4() {
        return this.sales_4 + " seller 4";
    }
    public Object getSales_5() {
        return this.sales_5;
    }

    public Object getSales_6() {
        return this.sales_6;
    }

    public Object getSales_7() {
        return this.sales_7;
    }

    public Object  getSales_8() {
        return this.sales_8;
    }
    public Object  getSales_9() {
        return this.sales_9;
    }
    public Object  getSales_10() {
        return this.sales_10;
    }


}

