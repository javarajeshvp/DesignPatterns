package com.vp.patterns.structural.adapter;

public class Client {

	public static void main(String[] args) {
		SocketAdapterImpl socketAdapterImpl = new SocketAdapterImpl();
		
		System.out.println("socketAdapterImpl.get3Volt() : "  + socketAdapterImpl.get3Volt().getVolts());
		System.out.println("socketAdapterImpl.get12Volt() : "  + socketAdapterImpl.get12Volt().getVolts());
		System.out.println("socketAdapterImpl.get120Volt() : "  + socketAdapterImpl.get120Volt().getVolts());
	}

}

