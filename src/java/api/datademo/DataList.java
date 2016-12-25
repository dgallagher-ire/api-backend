package api.datademo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dgallagher
 */
public class DataList {
    
    private List<Data> list;
    
    public DataList(){
    }

    public List<Data> getList() {
        return list;
    }

    public void setList(List<Data> list) {
        this.list = list;
    }
    
    public static final void main(String[] args){
        final List<Data> list = new ArrayList<>();
        final Data d1 = new Data();
        d1.setId(0);
        d1.setBucket("declan");
        d1.setLive(true);
        d1.setFiles(2222);
        d1.setBatch(33);
        d1.setRedShift("mytable");
        list.add(d1);
        
        final DataList dl = new DataList();
        dl.setList(list);
        
        final ObjectMapper mapper = new ObjectMapper();
        try{
            System.out.println(mapper.writeValueAsString(dl));
        } catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
}
