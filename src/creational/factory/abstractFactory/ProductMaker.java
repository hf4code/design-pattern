package creational.factory.abstractFactory;

import creational.factory.abstractFactory.product.CPU;
import creational.factory.abstractFactory.product.Computer;
import creational.factory.abstractFactory.product.HardDisk;
import creational.factory.abstractFactory.product.MainBoard;

public class ProductMaker {
	public static void main(String[] args) {
        // 第一步就要选定一个“大厂”
        ComputerFactory computerFactory = new AmdFactory();
        // 从这个大厂造 CPU
        CPU cpu = computerFactory.makeCPU();
        // 从这个大厂造主板
		MainBoard mainBoard = computerFactory.makeMainBoard();
        // 从这个大厂造硬盘
		HardDisk hardDisk = computerFactory.makeHardDisk();
        // 将同一个厂子出来的 CPU、主板、硬盘组装在一起
		Computer product = new Computer(cpu, mainBoard, hardDisk);
	}
}
