interface Callback {
    void callback(int param);
}

class Client implements Callback {
    public void callback(int param) {
        System.out.println("Callback method");
    }

    void nonInterfaceMeth() {
        System.out.println("Another method");
    }
}
