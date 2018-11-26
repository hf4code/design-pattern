package creational.factory.abstractFactory;

import creational.factory.abstractFactory.product.*;

public class AmdFactory implements ComputerFactory {

	@Override
	public CPU makeCPU() {
		return new AmdCPU();
	}

	@Override
	public MainBoard makeMainBoard() {
		return new AmdMainBoard();
	}

	@Override
	public HardDisk makeHardDisk() {
		return new AmdHardDisk();
	}

}
