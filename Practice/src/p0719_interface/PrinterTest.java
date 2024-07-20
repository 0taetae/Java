package p0719_interface;

public class PrinterTest {

    public static void main(String[] args) {
        PrintClient client = new PrintClient();
        client.setPrinter(new InkjetPrinter());
        // TODO: client가 LazerPrinter를 사용하도록 하고 클래스의 변화를 확인하시오.
        client.setPrinter(new LazerPrinter());
        // END
        client.printThis("myfile");

    }
}