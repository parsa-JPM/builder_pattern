public class Computer {

    //required parameter
    private String HDD;
    private String RAM;

    //optional parameter
    private boolean isGraphicCardEnable;
    private boolean isBluetoothEnable;


    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicCardEnable() {
        return isGraphicCardEnable;
    }

    public boolean isBluetoothEnable() {
        return isBluetoothEnable;
    }

    private Computer(ComputerBuilder builder) {
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.isBluetoothEnable = builder.isBluetoothEnable;
        this.isGraphicCardEnable = builder.isGraphicCardEnable;
    }

    public static class ComputerBuilder {
        //required parameter
        private String HDD;
        private String RAM;

        //optional parameter
        private boolean isGraphicCardEnable;
        private boolean isBluetoothEnable;

        public ComputerBuilder(String hdd, String ram) {
            HDD = hdd;
            RAM = ram;
        }

        public ComputerBuilder setGraphicCardEnable(boolean isGraphicCardEnable) {
            this.isGraphicCardEnable = isGraphicCardEnable;
            return this;
        }

        public ComputerBuilder setBluetoothEnable(boolean isBluetoothEnable) {
            this.isBluetoothEnable = isBluetoothEnable;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
