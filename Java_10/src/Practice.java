abstract class Device {
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();

}

//UsbPort1
class UsbPort1 extends Device {
    UsbPort1(int id) {
        this.deviceId = id;
    }
    public void deviceInfo() {
        System.out.println("id : " + this.deviceId);
    };
    public void connect() {
        System.out.println("연결 되었습니다.");
    };
    public void disconnect() {
        System.out.println("연결 해제");
    };
    public void send() {
        System.out.println("전송 중");
    };
    public void receive() {
        System.out.println("수신 중");
    };

}
//WiFi 클래스
class WiFi extends Device {
    public WiFi(int id) {
        this.deviceId = id;
    }

    @Override
    void deviceInfo() {

    }

    @Override
    void connect() {

    }

    @Override
    void disconnect() {

    }

    @Override
    void send() {

    }

    @Override
    void receive() {

    }
}
public class Practice {
    public static void main(String[] args) {
        UsbPort1 usb1 = new UsbPort1(1);
        usb1.deviceInfo();

        WiFi wifi = new WiFi(0);
    }
}
