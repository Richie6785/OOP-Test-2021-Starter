package ie.tudublin;

public class Note {
    private String note;
    private int duration;
    private float type;

    public Note()
    {

    
    }

    public Note(String note , int duration, float type)
    {
    this.note = note;
    this.duration = duration;
    this.type = type;

    }


    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public float getType() {
        return type;
    }

    public void setType(float type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Note [duration=" + duration + ", note=" + note + ", type=" + type + "]";
    }
}
