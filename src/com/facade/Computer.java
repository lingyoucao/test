package com.facade;

public class Computer {
	private Cpu cpu;
	private Disk disk;
	private Memory memory;
	
	public Computer(){
		cpu = new Cpu();
		disk = new Disk();
		memory = new Memory();
	}
	
	public void start(){
		System.out.println("computer begin start...");
		cpu.start();
		disk.start();
		memory.start();
		System.out.println("computer start success!");
	}
	
	public void stop(){
		System.out.println("computer begin stop...");
		cpu.stop();
		disk.stop();
		memory.stop();
		System.out.println("computer stop success!");
	}
}
