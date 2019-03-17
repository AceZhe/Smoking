package acezhe;

import java.util.Scanner;

/**
 * @author zhangzhe
 */
public class ModelService {
    public static void doServ(){
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("请选择模块(1:服务，2:登出):");
            String select = scan.next();
            switch (select) {
                case "1": {
                    ServiceService.doServ();
                    break;
                }
                case "2": {
                    AuthUtils.logout();
                    return;
                }
                default: {
                    System.out.println("大侠选择错误，掉血：" + Math.random() * 1000);
                }
            }
        }
    }
}
