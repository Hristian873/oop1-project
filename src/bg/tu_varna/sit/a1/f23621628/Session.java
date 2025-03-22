package bg.tu_varna.sit.a1.f23621628;

import java.util.ArrayList;
import java.util.List;


public class Session {
    private int id;
    private List<String> images;

    public Session(int id) {
        this.id = id;
        this.images = new ArrayList<>();
    }

    public void addImage(String imagePath) {
        images.add(imagePath);
    }

    public int getId() {
        return id;
    }

    public List<String> getImages() {
        return images;
    }
}
