package bg.tu_varna.sit.a1.f23621628;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SessionManager {
    private Map<Integer, Session> sessions = new HashMap<>();
    private int nextSessionId = 1;

    public Session createSession() {
        Session session = new Session(nextSessionId++);
        sessions.put(session.getId(), session);
        return session;
    }

    public Session getSession(int id) {
        return sessions.get(id);//
    }
    public void loadImages(int sessionId, List<String> imagePaths) {
        Session session = getSession(sessionId);
        if (session == null) {
            System.out.println("Error: Session " + sessionId + " does not exist!");
            return;
        }
        for (String path : imagePaths) {
            session.addImage(path);
            System.out.println("Image \"" + path + "\" added to session " + sessionId);
        }
    }
    public void sessionInfo(int sessionId) {
        Session session = getSession(sessionId);
        if (session == null) {
            System.out.println("Session not found.");
            return;
        }
        System.out.println("Session ID: " + session.getId());
        System.out.println("Images in session: " + String.join(", ", session.getImages()));
    }

}



