这个例子是 dubbo泛化例子
泛化就是说，调用provider的人，不需要那个interface 的api jar包，
只需要知道调用的函数方法，interface名字，以及里面的参数就可以了。

配置一个springboot，启动内置的tomcat
然后写一个 servlet 对特定的url进行处理，这里就是拦截/servlet2/*的post请求，
然后把body的内容，如下：
{
    "registry": "zookeeper://127.0.0.1:2181",
    "interface": "com.mushan.DemoServer",
    "version": "",
    "group": "",
    "method": "sayHello",
    "paramTypes": ["java.lang.String"],
    "paramValues": ["123"]
}
读取出来，得到dubbo的泛化接口实例，
最后就可以直接调用dubbo provider 提供的函数了。

具体请看 DubboToHttpServlet 代码

provider代码请看 dubbo-demo 项目
