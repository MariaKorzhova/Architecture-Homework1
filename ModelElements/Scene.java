package ModelElements;

public class Scene {
    public int Id;
    public PoligonalModel Models;
    public Flash Flashes;
    public Camera Cameras;

    public Scene(int Id, PoligonalModel Models, Flash Flashes, Camera Cameras) {
        this.Models = Models;
        this.Flashes = Flashes;
        this.Cameras = Cameras;
        this.Id = Id;
    }

    public static <T> T method1(T type) {
        return type;
    }

    public static <T1, T2> T1 method2(T1 type1, T2 type2) {
        return type1;
    }
}