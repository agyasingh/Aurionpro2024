package com.aurionpro.test;

import com.aurionpro.model.Ordered;
import com.aurionpro.model.Packet;

public class PacketTest {
public static void main(String[] args) {
	Packet packet=new Packet(new Ordered());
	
	packet.printCurrentStatus();
	
	packet.goToNextState();
	
	packet.printCurrentStatus();
	
	packet.goToNextState();
	packet.printCurrentStatus();
}
}
