package api.datademo.calls;

import api.datademo.APICall;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dgallagher
 */
public class DataDemo implements APICall {

    @Override
    public final void setInput(final String input) {
        // process input
        int w = 0;
    }

    @Override
    public final void process() {
    }

    @Override
    public final String getOutput() {
        try {
            final List<Data> list = new ArrayList<>();
            final Data d1 = new Data();
            d1.setId(0);
            d1.setBucket("declan2");
            d1.setLive(true);
            d1.setFiles(2222);
            d1.setBatch(33);
            d1.setRedShift("mytable");
            list.add(d1);
            final DataList dl = new DataList();
            dl.setList(list);
            return mapper.writeValueAsString(dl);
        } catch (final JsonProcessingException e) {
            return e.toString();
        }
    }

}
