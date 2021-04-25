public class App {
    public static  void main(String[] args){
//        创建文件工厂
        LoggerFactory factory = new FileLoggerFactory();
//        使用工厂获取文件打印产品角色
        Logger logger=factory.createLogger();
//        打印文件日志
        logger.write();
    }
}
