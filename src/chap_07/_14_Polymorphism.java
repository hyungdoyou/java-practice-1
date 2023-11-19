package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;
import chap_07.camera.camera;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a person)
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)

        camera camera = new camera();
        camera factoryCam = new FactoryCam();
        camera speedCam = new SpeedCam();

//        camera.showMainFeature();
//        factoryCam.showMainFeature();
//        speedCam.showMainFeature();

        System.out.println("---------------------");
        camera[] cameras = new camera[3];
        cameras[0] = new camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("---------------------");

//        factoryCam.detectFire();
//        speedCam.checkSpeed();

        if (camera instanceof camera) {
            System.out.println("카메라 입니다.");
        }

        if (factoryCam instanceof FactoryCam) {    // detectFire 을 사용하기 위한 방법
            ((FactoryCam)factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam)speedCam).checkSpeed();
            ((SpeedCam)speedCam).recognizeLicensePlate();
        }
//        참고 내용
//        Object[] objs = new Object[3];
//        objs[0] = new camera();
//        objs[1] = new FactoryCam();
//        objs[2] = new SpeedCam();

    }
}
