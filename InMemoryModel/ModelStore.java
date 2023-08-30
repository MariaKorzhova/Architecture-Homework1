package InMemoryModel;

import ModelElements.*;

public class ModelStore implements IModelChanger {
    public int id;
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private IModelChangeObserver changeObserver;
    public static float Power = 0;

    public ModelStore(IModelChangeObserver changeObserver) {
        this.changeObserver = changeObserver;
        this.models = new PoligonalModel(new Poligon(new Point3D()), new Texture());
        this.cameras = new Camera(new Point3D(), new Angle3D());
        this.flashes = new Flash(new Point3D(), new Angle3D(), new Color(), Power);
        this.scenes = new Scene(this.id, this.models, this.flashes, this.cameras);
    }

    public Scene getScene(int n){
        return this.scenes;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
    
}