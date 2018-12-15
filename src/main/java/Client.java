public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500GB", "8GB")
                .setBluetoothEnable(true)
                .build();
        System.out.print(computer.isBluetoothEnable());
    }
}
