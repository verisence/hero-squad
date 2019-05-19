import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String mName;
    private String mCause;
    private String mMaximum;
    private static List<Squad> instances = new ArrayList<>();

    public Squad(String name, String cause, String maximum){
        mName = name;
        mCause = cause;
        mMaximum = maximum;
        instances.add(this);
    }

    public String getName(){
        return mName;
    }

    public String getCause(){
        return mCause;
    }

    public String getMax(){
        return mMaximum;
    }

    public static List<Squad> all() {
        return instances;
    }
}
