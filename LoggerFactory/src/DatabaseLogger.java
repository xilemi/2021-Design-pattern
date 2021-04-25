public class DatabaseLogger implements Logger {
    @Override
    public void write() {
        System.out.println("打印数据库日志记录");
    }
}
