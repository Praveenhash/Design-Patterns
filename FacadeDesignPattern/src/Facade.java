public class Facade {
    private CPU cpu;
    private DiskDrive diskDrive;
    private GPU gpu;
    private Memory memory;
    private NetworkInterface networkInterface;

    public Facade(){
        this.cpu = new CPU();
        this.gpu = new GPU();
        this.diskDrive = new DiskDrive();
        this.memory = new Memory();
        this.networkInterface = new NetworkInterface();
    }
    public void startComputer(){
        System.out.println("Starting the computer.......!");
        cpu.powerON();
        gpu.enableGPU();
        diskDrive.bootDiskDrive();
        memory.initialize();
        networkInterface.connectToNetwork();
    }
}
