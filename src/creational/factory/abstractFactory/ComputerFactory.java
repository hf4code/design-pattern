package creational.factory.abstractFactory;

import creational.factory.abstractFactory.product.CPU;
import creational.factory.abstractFactory.product.HardDisk;
import creational.factory.abstractFactory.product.MainBoard;

public interface ComputerFactory {
	
	CPU makeCPU();
	
	MainBoard makeMainBoard();
	
	HardDisk makeHardDisk();
}
