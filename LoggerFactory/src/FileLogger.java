public class FileLogger implements Logger {
    @Override
    public void write() {
        System.out.println("打印文件日志记录");
    }
}
