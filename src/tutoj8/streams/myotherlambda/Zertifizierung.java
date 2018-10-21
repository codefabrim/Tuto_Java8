package tutoj8.streams.myotherlambda;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 04.05.18
 * Time: 11:23
 * package : tutoj8.streams.myotherlambda
 * Responsability of classe :
 *
 */
public class Zertifizierung {

    private String name;
    private boolean succed;
    private String score;

    List<String> list;

    public Zertifizierung(String name, boolean succed, String score) {
        this.name = name;
        this.succed = succed;
        this.score = score;
    }

    public boolean isSucced() {
        return succed;
    }

    public String getName() {
        return name;
    }

    public String getScore() {
        return score;
    }
}
