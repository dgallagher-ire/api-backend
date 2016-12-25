package api.datademo;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author dgallagher
 */
public interface APICall {
    
    public static final ObjectMapper mapper = new ObjectMapper();
    
    public void setInput(final String input);
    public void process();
    public String getOutput();
}
