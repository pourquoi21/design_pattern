package com.in28minutes.oops;

public class MotorBikeRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        ducati.increaseSpeed(100);

        honda.increaseSpeed(100);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

        ducati.decreaseSpeed(80);
        honda.decreaseSpeed(50);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

//		int hondaSpeed = honda.getSpeed();
//		hondaSpeed += 100;
//		honda.setSpeed(hondaSpeed);
//		System.out.println(honda.getSpeed());
//		honda.setSpeed(80);
//		System.out.println(honda.getSpeed());

//		ducati.setSpeed(20);
//		honda.setSpeed(0);
    }

}
