package p0719.interfacee;

public class InkjetPrinter implements Printer {

    @Override
    public void print(String fileName) {
        System.out.println("Inkjet Printer로 프린트 한다.");
    }

}
