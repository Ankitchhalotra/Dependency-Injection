package com.ankit;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IdeaSim sim1 = new IdeaSim(1111);
		JioSim sim2 = new JioSim(2222);

		MobileApp mob = new MobileApp();
		mob.setNumber(sim2);
		mob.showData();
	}

}
