package device;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device();
        Device device2 = new Device();
        System.out.println("device1.equals(device2) буде " + device1.equals(device2)); // перевірка на рівність за змістом
        System.out.println("device1 == device2 буде " + (device1 == device2)); // перевірка на рівність за посиланням
        System.out.println("device1.hashCode() = " + device1.hashCode()); // у рівних об'єктів рівні хеш-коди
        System.out.println("device2.hashCode() = " + device2.hashCode());
        Monitor monitor1 = new Monitor(1280,1024);
        Monitor monitor2 = new Monitor(1280,1024);
        System.out.println("monitor1.equals(monitor2) буде " + monitor1.equals(monitor2));
        System.out.println("monitor1 == monitor2 буде " + (monitor1 == monitor2));
        System.out.println("monitor1.hashCode() = " + monitor1.hashCode());
        System.out.println("monitor2.hashCode() = " + monitor2.hashCode());
        System.out.println("device1.equals(monitor1) буде " + device1.equals(monitor1));
        System.out.println("device1 == monitor1 буде " + (device1 == monitor1));
        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("hp",14f,"32342FF3",10,"10:22:43");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter("hp",14f,"32342FF3",10,"10:22:43");
        System.out.println("ethernetAdapter1.equals(ethernetAdapter2) буде " + ethernetAdapter1.equals(ethernetAdapter2));
        System.out.println("ethernetAdapter1 == ethernetAdapter2 буде " + (ethernetAdapter1 == ethernetAdapter2));
        System.out.println("ethernetAdapter1.hashCode() = " + ethernetAdapter1.hashCode());
        System.out.println("ethernetAdapter2.hashCode() = " + ethernetAdapter2.hashCode());

    }
}
