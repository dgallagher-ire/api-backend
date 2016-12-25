package api.datademo.calls;

/**
 *
 * @author dgallagher
 */
public class Data {
    
    private int id;
    private String bucket;
    private boolean live;
    private int files;
    private int batch;
    private String redShift;
    
    public Data(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public int getFiles() {
        return files;
    }

    public void setFiles(int files) {
        this.files = files;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public String getRedShift() {
        return redShift;
    }

    public void setRedShift(String redShift) {
        this.redShift = redShift;
    }

}
