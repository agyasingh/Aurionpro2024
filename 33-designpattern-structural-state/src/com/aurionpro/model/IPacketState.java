package com.aurionpro.model;

public interface IPacketState {
	
	void next(Packet packet);
	void current();
	void previous(Packet packet);

}
