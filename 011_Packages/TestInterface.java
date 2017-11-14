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

class AnotherClient implements Callback {
    public void callback(int param) {
        System.out.println("Another callback");
        System.out.println("p^2 = " + param * param);
    }
}

class TestInterface {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
