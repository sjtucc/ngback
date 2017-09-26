package cc.ngback.ws.client;

import java.util.ArrayList;
import java.util.List;

import com.ken.webservice.Order;
import com.ken.webservice.impl.IRemoteService;
import com.ken.webservice.impl.RemoteServiceImplService;

public class WSClient {
	public static void main(String[] args) {
		//创建一个用于产生RemoteServiceImplService实例的工厂，RemoteServiceImplService类是wsimport工具生成的
        RemoteServiceImplService factory = new RemoteServiceImplService();
        //通过工厂生成一个IRemoteService实例，IRemoteService是wsimport工具生成的
        IRemoteService service = factory.getRemoteServiceImplPort();
        String result = service.showRemoteMessage("Ken");
        System.out.println(result);
        
        List<Order> orders = new ArrayList<Order>();
        Order order1 = new Order();
        order1.setOrderNo("201706048888");
        order1.setItemCode("A10000001");
        order1.setItemName("IPHONE");
        order1.setQuantity(100L);
        orders.add(order1);
         
        Order order2 = new Order();
        order2.setOrderNo("201706048888");
        order2.setItemCode("A10000002");
        order2.setItemName("MAC");
        order2.setQuantity(200L);
        orders.add(order2);
         
        String resultOrder = service.addOrder(orders);
        System.out.println(resultOrder);
	}

}
