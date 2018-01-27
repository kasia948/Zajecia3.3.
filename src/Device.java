public class Device {
    String code;
    String producer;
    String type;
    double price;

    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    public Device(String c, String p, String t, double pr) {
        this(c, p, t);
        this.price = pr;
    }
    void getInfo() {
        System.out.println("Kod: "+code + ", producent: " + producer + ", typ: " + type + ", cena: " + price);
    }
}