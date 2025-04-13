package bg.tu_varna.sit.a1.f23621628;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        SessionManager sessionManager = new SessionManager();
        Session session= sessionManager.createSession();
        int sessionId = session.getId();
        System.out.println("Created session with ID: " + sessionId);
        sessionManager.loadImages(sessionId, Arrays.asList("img1.ppm","img2.pgm","img3.pbm"));
        sessionManager.sessionInfo(sessionId);
    }
}
