package api.datademo.calls;

import api.datademo.APICall;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            final List<Map<String,Object>> json = new ArrayList<>();
            final Map<String, Object> d1 = new HashMap<>();
            d1.put("id", 0);
            d1.put("bucket", "declan2");
            d1.put("live", true);
            d1.put("files", 2222);
            d1.put("batch", 33);
            d1.put("redShift", "mytable");
            json.add(d1);
            final Map<String, Object> d2 = new HashMap<>();
            d2.put("id", 1);
            d2.put("bucket", "paul");
            d2.put("live", false);
            d2.put("files", 3333);
            d2.put("batch", 44);
            d2.put("redShift", "rows");
            json.add(d2);
            return mapper.writeValueAsString(json);
        } catch (final JsonProcessingException e) {
            return e.toString();
        }
    }

}
