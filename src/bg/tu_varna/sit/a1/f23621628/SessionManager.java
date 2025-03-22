package bg.tu_varna.sit.a1.f23621628;

import java.util.HashMap;
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
        return sessions.get(id);
    }
}


