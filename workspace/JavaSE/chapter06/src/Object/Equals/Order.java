package Object.Equals;

/**
 * ClassName: Order
 * Package: Object.Equals
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/20 17:23
 * @Version 1.0
 */
public class Order {
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object object){
        if (this == object)
            return true;
        if (object == null)
            return false;
        //必须是判断不等于
        //不然就必须使用else-if分支
        if (this.getClass() != object.getClass())
            return false;
        Order order = (Order) object;


        //先进行基础数据类型的比较，性能更快
        //基础数据类型不用进行null判断
        if (orderId != order.orderId)
            return false;


        //引用数据类型必须进行null的判断
        //因为如果orderName.equals()中orderName为null会返回NullPointerException
        if (orderName == null){
            //必须进行非null的判断
            //因为只有非null的判断可以直接返回false
            //同时保证如果为true进行下面的判断
            return order.orderName == null;
        }else return orderName.equals(order.orderName);
    }
}
