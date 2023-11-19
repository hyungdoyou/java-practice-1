package chap_07.camera;

public final class ActionCam extends camera {
    public final String lens; // = "광각렌즈"; // 어디에서도 lens의 값을 광각렌즈에서 다른걸로 변경할수가 없다!!!
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }
    public final void makeVideo() {
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
