package com.aurionpro.model;

public class Packet {
    private IPacketState state;

   

    public Packet(IPacketState state) {
		super();
		this.state = state;
	}

	public IPacketState getState() {
        return state;
    }

    public void setState(IPacketState state) {
        this.state = state;
    }

    public void goToNextState() {
        state.next(this);
    }

    public void goToPreviousState() {
        state.previous(this);
    }

    public void printCurrentStatus() {
        state.current();
    }
}
