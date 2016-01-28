package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务者
 * 用于加载服务者Spring配置到ZooKeeper注册中心
 *
 */
public class Provider {
	
	//静态加载资源配置文件
		public final static String[] strArrar =new String[] {"dubbo/dubbo-provider.xml","spring/getIP.xml"};

    /**
     * 主方法
     * @param args
     * @throws Exception
     */
    @SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
        //
        System.out.println("Begin to load");
        // 加载Spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(strArrar);
        context.start();
        //
        System.out.println("===========服务已启动===========");
        // 为保证服务一直开着，利用输入流的阻塞来模拟
        System.in.read();
    }
}
